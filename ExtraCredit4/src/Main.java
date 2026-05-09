public class Main {

    public static void main(String[] args) {

        ComputeMethods myMethods = new ComputeMethods();

        double tempC = myMethods.fToC(100.4);
        double hypotenuse = myMethods.hypotenuse(6, 9);
        int diceTotal = myMethods.roll();

        System.out.println("Temp in celsius is " + tempC);
        System.out.println("Hypotenuse is " + hypotenuse);
        System.out.println("The sum of the dice values is " + diceTotal);
    }
}

class ComputeMethods {

    public double fToC(double degreesF) {
        double celsius = 5.0 / 9.0 * (degreesF - 32);
        return celsius;
    }

    public double hypotenuse(int a, int b) {
        double c = Math.sqrt((a * a) + (b * b));
        return c;
    }

    public int roll() {
        int die1 = (int)(Math.random() * 6) + 1;
        int die2 = (int)(Math.random() * 6) + 1;

        return die1 + die2;
    }
}