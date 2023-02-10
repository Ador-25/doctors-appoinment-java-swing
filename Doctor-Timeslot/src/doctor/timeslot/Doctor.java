/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doctor.timeslot;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Ador
 */
public class Doctor {
    String fullname,username,password,speciality;
    public static String curr="";

    public Doctor(String fullname, String username, String password, String speciality) {
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.speciality = speciality;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return fullname+":"+username+":"+password+":"+speciality+"\n";
    }
    public boolean SignUp(){
        try {
      File myObj = new File("doctors.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
        
        ArrayList<String> Users = FileHandler.ShowFileLines("doctors.txt");
        boolean duplicate = false;
        for (String item: Users){
            if(item.length()<3)
                continue;
            if(item.split(":")[1].equals(getUsername())){
                duplicate= true;
                return false;
            }
        }
        FileHandler.AddLineToFile("doctors.txt", this.toString());
                try {
      File myObj = new File(this.getUsername()+".txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
                
                      try {
      File myObj = new File(this.getUsername()+"app.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
       for(int i=0;i<5;i++){
       FileHandler.AddLineToFile(this.getUsername()+".txt", "00000");
       }
        return true;
    }
    
    
    
        public static boolean Login (String u, String p) {
            try {
      File myObj = new File("doctors.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
            System.out.println(u);
            System.out.println(p);
        ArrayList<String> Users = FileHandler.ShowFileLines("doctors.txt");
        System.out.println(Users);
        for(String temp: Users){
            String user= temp.split(":",4)[1];
            String pass= temp.split(":",4)[2];
            if(u.equals(user) && p.equals(pass)){
                curr=user;
                return true;
            }
        }
        return false;
    }
    
}
