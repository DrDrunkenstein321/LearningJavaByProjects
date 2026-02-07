package org.example;

public class Learning{
    public static void main(String[] args) { // public и static - модификаторы. String[] args - параметры
        Person tom = new Person(); // Создание обьекта класса Person

        System.out.println(tom.name); // null
        System.out.println(tom.age); // 0

        tom.name = "Dastan";
        tom.age = 20;

        tom.print(); // вызов метода

        Dog taimaz = new Dog();
        taimaz.name = "Taimaz";
        taimaz.age = 5;
        taimaz.print();
    }
}

class Person { // класс Person
    String name; // поле name
    int age; // поле age

    void print() {
        System.out.printf("Name: %s \tAge: %d%n", name, age);
    }
}

class Dog {
    String name;
    int age;
    void printName() {
        System.out.printf("Dog's name is: %s%n", name);
    }
    void printAge() {
        System.out.printf("Dog's age is: %d%n", age);
    }
    void print(){
        printName();
        printAge();
    }
}
// Классы - это описание или шаблон для обьектов
// Обьект - это конкретный экземпляр класса
// class Car { String color; }  new Car -> обьект
// Любой обьект может обладать двумя основными характеристиками: состояние - некоторые данные, которые хранит обьект, и
// поведение - действие которые может совершать объект
// отличие между полями и локальными переменными: локальные переменные необходимо явно инициализировать int a - не сработает и выдаст ошибку
// а вот в классе если вы не инициализируете поле, оно автоматически инициализируется значением по умолчанию (0, false, null)
// методы описывают поведение обьекта
// Конструктор — это специальный метод класса, который вызывается автоматически при создании объекта (new) и нужен чтобы инициализировать объект