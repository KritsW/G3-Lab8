/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8;

/**
 *
 * @author LENOVO
 */


import java.io.*;

public class Homework8 {
    
    
    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("file1.csv")); // อ่านไฟล์ชื่อ ...
            outputStream = new PrintWriter(new FileWriter("output1.txt")); // เขียนไฟล์ชื่อ ...

            String l; 
            int [][] number = new int [3][5]; // เนื่องจากข้อกำหนดว่าต้องอ่านค่าแบบ 3*5 สร้างอะเรย์เพื่อมารองรับข้อมูล
            int i = 0; // ค่าเริ่มต้นในการอ่านไฟล์ ทีละบรรทัด ค่านี้จะบ่งบอกว่าบรรทัดไหนได้ถูกอ่านอยู่
            
            // Input
            while ((l = inputStream.readLine()) != null) { // อ่านไฟล์เข้ามาทีละบรรทัด เมื่อพบข้อมูล l จะไม่เป็นค่า null 
             //   outputStream.println(l);
                System.out.println(""+l); // output เพื่อทดสอบว่าสามารถอ่านไฟล์เข้ามาได้หรือไม่
                
                String [] ll = l.split(","); // "5,4,3,2,1" --> ["5"]["4"]["3"]["2"]["1"]
                
                for (int j = 0; j < ll.length ; j++) { // ใส่ข้อมูลในอะเรย์ทีละตัว จากตำแหน่งที่ 0 --> 4 
                
                    number[i][j] = Integer.parseInt(ll[j]); // แปลง String "5" --> int 5
                }
                
                i++; // เมื่ออ่านบรรทัดเสร็จ ก็เพิ่มค่า
            }
            // Process
            int sum = 0; // ตัวแปรเพื่อเก็บผลรวมของการบวกในอาเรย์
            for (int k = 0 ; k < number.length ; k ++) {
            
                for (int m = 0 ; m < number[0].length ; m++) {
                
                    System.out.print(number[k][m] + " ");
                    sum += number[k][m]; // sum = sum + number[k][m]; // การบวกทุกค่าในอะเรย์ 2 มิติ
                }
                System.out.println("");
            }
            System.out.println("sum = " + sum);
            
            // Output
            outputStream.println(sum); // ทำการเขียนไฟล์
            
        } 
        catch (FileNotFoundException e) {
            System.out.println("ไม่สามารถพบไฟล์ที่กำหนด หรือ ชื่อไม่ถูกต้อง");
        }
        finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

    
    
}
