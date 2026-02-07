package org.example.practiceLessons.Practice2;

public class Task2 {
    public static void main(String[] args) {
        StarTriangle small = new StarTriangle(5);
        System.out.println(small.ToString());
    }
}

class StarTriangle {
    int w;
    StarTriangle(int width) {
        w = width;
    }
    String ToString() {
        String res = "";
        for(int i = 1; i <= w; i++) {
            for(int j = 0; j < i; j++) {
                res += ("[*]");
            }
            res += '\n';
        }
        return res;
    }
}