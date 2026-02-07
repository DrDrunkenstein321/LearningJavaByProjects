package org.example.practiceLessons.Practice2;

public class Task1 {
    public static void main(String[] args) {
        Student dastan = new Student("Dastan", 2401);
        dastan.incrementYear();
        dastan.incrementYear();
        System.out.println(dastan.yearStudy);
    }
}


class Student {
    String name;
    int id;
    int yearStudy;
    Student(String nameStudent, int idStudent) {
        name = nameStudent;
        id = idStudent;
        yearStudy = 1;
    }

    String getName() {
        return name;
    }
    int getId() {
        return id;
    }
    int getYear() {
        return yearStudy;
    }
    void incrementYear() {
        yearStudy++;
    }
}