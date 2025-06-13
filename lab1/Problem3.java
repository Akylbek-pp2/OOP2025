package lab1;

public class Problem3 {
    public static void main(String[] args) {
        Temperature t1 = new Temperature();
        Temperature t2 = new Temperature(100);
        Temperature t3 = new Temperature('F');
        Temperature t4 = new Temperature(98.6, 'F');

        System.out.println("t1 in C: " + t1.getCelsius());
        System.out.println("t1 in F: " + t1.getFahrenheit());

        System.out.println("t2 in C: " + t2.getCelsius());
        System.out.println("t2 in F: " + t2.getFahrenheit());

        System.out.println("t3 in C: " + t3.getCelsius());
        System.out.println("t3 in F: " + t3.getFahrenheit());

        System.out.println("t4 in C: " + t4.getCelsius());
        System.out.println("t4 in F: " + t4.getFahrenheit());
    }
}

class Temperature {
    private double value;
    private char scale;

    public Temperature() {
        value = 0;
        scale = 'C';
    }

    public Temperature(double value) {
        this.value = value;
        scale = 'C';
    }

    public Temperature(char scale) {
        value = 0;
        this.scale = scale;
    }

    public Temperature(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    public double getCelsius() {
        if (scale == 'C' || scale == 'c') {
            return value;
        } else {
            return (5.0 * (value - 32)) / 9;
        }
    }

    public double getFahrenheit() {
        if (scale == 'F' || scale == 'f') {
            return value;
        } else {
            return (9.0 * (value / 5.0)) + 32;
        }
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setBoth(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    public char getScale() {
        return scale;
    }
}
