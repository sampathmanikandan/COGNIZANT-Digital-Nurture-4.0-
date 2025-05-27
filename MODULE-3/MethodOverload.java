public class MethodOverload {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MethodOverload obj = new MethodOverload();
        System.out.println("Add 2 integers: " + obj.add(10, 20));
        System.out.println("Add 2 doubles: " + obj.add(5.5, 4.5));
        System.out.println("Add 3 integers: " + obj.add(1, 2, 3));
    }
}
