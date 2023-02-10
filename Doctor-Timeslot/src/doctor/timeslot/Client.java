/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doctor.timeslot;

/**
 *
 * @author Ador
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Client {
    String fullname,username,password,age;
    public static String curr="";

    public Client(String fullname, String username, String password, String age) {
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.age = age;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return fullname+":"+username+":"+password+":"+age+"\n";
    }
    public boolean SignUp(){
        try {
            File myObj = new File("clients.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        ArrayList<String> Users = FileHandler.ShowFileLines("clients.txt");
        boolean duplicate = false;
        for (String item: Users){
            if(item.split(":")[1].equals(getUsername())){
                duplicate= true;
                return false;
            }
        }
        FileHandler.AddLineToFile("clients.txt", this.toString());
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
        return true;
    }



    public static boolean Login (String u, String p) {
        try {
            File myObj = new File("clients.txt");
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
        ArrayList<String> Users = FileHandler.ShowFileLines("clients.txt");
        System.out.println(Users);
        for(String temp: Users){
            try{
                        String user= temp.split(":",4)[1];
            String pass= temp.split(":",4)[2];
            if(u.equals(user) && p.equals(pass)){
                curr=user;
                return true;
            }
            }
            catch(Exception e){
                continue;
            }

        }
        return false;
    }
}
