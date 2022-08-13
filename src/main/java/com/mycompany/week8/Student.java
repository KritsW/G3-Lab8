/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8;

/**
 *
 * @author LENOVO
 */
/// Serialize Student
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable {

    private String name;
    private String surname;
    private String id;
    private String major;
    private double GPA;

    public Student() {
        Scanner input = new Scanner(System.in);
        System.out.println("โปรดใส่รายละเอียดของชื่อ");
        name = input.nextLine();
        System.out.println("โปรดใส่รายละเอียดของนามสกุล");
        surname = input.nextLine();
        System.out.println("โปรดใส่รายละเอียดของรหัสนักศึกษา");
        id = input.nextLine();
        System.out.println("โปรดใส่รายละเอียดของสาขาวิชา");
        major = input.nextLine();
        System.out.println("โปรดใส่รายละเอียดของ GPA");
        GPA = input.nextDouble();
    }

    public void serialize(String filename) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in " + filename);
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.serialize("student1");
        Student student2 = new Student();
        student2.serialize("student2");
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the major
     */
    public String getMajor() {
        return major;
    }

    /**
     * @param major the major to set
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * @return the GPA
     */
    public double getGPA() {
        return GPA;
    }

    /**
     * @param GPA the GPA to set
     */
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
