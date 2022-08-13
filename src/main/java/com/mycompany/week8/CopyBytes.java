/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8;

/**
 *
 * @author LENOVO
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {

    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("xanadu.txt");  //ถ้าอยู่ใน files ใช้ files/xanadu.txt
            out = new FileOutputStream("outagain.txt");  //ถ้าให้ไปอยู่ที่ files ใช้ files/outagain.txt
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
                System.out.println("" + c + " to char = " + (char) c);

            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}

