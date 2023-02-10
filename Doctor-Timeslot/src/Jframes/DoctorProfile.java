/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Jframes;

import doctor.timeslot.Client;
import doctor.timeslot.FileHandler;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ador
 */
public class DoctorProfile extends javax.swing.JFrame {

    int[][]cal;
    String file="";
    String us="";
    public void savePersonal(String wrt){
        System.out.println("CAME TO SAVE PERSONAL=>"+ Client.curr+".txt" +wrt);
        FileHandler.AddLineToFile(Client.curr+"app.txt" , wrt+"\n");
    }
    public void saveDoctor(String wrt){
        System.out.println("CAME TO SAVE PERSONAL=>"+ us+"app.txt" +wrt);
        FileHandler.AddLineToFile(us+"app.txt" , wrt+"\n");
    }
    
    public void write(){
                for(int i=0;i<5;i++){
                    StringBuilder sb= new StringBuilder();
            for(int j=0;j<5;j++){
                sb.append(cal[i][j]+"");
                
            }
            sb.append("\n");
            System.out.println(sb.toString());
            FileHandler.AddLineToFile(file,sb.toString());
    }
    }
    
    public void save() throws FileNotFoundException, IOException{
        
        System.out.println("====>"+file);
        PrintWriter writer = new PrintWriter(file);
writer.print("");
// other operations
writer.close();
write();
    
    }
    /**
     * Creates new form DoctorProfile
     */
    public DoctorProfile() {
        initComponents();
    }
    
