/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doctor.timeslot;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author Ador
 */
public class FileHandler {
    public static void CreateFile(String str){

    try {
      File myObj = new File(str+".txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }
    public static boolean AddLineToFile(String filename, String line){
        PrintWriter printWriter = null;
        File file = new File(filename);
        try {
            if (!file.exists()) file.createNewFile();
            printWriter = new PrintWriter(new FileOutputStream(filename, true));
            printWriter.write("\n"+line);
            return true;
        } catch (IOException ioex) {
            ioex.printStackTrace();
        } finally {
            if (printWriter != null) {
                printWriter.flush();
                printWriter.close();
            }
        }
        return false;
    }
    public static ArrayList<String> ShowFileLines(String filename){
        ArrayList<String>list = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filename));
            String line = reader.readLine();
            while (line != null) {
                list.add(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
