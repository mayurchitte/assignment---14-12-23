import java.util.Scanner;

public class Demo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        double n1 = sc.nextDouble();

        System.out.println("Enter 2nd number: ");
        double n2 = sc.nextDouble();

        Calculator c = new Calculator(n1, n2);

        System.out.println("Addition: " + c.addition());
        System.out.println("Subtraction: " + c.subtraction());
        System.out.println("Multiplication: " + c.multiplication());
        System.out.println("Division: " + c.division());
        System.out.println(c); 
    }
}

class Calculator {
    private double num1;
    private double num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double addition() {
        return this.num1 + this.num2;
    }

    public double subtraction() {
        return this.num1 - this.num2;
    }

    public double multiplication() {
        return this.num1 * this.num2;
    }

    public double division() {
        if (num2 != 0) {
            return this.num1 / this.num2;
        } else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN; 
        }
    }

    
    public String toString() {
        return "Result: " + addition() + " per month";
    }
}