    public DoctorProfile( int[][]arr,String u) {
        initComponents();
        us=u;
        ArrayList<String >lines= FileHandler.ShowFileLines("doctors.txt");
        System.out.println(u);
        for(String line:lines){
            System.out.println(line);
                    try{
                        if(line.split(":",4)[1].equals(u)){
                            System.out.println("Here");
                            String f=line.split(":",4)[0];
                            String s=line.split(":",4)[3];
                fn.setText(fn.getText()+":"+f);
                spc.setText(spc.getText()+":"+s);
                file=u+".txt";
            }
        }
        catch(Exception e){
            
        }

        }
        for(int i=0;i<5;i++){
            for(int j =0;j<5;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        cal=arr;
        
        
        
        
        //here
        mon0.setBackground(arr[0][0]==0?Color.GREEN: Color.RED);
        if(arr[0][0]==1){
            mon0.setText("Booked");
        }
        else{
        mon0.setText("  Book  ");
        }
        
        mon1.setBackground(arr[0][1]==0?Color.GREEN: Color.RED);
        if(arr[0][1]==1){
            mon1.setText("Booked");
        }
        else{
        mon1.setText("  Book  ");
        }
        
        
                
        mon2.setBackground(arr[0][2]==0?Color.GREEN: Color.RED);
        if(arr[0][2]==1){
            mon2.setText("Booked");
        }
        else{
        mon2.setText("  Book  ");
        }
        
        
                
        mon3.setBackground(arr[0][3]==0?Color.GREEN: Color.RED);
        if(arr[0][3]==1){
            mon3.setText("Booked");
        }
        else{
        mon3.setText("  Book ");
        }
        
        
                
        mon4.setBackground(arr[0][4]==0?Color.GREEN: Color.RED);
        if(arr[0][4]==1){
            mon4.setText("Booked");
        }
        else{
        mon4.setText("  Book  ");
        }
        
        
        
        
        tue0.setBackground(arr[1][0]==0?Color.GREEN: Color.RED);
        if(arr[1][0]==1){
            tue0.setText("Booked");
        }
        else{
        tue0.setText("  Book  ");
        }
        
        
        tue1.setBackground(arr[1][1]==0?Color.GREEN: Color.RED);
        if(arr[1][1]==1){
            tue1.setText("Booked");
        }
        else{
        tue1.setText("  Book  ");
        }
        
        
        tue2.setBackground(arr[1][2]==0?Color.GREEN: Color.RED);
        if(arr[1][2]==1){
            tue2.setText("Booked");
        }
        else{
        tue2.setText("  Book  ");
        }
        
        
        tue3.setBackground(arr[1][3]==0?Color.GREEN: Color.RED);
        if(arr[1][3]==1){
            tue3.setText("Booked");
        }
        else{
        tue3.setText("  Book  ");
        }
        
        
        tue4.setBackground(arr[1][4]==0?Color.GREEN: Color.RED);
        if(arr[1][4]==1){
            tue4.setText("Booked");
        }
        else{
        tue4.setText("  Book  ");
        }
        
        
        wed0.setBackground(arr[2][0]==0?Color.GREEN: Color.RED);
        if(arr[2][0]==1){
            wed0.setText("Booked");
        }
        else{
        wed0.setText("  Book  ");
        }
        
        
        
        wed1.setBackground(arr[2][1]==0?Color.GREEN: Color.RED);
        if(arr[2][1]==1){
            wed1.setText("Booked");
        }
        else{
        wed1.setText("  Book  ");
        }
        
        
        
        wed2.setBackground(arr[2][2]==0?Color.GREEN: Color.RED);
        if(arr[2][2]==1){
            wed2.setText("Booked");
        }
        else{
        wed2.setText("  Book  ");
        }
        
        
        
        wed3.setBackground(arr[2][3]==0?Color.GREEN: Color.RED);
        if(arr[2][3]==1){
            wed3.setText("Booked");
        }
        else{
        wed3.setText("  Book  ");
        }
        
        
        wed4.setBackground(arr[2][4]==0?Color.GREEN: Color.RED);
        if(arr[2][4]==1){
            wed4.setText("Booked");
        }
        else{
        wed4.setText("  Book  ");
        }
        
        
        
        thu0.setBackground(arr[3][0]==0?Color.GREEN: Color.RED);
        if(arr[3][0]==1){
            thu0.setText("Booked");
        }
        else{
        thu0.setText("  Book  ");
        }
        
        
        
        thu1.setBackground(arr[3][1]==0?Color.GREEN: Color.RED);
        if(arr[3][1]==1){
            thu1.setText("Booked");
        }
        else{
        thu1.setText("  Book  ");
        }
        
        
        
        thu2.setBackground(arr[3][2]==0?Color.GREEN: Color.RED);
        if(arr[3][2]==1){
            thu2.setText("Booked");
        }
        else{
        thu2.setText("  Book  ");
        }
        
        
        
        
        thu3.setBackground(arr[3][3]==0?Color.GREEN: Color.RED);
        if(arr[3][3]==1){
            thu3.setText("Booked");
        }
        else{
        thu3.setText("  Book  ");
        }
        
        
        
        
        thu4.setBackground(arr[3][4]==0?Color.GREEN: Color.RED);
        if(arr[3][4]==1){
            thu4.setText("Booked");
        }
        else{
        thu4.setText("  Book  ");
        }
        
        
        
        
        
        fri0.setBackground(arr[4][0]==0?Color.GREEN: Color.RED);
        if(arr[4][0]==1){
            fri0.setText("Booked");
        }
        else{
        fri0.setText("  Book  ");
        }
        
        
        
        fri1.setBackground(arr[4][1]==0?Color.GREEN: Color.RED);
        if(arr[4][1]==1){
            fri1.setText("Booked");
        }
        else{
        fri1.setText("  Book  ");
        }
        
        
        
        
        fri2.setBackground(arr[4][2]==0?Color.GREEN: Color.RED);
        if(arr[4][2]==1){
            fri2.setText("Booked");
        }
        else{
        fri2.setText("  Book  ");
        }
        
        
        
        
        fri3.setBackground(arr[4][3]==0?Color.GREEN: Color.RED);
        if(arr[4][3]==1){
            fri3.setText("Booked");
        }
        else{
        fri3.setText("  Book  ");
        }
        
        
        
        
        fri4.setBackground(arr[4][4]==0?Color.GREEN: Color.RED);
        if(arr[4][4]==1){
            fri4.setText("Booked");
        }
        else{
        fri4.setText("  Book  ");
        }
        
        
        
    }
    public DoctorProfile( int[][]arr,String u,boolean fl) {
        initComponents();
        us=u;
        jButton1.setVisible(false);
        issue.setVisible(false);
        ArrayList<String >lines= FileHandler.ShowFileLines("doctors.txt");
        System.out.println(u);
        for(String line:lines){
            System.out.println(line);
                    try{
                        if(line.split(":",4)[1].equals(u)){
                            System.out.println("Here");
                            String f=line.split(":",4)[0];
                            String s=line.split(":",4)[3];
                fn.setText(fn.getText()+":"+f);
                spc.setText(spc.getText()+":"+s);
                file=u+".txt";
            }
        }
        catch(Exception e){
            
        }

        }
        for(int i=0;i<5;i++){
            for(int j =0;j<5;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        cal=arr;
        
        
        
        
        //here
        mon0.setBackground(arr[0][0]==0?Color.GREEN: Color.RED);
        if(arr[0][0]==1){
            mon0.setText("Booked");
        }
        else{
        mon0.setText("  Book  ");
        }
        
        mon1.setBackground(arr[0][1]==0?Color.GREEN: Color.RED);
        if(arr[0][1]==1){
            mon1.setText("Booked");
        }
        else{
        mon1.setText("  Book  ");
        }
        
        
                
        mon2.setBackground(arr[0][2]==0?Color.GREEN: Color.RED);
        if(arr[0][2]==1){
            mon2.setText("Booked");
        }
        else{
        mon2.setText("  Book  ");
        }
        
        
                
        mon3.setBackground(arr[0][3]==0?Color.GREEN: Color.RED);
        if(arr[0][3]==1){
            mon3.setText("Booked");
        }
        else{
        mon3.setText("  Book ");
        }
        
        
                
        mon4.setBackground(arr[0][4]==0?Color.GREEN: Color.RED);
        if(arr[0][4]==1){
            mon4.setText("Booked");
        }
        else{
        mon4.setText("  Book  ");
        }
        
        
        
        
        tue0.setBackground(arr[1][0]==0?Color.GREEN: Color.RED);
        if(arr[1][0]==1){
            tue0.setText("Booked");
        }
        else{
        tue0.setText("  Book  ");
        }
        
        
        tue1.setBackground(arr[1][1]==0?Color.GREEN: Color.RED);
        if(arr[1][1]==1){
            tue1.setText("Booked");
        }
        else{
        tue1.setText("  Book  ");
        }
        
        
        tue2.setBackground(arr[1][2]==0?Color.GREEN: Color.RED);
        if(arr[1][2]==1){
            tue2.setText("Booked");
        }
        else{
        tue2.setText("  Book  ");
        }
        
        
        tue3.setBackground(arr[1][3]==0?Color.GREEN: Color.RED);
        if(arr[1][3]==1){
            tue3.setText("Booked");
        }
        else{
        tue3.setText("  Book  ");
        }
        
        
        tue4.setBackground(arr[1][4]==0?Color.GREEN: Color.RED);
        if(arr[1][4]==1){
            tue4.setText("Booked");
        }
        else{
        tue4.setText("  Book  ");
        }
        
        
        wed0.setBackground(arr[2][0]==0?Color.GREEN: Color.RED);
        if(arr[2][0]==1){
            wed0.setText("Booked");
        }
        else{
        wed0.setText("  Book  ");
        }
        
        
        
        wed1.setBackground(arr[2][1]==0?Color.GREEN: Color.RED);
        if(arr[2][1]==1){
            wed1.setText("Booked");
        }
        else{
        wed1.setText("  Book  ");
        }
        
        
        
        wed2.setBackground(arr[2][2]==0?Color.GREEN: Color.RED);
        if(arr[2][2]==1){
            wed2.setText("Booked");
        }
        else{
        wed2.setText("  Book  ");
        }
        
        
        
        wed3.setBackground(arr[2][3]==0?Color.GREEN: Color.RED);
        if(arr[2][3]==1){
            wed3.setText("Booked");
        }
        else{
        wed3.setText("  Book  ");
        }
        
        
        wed4.setBackground(arr[2][4]==0?Color.GREEN: Color.RED);
        if(arr[2][4]==1){
            wed4.setText("Booked");
        }
        else{
        wed4.setText("  Book  ");
        }
        
        
        
        thu0.setBackground(arr[3][0]==0?Color.GREEN: Color.RED);
        if(arr[3][0]==1){
            thu0.setText("Booked");
        }
        else{
        thu0.setText("  Book  ");
        }
        
        
        
        thu1.setBackground(arr[3][1]==0?Color.GREEN: Color.RED);
        if(arr[3][1]==1){
            thu1.setText("Booked");
        }
        else{
        thu1.setText("  Book  ");
        }
        
        
        
        thu2.setBackground(arr[3][2]==0?Color.GREEN: Color.RED);
        if(arr[3][2]==1){
            thu2.setText("Booked");
        }
        else{
        thu2.setText("  Book  ");
        }
        
        
        
        
        thu3.setBackground(arr[3][3]==0?Color.GREEN: Color.RED);
        if(arr[3][3]==1){
            thu3.setText("Booked");
        }
        else{
        thu3.setText("  Book  ");
        }
        
        
        
        
        thu4.setBackground(arr[3][4]==0?Color.GREEN: Color.RED);
        if(arr[3][4]==1){
            thu4.setText("Booked");
        }
        else{
        thu4.setText("  Book  ");
        }
        
        
        
        
        
        fri0.setBackground(arr[4][0]==0?Color.GREEN: Color.RED);
        if(arr[4][0]==1){
            fri0.setText("Booked");
        }
        else{
        fri0.setText("  Book  ");
        }
        
        
        
        fri1.setBackground(arr[4][1]==0?Color.GREEN: Color.RED);
        if(arr[4][1]==1){
            fri1.setText("Booked");
        }
        else{
        fri1.setText("  Book  ");
        }
        
        
        
        
        fri2.setBackground(arr[4][2]==0?Color.GREEN: Color.RED);
        if(arr[4][2]==1){
            fri2.setText("Booked");
        }
        else{
        fri2.setText("  Book  ");
        }
        
        
        
        
        fri3.setBackground(arr[4][3]==0?Color.GREEN: Color.RED);
        if(arr[4][3]==1){
            fri3.setText("Booked");
        }
        else{
        fri3.setText("  Book  ");
        }
        
        
        
        
        fri4.setBackground(arr[4][4]==0?Color.GREEN: Color.RED);
        if(arr[4][4]==1){
            fri4.setText("Booked");
        }
        else{
        fri4.setText("  Book  ");
        }
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mon0 = new javax.swing.JButton();
        mon1 = new javax.swing.JButton();
        mon2 = new javax.swing.JButton();
        mon3 = new javax.swing.JButton();
        mon4 = new javax.swing.JButton();
        tue0 = new javax.swing.JButton();
        tue4 = new javax.swing.JButton();
        tue1 = new javax.swing.JButton();
        tue2 = new javax.swing.JButton();
        tue3 = new javax.swing.JButton();
        wed0 = new javax.swing.JButton();
        thu0 = new javax.swing.JButton();
        thu1 = new javax.swing.JButton();
        wed1 = new javax.swing.JButton();
        wed2 = new javax.swing.JButton();
        thu2 = new javax.swing.JButton();
        wed3 = new javax.swing.JButton();
        thu3 = new javax.swing.JButton();
        wed4 = new javax.swing.JButton();
        thu4 = new javax.swing.JButton();
        fri0 = new javax.swing.JButton();
        fri1 = new javax.swing.JButton();
        fri2 = new javax.swing.JButton();
        fri3 = new javax.swing.JButton();
        fri4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fn = new javax.swing.JLabel();
        spc = new javax.swing.JLabel();
        issue = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mon0.setText("jButton1");
        mon0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mon0ActionPerformed(evt);
            }
        });

        mon1.setText("jButton2");
        mon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mon1ActionPerformed(evt);
            }
        });

        mon2.setText("jButton3");
        mon2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mon2ActionPerformed(evt);
            }
        });

        mon3.setText("jButton4");
        mon3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mon3ActionPerformed(evt);
            }
        });

        mon4.setText("jButton5");
        mon4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mon4ActionPerformed(evt);
            }
        });

        tue0.setText("jButton1");
        tue0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tue0ActionPerformed(evt);
            }
        });

        tue4.setText("jButton5");
        tue4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tue4ActionPerformed(evt);
            }
        });

        tue1.setText("jButton2");
        tue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tue1ActionPerformed(evt);
            }
        });

        tue2.setText("jButton3");
        tue2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tue2ActionPerformed(evt);
            }
        });

        tue3.setText("jButton4");
        tue3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tue3ActionPerformed(evt);
            }
        });

        wed0.setText("jButton1");
        wed0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wed0ActionPerformed(evt);
            }
        });

        thu0.setText("jButton1");
        thu0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thu0ActionPerformed(evt);
            }
        });

        thu1.setText("jButton2");
        thu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thu1ActionPerformed(evt);
            }
        });

        wed1.setText("jButton2");
        wed1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wed1ActionPerformed(evt);
            }
        });

        wed2.setText("jButton3");
        wed2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wed2ActionPerformed(evt);
            }
        });

        thu2.setText("jButton3");
        thu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thu2ActionPerformed(evt);
            }
        });

        wed3.setText("jButton4");
        wed3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wed3ActionPerformed(evt);
            }
        });

        thu3.setText("jButton4");
        thu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thu3ActionPerformed(evt);
            }
        });

        wed4.setText("jButton5");
        wed4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wed4ActionPerformed(evt);
            }
        });

        thu4.setText("jButton5");
        thu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thu4ActionPerformed(evt);
            }
        });

        fri0.setText("jButton1");
        fri0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fri0ActionPerformed(evt);
            }
        });

        fri1.setText("jButton2");
        fri1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fri1ActionPerformed(evt);
            }
        });

        fri2.setText("jButton3");
        fri2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fri2ActionPerformed(evt);
            }
        });

        fri3.setText("jButton4");
        fri3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fri3ActionPerformed(evt);
            }
        });

        fri4.setText("jButton5");
        fri4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fri4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Monday");

        jLabel2.setText("Thursday");

        jLabel3.setText("Friday");

        jLabel4.setText("Tuesday");

        jLabel5.setText("Wednesday");

        jLabel6.setText("1pm-2pm");

        jLabel7.setText("2pm-3pm");

        jLabel8.setText("3pm-4pm");

        jLabel9.setText("4pm-5pm");

        jLabel10.setText("5pm-6pm");

        fn.setText("Fullname");

        spc.setText("Speciality");

        issue.setText("write your issue here");
        issue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueActionPerformed(evt);
            }
        });

        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(spc, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel8)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel9)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel10))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel1)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fri0)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fri1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fri2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fri3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fri4))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(thu0)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(thu1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(thu2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(thu3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(thu4))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(wed0)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(wed1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(wed2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(wed3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(wed4))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(tue0)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tue1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tue2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tue3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tue4))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(mon0)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(mon1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(mon2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(mon3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(mon4)))
                            .addComponent(issue, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fn)
                            .addComponent(spc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mon0)
                    .addComponent(mon1)
                    .addComponent(mon2)
                    .addComponent(mon3)
                    .addComponent(mon4)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tue0)
                    .addComponent(tue1)
                    .addComponent(tue2)
                    .addComponent(tue3)
                    .addComponent(tue4)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wed0)
                    .addComponent(wed1)
                    .addComponent(wed2)
                    .addComponent(wed3)
                    .addComponent(wed4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thu0)
                    .addComponent(thu1)
                    .addComponent(thu2)
                    .addComponent(thu3)
                    .addComponent(thu4)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fri0)
                    .addComponent(fri1)
                    .addComponent(fri2)
                    .addComponent(fri3)
                    .addComponent(fri4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(issue, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mon0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mon0ActionPerformed
        // TODO add your handling code here:
        if(mon0.getText().contains("Booked")){
            JOptionPane.showMessageDialog(null,
                    "Slot not available");
        }
        else{
            cal[0][0]=1;
                        try{
                            String time="Monday 1pm- 2pm";
                            String write=time+":"+Client.curr+":"+issue.getText();
                            savePersonal(write);
                            saveDoctor(write);
                            save();
                new DoctorProfile(cal,us).setVisible(true);
                this.setVisible(false);
            }
            catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_mon0ActionPerformed

    private void mon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mon1ActionPerformed
        // TODO add your handling code here:
                if(mon1.getText().contains("Booked")){
            JOptionPane.showMessageDialog(null,
                    "Slot not available");
        }
        else{
            cal[0][1]=1;

                        try{
                            String time="Monday 2pm- 3pm";
                            String write=time+":"+Client.curr+":"+issue.getText();
                            savePersonal(write);
                            saveDoctor(write);
                            save();
                new DoctorProfile(cal,us).setVisible(true);
                this.setVisible(false);
            }
            catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_mon1ActionPerformed

    private void mon2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mon2ActionPerformed
        // TODO add your handling code here:
                if(mon2.getText().contains("Booked")){
            JOptionPane.showMessageDialog(null,
                    "Slot not available");
        }
        else{
            cal[0][2]=1;
                        try{
                save();
                
                
                String time="Monday 3pm- 4pm";
                            String write=time+":"+Client.curr+":"+issue.getText();
                            savePersonal(write);
                            saveDoctor(write);
                            save();
                
                
                
                new DoctorProfile(cal,us).setVisible(true);
                this.setVisible(false);
            }
            catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_mon2ActionPerformed

    private void mon3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mon3ActionPerformed
                if(mon3.getText().contains("Booked")){
            JOptionPane.showMessageDialog(null,
                    "Slot not available");
        }
        else{
            cal[0][3]=1;
                        try{
                                
                
                String time="Monday 4pm- 5pm";
                            String write=time+":"+Client.curr+":"+issue.getText();
                            savePersonal(write);
                            saveDoctor(write);
                            save();
                new DoctorProfile(cal,us).setVisible(true);
                this.setVisible(false);
            }
            catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_mon3ActionPerformed

    private void mon4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mon4ActionPerformed
                if(mon4.getText().contains("Booked")){
            JOptionPane.showMessageDialog(null,
                    "Slot not available");
        }
        else{
            cal[0][4]=1;
                        try{
                                
                
                String time="Monday 5pm- 6pm";
                            String write=time+":"+Client.curr+":"+issue.getText();
                            savePersonal(write);
                            saveDoctor(write);
                            save();
                new DoctorProfile(cal,us).setVisible(true);
                this.setVisible(false);
            }
            catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_mon4ActionPerformed

    private void tue0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tue0ActionPerformed
                if(tue0.getText().contains("Booked")){
            JOptionPane.showMessageDialog(null,
                    "Slot not available");
        }
        else{
            cal[1][0]=1;
                        try{
                                
                
                String time="Tuesday 1pm- 2pm";
                            String write=time+":"+Client.curr+":"+issue.getText();
                            savePersonal(write);
                            saveDoctor(write);
                            save();
                new DoctorProfile(cal,us).setVisible(true);
                this.setVisible(false);
            }
            catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_tue0ActionPerformed

    private void tue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tue1ActionPerformed
                if(tue1.getText().contains("Booked")){
            JOptionPane.showMessageDialog(null,
                    "Slot not available");
        }
        else{
            cal[1][1]=1;
                        try{
                String time="Tuesday 2pm- 3pm";
                            String write=time+":"+Client.curr+":"+issue.getText();
                            savePersonal(write);
                            saveDoctor(write);
                            save();
                new DoctorProfile(cal,us).setVisible(true);
                this.setVisible(false);
            }
            catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_tue1ActionPerformed

    private void tue2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tue2ActionPerformed
                if(tue2.getText().contains("Booked")){
            JOptionPane.showMessageDialog(null,
                    "Slot not available");
        }
        else{
            cal[1][2]=1;
                        try{
                String time="Tuesday 3pm- 4pm";
                            String write=time+":"+Client.curr+":"+issue.getText();
                            savePersonal(write);
                            saveDoctor(write);
                            save();
                new DoctorProfile(cal,us).setVisible(true);
                this.setVisible(false);
            }
            catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_tue2ActionPerformed

    private void tue3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tue3ActionPerformed
                if(tue3.getText().contains("Booked")){
            JOptionPane.showMessageDialog(null,
                    "Slot not available");
        }
        else{
            cal[1][3]=1;
                        try{
                String time="Tuesday 4pm- 5pm";
                            String write=time+":"+Client.curr+":"+issue.getText();
                            savePersonal(write);
                            saveDoctor(write);
                            save();
                new DoctorProfile(cal,us).setVisible(true);
                this.setVisible(false);
            }
            catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_tue3ActionPerformed

    private void tue4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tue4ActionPerformed
                if(tue4.getText().contains("Booked")){
            JOptionPane.showMessageDialog(null,
                    "Slot not available");
        }
        else{
            cal[1][4]=1;
                        try{
                String time="Tuesday 5pm- 6pm";
                            String write=time+":"+Client.curr+":"+issue.getText();
                            savePersonal(write);
                            saveDoctor(write);
                            save();
                new DoctorProfile(cal,us).setVisible(true);
                this.setVisible(false);
            }
            catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_tue4ActionPerformed

    private void wed0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wed0ActionPerformed
                if(wed0.getText().contains("Booked")){
            JOptionPane.showMessageDialog(null,
                    "Slot not available");
        }
        else{
            cal[2][0]=1;
                        try{
                String time="Wed day 1pm- 2pm";
                            String write=time+":"+Client.curr+":"+issue.getText();
                            savePersonal(write);
                            saveDoctor(write);
                            save();
                new DoctorProfile(cal,us).setVisible(true);
                this.setVisible(false);
            }
            catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_wed0ActionPerformed

    private void wed1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wed1ActionPerformed
        if(wed1.getText().contains("Booked")){
            JOptionPane.showMessageDialog(null,
                    "Slot not available");
        }
        else{
            cal[2][1]=1;
                        try{
                String time="Wed day 2pm- 3pm";
                            String write=time+":"+Client.curr+":"+issue.getText();
                            savePersonal(write);
                            saveDoctor(write);
                            save();
                new DoctorProfile(cal,us).setVisible(true);
                this.setVisible(false);
            }
            catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_wed1ActionPerformed

    private void wed2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wed2ActionPerformed
        if(wed2.getText().contains("Booked")){
            JOptionPane.showMessageDialog(null,
                    "Slot not available");
        }
        else{
            cal[2][2]=1;
                        try{
                String time="Wed day 3pm- 4pm";
                            String write=time+":"+Client.curr+":"+issue.getText();
                            savePersonal(write);
                            saveDoctor(write);
                            save();
                new DoctorProfile(cal,us).setVisible(true);
                this.setVisible(false);
            }
            catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_wed2ActionPerformed

    private void wed3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wed3ActionPerformed
        if(wed3.getText().contains("Booked")){
            JOptionPane.showMessageDialog(null,
                    "Slot not available");
        }
        else{
            cal[2][3]=1;
                        try{
                String time="Wed day 4pm- 5pm";
                            String write=time+":"+Client.curr+":"+issue.getText();
                            savePersonal(write);
                            saveDoctor(write);
                            save();
                new DoctorProfile(cal,us).setVisible(true);
                this.setVisible(false);
            }
            catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_wed3ActionPerformed

    private void wed4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wed4ActionPerformed
        if(wed4.getText().contains("Booked")){
            JOptionPane.showMessageDialog(null,
                    "Slot not available");
        }
        else{
            cal[2][4]=1;
                        try{
                String time="Wed day 5pm- 6pm";
                            String write=time+":"+Client.curr+":"+issue.getText();
                            savePersonal(write);
                            saveDoctor(write);
                            save();
                new DoctorProfile(cal,us).setVisible(true);
                this.setVisible(false);
            }
            catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_wed4ActionPerformed

    private void thu0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thu0ActionPerformed
        if(thu0.getText().contains("Booked")){
            JOptionPane.showMessageDialog(null,
                    "Slot not available");
        }
        else{
            cal[3][0]=1;
                        try{
                String time="Thursday 1pm- 2pm";
                            String write=time+":"+Client.curr+":"+issue.getText();
                            savePersonal(write);
                            saveDoctor(write);
                            save();
                new DoctorProfile(cal,us).setVisible(true);
                this.setVisible(false);
            }
            catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_thu0ActionPerformed

    private void thu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thu1ActionPerformed
        if(thu1.getText().contains("Booked")){
            JOptionPane.showMessageDialog(null,
                    "Slot not available");
        }
        else{
            cal[3][1]=1;
                        try{
                String time="Thursday 2pm- 3pm";
                            String write=time+":"+Client.curr+":"+issue.getText();
                            savePersonal(write);
                            saveDoctor(write);
                            save();
                new DoctorProfile(cal,us).setVisible(true);
                this.setVisible(false);
            }
            catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_thu1ActionPerformed

    private void thu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thu2ActionPerformed
        if(thu2.getText().contains("Booked")){
            JOptionPane.showMessageDialog(null,
                    "Slot not available");
        }
        else{
            cal[3][2]=1;
                        try{
                String time="Thursday 3pm- 4pm";
                            String write=time+":"+Client.curr+":"+issue.getText();
                            savePersonal(write);
                            saveDoctor(write);
                            save();
                new DoctorProfile(cal,us).setVisible(true);
                this.setVisible(false);
            }
            catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_thu2ActionPerformed

    private void thu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thu3ActionPerformed
        if(thu4.getText().contains("Booked")){
            JOptionPane.showMessageDialog(null,
                    "Slot not available");
        }
        else{
            cal[3][3]=1;
                        try{
                String time="Thursday 4pm- 5pm";
                            String write=time+":"+Client.curr+":"+issue.getText();
                            savePersonal(write);
                            saveDoctor(write);
                            save();
                new DoctorProfile(cal,us).setVisible(true);
                this.setVisible(false);
            }
            catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_thu3ActionPerformed

    private void thu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thu4ActionPerformed
        if(thu4.getText().contains("Booked")){
            JOptionPane.showMessageDialog(null,
                    "Slot not available");
        }
        else{
            cal[3][4]=1;
                        try{
                String time="Thursday 5pm- 6pm";
                            String write=time+":"+Client.curr+":"+issue.getText();
                            savePersonal(write);
                            saveDoctor(write);
                            save();
                new DoctorProfile(cal,us).setVisible(true);
                this.setVisible(false);
            }
            catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_thu4ActionPerformed

    private void fri0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fri0ActionPerformed
        if(fri0.getText().contains("Booked")){
            JOptionPane.showMessageDialog(null,
                    "Slot not available");
        }
        else{
            cal[4][0]=1;
                        try{
                String time="Friday 1pm- 2pm";
                            String write=time+":"+Client.curr+":"+issue.getText();
                            savePersonal(write);
                            saveDoctor(write);
                            save();
                new DoctorProfile(cal,us).setVisible(true);
                this.setVisible(false);
            }
            catch(Exception e){
                
            }
   
        }
    }//GEN-LAST:event_fri0ActionPerformed

    private void fri1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fri1ActionPerformed
        if(fri1.getText().contains("Booked")){
            JOptionPane.showMessageDialog(null,
                    "Slot not available");
        }
        else{
            cal[4][1]=1;
                        try{
                String time="Friday 2pm- 3pm";
                            String write=time+":"+Client.curr+":"+issue.getText();
                            savePersonal(write);
                            saveDoctor(write);
                            save();
                new DoctorProfile(cal,us).setVisible(true);
                this.setVisible(false);
            }
            catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_fri1ActionPerformed

    private void fri2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fri2ActionPerformed
        if(fri2.getText().contains("Booked")){
            JOptionPane.showMessageDialog(null,
                    "Slot not available");
        }
        else{
            cal[4][2]=1;
                        try{
                String time="Friday 3pm- 4pm";
                            String write=time+":"+Client.curr+":"+issue.getText();
                            savePersonal(write);
                            saveDoctor(write);
                            save();
                new DoctorProfile(cal,us).setVisible(true);
                this.setVisible(false);
            }
            catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_fri2ActionPerformed

    private void fri3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fri3ActionPerformed
        if(fri3.getText().contains("Booked")){
            JOptionPane.showMessageDialog(null,
                    "Slot not available");
        }
        else{
            cal[4][3]=1;
                                    try{
                String time="Friday 4pm- 5pm";
                            String write=time+":"+Client.curr+":"+issue.getText();
                            savePersonal(write);
                            saveDoctor(write);
                            save();
                new DoctorProfile(cal,us).setVisible(true);
                this.setVisible(false);
            }
            catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_fri3ActionPerformed

    private void fri4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fri4ActionPerformed
        if(fri4.getText().contains("Booked")){
            JOptionPane.showMessageDialog(null,
                    "Slot not available");
        }
        else{
            cal[4][4]=1;
            try{
                String time="Friday 5pm- 6pm";
                            String write=time+":"+Client.curr+":"+issue.getText();
                            savePersonal(write);
                            saveDoctor(write);
                            save();
                new DoctorProfile(cal,us).setVisible(true);
                this.setVisible(false);
            }
            catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_fri4ActionPerformed

    private void issueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_issueActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new ClientHome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DoctorProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fn;
    private javax.swing.JButton fri0;
    private javax.swing.JButton fri1;
    private javax.swing.JButton fri2;
    private javax.swing.JButton fri3;
    private javax.swing.JButton fri4;
    private javax.swing.JTextField issue;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton mon0;
    private javax.swing.JButton mon1;
    private javax.swing.JButton mon2;
    private javax.swing.JButton mon3;
    private javax.swing.JButton mon4;
    private javax.swing.JLabel spc;
    private javax.swing.JButton thu0;
    private javax.swing.JButton thu1;
    private javax.swing.JButton thu2;
    private javax.swing.JButton thu3;
    private javax.swing.JButton thu4;
    private javax.swing.JButton tue0;
    private javax.swing.JButton tue1;
    private javax.swing.JButton tue2;
    private javax.swing.JButton tue3;
    private javax.swing.JButton tue4;
    private javax.swing.JButton wed0;
    private javax.swing.JButton wed1;
    private javax.swing.JButton wed2;
    private javax.swing.JButton wed3;
    private javax.swing.JButton wed4;
    // End of variables declaration//GEN-END:variables
}
