package demo;

public class Calculator {
    public static void main(String[] args) {
        add(1,2,3);
        subtract(23,12);
        multiply(23,23);

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
}
