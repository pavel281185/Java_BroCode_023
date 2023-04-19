public class Main {
    public static void main(String[] args) {
        // overloaded methods

        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));
        System.out.println(add(1, 2, 3, 4));
        System.out.println(add(1.3, 2.5, 3, 4));

    }
    static int add(int a, int b){
        System.out.println("First method");
        return a + b;
    }
    static int add(int a, int b, int c){
        System.out.println("Second method");
        return a + b + c;
    }
    static int add(int a, int b, int c, int d){
        System.out.println("Third method");
        return a + b + c + d;
    }
    static double add(double a, double b){
        System.out.println("First.2 method");
        return a + b;
    }
    static double add(double a, double b, double c){
        System.out.println("Second.2 method");
        return a + b + c;
    }
    static double add(double a, double b, double c, double d){
        System.out.println("Third.2 method");
        return a + b + c + d;
    }
}