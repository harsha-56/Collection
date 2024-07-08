package org.example.methodoverloadingexample;

class OverloadingExample {
    // Method with one parameter
    void display(int a) {
        System.out.println("Arguments: " + a);
    }

    // Method with two parameters
    void display(int a, int b) {
        System.out.println("Arguments: " + a + " and " + b);
    }

    // Method with different parameter type
    void display(String a) {
        System.out.println("Arguments: " + a);
    }

    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();

        // Call method with one integer argument
        obj.display(10);

        // Call method with two integer arguments
        obj.display(10, 20);

        // Call method with one string argument
        obj.display("Harsha");
    }
}
