package lab1;

import java.util.Scanner;

class Data {
    private double sum;
    private double max;
    private int count;

    public Data() {
        sum = 0;
        max = -999;
        count = 0;
    }

    public void addValue(double value) {
        sum = sum + value;
        if (value > max) {
            max = value;
        }
        count++;
    }

    public double getAverage() {
        if (count == 0) {
            return 0;
        } else {
            return sum / count;
        }
    }

    public double getMaximum() {
        if (count == 0) {
            return 0;
        } else {
            return max;
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Data data = new Data();

        while (true) {
            System.out.print("Enter number (Q to quit): ");
            String input = scanner.nextLine();

            if (input.equals("Q") || input.equals("q")) {
                break;
            }

            boolean isNumber = true;
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if ((c < '0' || c > '9') && c != '.' && c != '-') {
                    isNumber = false;
                }
            }

            if (isNumber) {
                double number = Double.parseDouble(input);
                data.addValue(number);
            } else {
                System.out.println("Wrong input, only numbers or Q.");
            }
        }

        System.out.println("Average = " + data.getAverage());
        System.out.println("Maximum = " + data.getMaximum());
    }
}
