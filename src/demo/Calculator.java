package demo;

public class Calculator {
    public static void main(String[] args) {
        add(1,2,3);
        subtract(23,12);
        multiply(23,23);
        division(100,10);
        multiplication(10,11,12);
        System.out.println("hello coding is done");
    }
    public static void add(int a, int b, int c){
        System.out.println(a+b+c);

    }
    public static void subtract(int a,int b){
        System.out.println(a-b);
    }
    public static void multiply(int a,int b){
        System.out.println(a*b);
    }
    public static void division(int a,int b){
        System.out.println(a/b);
    }
    public static void multiplication(int a, int b, int c){
        System.out.println(a*b*c);
    }
}
