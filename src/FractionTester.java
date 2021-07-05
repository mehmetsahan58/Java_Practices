import java.util.Scanner;

public class FractionTester {


    private int numerator;

    private int denominator;

    public FractionTester (int numerator, int denominator) {

        this.numerator = numerator;

        this.denominator = denominator;


    }

    public int getNumerator () {

        return numerator;
    }

    public int getDenominator () {

        return denominator;
    }

    public String toString () {

        return numerator + "/" + denominator;
    }



    public static void main (String args [] ) {

        FractionTester half = new FractionTester(1, 2);

        Scanner input = new Scanner(System.in);

        System.out.println ("Enter a numerator: ");

        int numerator = input.nextInt();

        System.out.println ("Enter a denominator: " );

        int denominator = input.nextInt();

        FractionTester input1 = new FractionTester(denominator, numerator);

        int numeratorTotal = numerator * half.getDenominator() + denominator * half.getNumerator();
        int denominatorTotal = denominator * half.getDenominator();

        FractionTester sum = new FractionTester(numeratorTotal, denominatorTotal);

        System.out.println (half + " + " + input1 + " = " + sum);




    }
}
