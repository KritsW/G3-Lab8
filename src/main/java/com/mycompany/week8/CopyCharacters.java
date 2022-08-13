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
import java.io.IOException;

public class CopyCharacters {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("xanadu.txt");  //ถ้าอยู่ใน files ใช้ files/xanadu.txt
            outputStream = new FileWriter("characteroutput.txt"); //ถ้าให้ไปอยู่ที่ files ใช้ files/characteroutput.txt

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
                System.out.println("" + c + " to char = " + (char) c);
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
