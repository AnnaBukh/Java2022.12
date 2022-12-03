package HW_1;
// Реализовать простой калькулятор


import java.util.Scanner;

public class HW_3 {

    static double sum(double numb_1, double numb_2) {
        double rez = numb_1 + numb_2;
        return rez ;
    }

    static double sub(double numb_1, double numb_2) {
        double rez = numb_1 - numb_2;
        return rez ;
    }

    static double div(double numb_1, double numb_2) {
        double rez = numb_1 / numb_2;
        return rez ;
    }

    static double prod(double numb_1, double numb_2) {
        double rez = numb_1 * numb_2;
        return rez ;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1:  ");
        double num_1 = in.nextDouble();

        System.out.print("Enter number 2:  ");
        double num_2 = in.nextDouble();

        System.out.print("Enter operator: (+, -, *, /):  ");
        char operator = in.next().charAt(0);

        switch(operator){
            case '+':
                System.out.printf(num_1 + " " + operator + " " + num_2 + " = " + sum(num_1, num_2));
                break;
            case '-':
                System.out.printf(num_1 + " " + operator + " " + num_2 + " = " + sub(num_1, num_2));
                break;
            case '/':
                System.out.printf(num_1 + " " + operator + " " + num_2 + " = " + div(num_1, num_2));
                break;
            case '*':
                System.out.printf(num_1 + " " + operator + " " + num_2 + " = " + prod(num_1, num_2));
                break;
            default: 
                System.out.printf("Incorrect operator, try again");
                return;
        }
    }
}
