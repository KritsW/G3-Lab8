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
import java.util.Scanner;

public class ScanXan {
    public static void main(String[] args) throws IOException {

        Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader("xanadu.txt"))); //ถ้าอยู่ใน files ใช้ files/xanadu.txt

            while (s.hasNext()) {
                System.out.println(s.next());
                //s.next();
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}

