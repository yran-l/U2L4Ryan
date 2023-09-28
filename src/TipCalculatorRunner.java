import java.util.Scanner;

public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("**************************************************************************************");
        System.out.print("* Total Bill: ");
        double totalBill = s.nextDouble();
        System.out.print("* Tip Percentage (without %): ");
        int tipPercent = s.nextInt();
        System.out.print("* Number of people: ");
        int numOfPeople = s.nextInt();

        TipCalculator calculator = new TipCalculator(totalBill, tipPercent, numOfPeople);
        calculator.calculateAndPrint();
        s.close();

    }
}