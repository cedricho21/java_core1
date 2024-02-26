package task.oop;

public class OOP {
    public static void main(String[] args) {
        double a = 2;
        double b = 3;
        String name = "Mike";
        int age = 30;
        Manager man = new Manager(name, age);
        //OOP.Rectangle go = new OOP.Rectangle(a,b);
        man.print_name();
        //System.out.println("Tut: " + ());
    }

    static class Parent {
        public int sum(int a, int b) {
            return a + b;
        }
        public int sumFromString(String str, int num) {
            return Integer.parseInt(str) + num;
        }
        public String returnString(String str) {
            return str;
        }
        public void printParent() {
            System.out.println("I am Parent");
        }
        public String concatenateStrings(String str1, String str2) {
            return str1 + str2;
        }
    }

    static class Child1 extends Parent{ 
         public int sum(int a, int b) {
            return a * b;
        }
        public int sumFromString(String str, int num) {
            return (Integer.parseInt(str) + num)*2;
        }
        public String returnString(String str) {
            return String.valueOf(str.charAt(0));
        }
        public void printParent() {
            System.out.println("I am Child1");
        }
        public String concatenateStrings(String str1, String str2) {
            String fullStr = str1+str2;
            int len = fullStr.length();
            return fullStr.substring(0, len/2);
        }
    }

    static class Child2 extends Parent{
        public int sum(int a, int b, int c){
            return a+b+c;
        }
        public int sumFromString(String str1, String str2, String str3){
            return Integer.parseInt(str1)+Integer.parseInt(str2)+Integer.parseInt(str3);
        }
        public String concatenateStrings(String str1, String str2){
            return str1+str2;
        }
        public void printChild2(String str){
            System.out.println("I am Child2" + str);
        }
        public String concatenateStrings(String str1, String str2, String str3){
            return str1+str2+str3;
        }
    }

    static abstract class Figures{
        abstract double square();
    }

    static class Cirle extends Figures{
        double radius;

        public Cirle(double radius){
            this.radius=radius;
        }

        double square(){
            return 3.14*radius*radius;
        }
    }

    static class Rectangle extends Figures{
        double length;
        double width;

        public Rectangle(double length, double width){
            this.length = length;
            this.width = width;
        }

        double square(){
            return length*width;
        }
    }

    static class Triangle extends Figures{
        double length;
        double heigth;

        public Triangle(double length, double heigth){
            this.length = length;
            this.heigth = heigth;
        }

        double square(){
            return length*heigth/2;
        }
    }

    static abstract class Employee{
        abstract void print_name();
        abstract void print_age();
    }

    static class Manager extends Employee{
        String name;
        int age;

        public Manager(String name, int age){
            this.name=name;
            this.age=age;
        }

        void print_name(){
            System.out.println(name);
        }

        void print_age(){
            System.out.println(age);
        }
    }

    static class Handyman extends Employee{
        String name;
        int age;

        public Handyman(String name, int age){
            this.name=name;
            this.age=age;
        }

        void print_name(){
            System.out.println(name);
        }

        void print_age(){
            System.out.println(age);
        }
    }
}

