/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8;

/**
 *
 * @author LENOVO
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class CopyLines {
    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("xanadu.txt")); //ถ้าอยู่ใน files ใช้ files/xanadu.txt
            outputStream = new PrintWriter(new FileWriter("characteroutput.txt")); //ถ้าให้ไปอยู่ที่ files ใช้ files/characteroutput.txt

            String l;
            while ((l = inputStream.readLine()) != null) {
                outputStream.println(l);
                System.out.println(""+l);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
  
