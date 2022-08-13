/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8;

/**
 *
 * @author LENOVO
 */
/// Deserialize Student and Open in Excel file
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;

public class WriteStudent {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student1, student2 = null;
        FileInputStream fileIn = new FileInputStream("student1");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        student1 = (Student) in.readObject();
        fileIn = new FileInputStream("student2");
        in = new ObjectInputStream(fileIn);
        student2 = (Student) in.readObject();
        in.close();
        fileIn.close();
//System.out.println(""+e.getName());
        PrintWriter outputStream = null;
        outputStream = new PrintWriter(new FileWriter("Student.csv"));  //csv = comma saparated value
        outputStream.println(student1.getName() + "," + student1.getSurname() + "," + student1.getId() + "," + student1.getMajor() + "," + student1.getGPA());
        outputStream.println(student2.getName() + "," + student2.getSurname() + "," + student2.getId() + "," + student2.getMajor() + "," + student2.getGPA());
        outputStream.close();
    }
}
