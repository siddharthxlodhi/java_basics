package prac;

public class Aimple {
    public static void main(String[] args) {

        //Anonymous class
        A A=new A() {
            @Override
            public int m1(int a,int b) {
                System.out.println("Implementation by Anonymous class");
             return a+b;
            }
        };
        //Lambda
        A A1=(int a,int b)->a+b;

        B b=str->str.length();
        B b1=String::length;

        System.out.println(A.m1(5,3));
        System.out.println(A1.m1(5,4));
        System.out.println(b1.getLength("SIDDHARTH"));

    }



}