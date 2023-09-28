public class TipCalculator {

    private double totalBill;
    private int tipPercent;
    private int numOfPeople;

    public TipCalculator(double totalBill, int tipPercent, int numOfPeople) {
        this.totalBill = totalBill;
        this.tipPercent = tipPercent;
        this.numOfPeople = numOfPeople;
    }

    public double calculateTotalTip() {
        return totalBill * (0.01 * tipPercent);
    }

    public double calculateTotalBillAndTip() {
        return totalBill * ((0.01 * tipPercent) + 1);
    }

    public double calculateTotalTipPerPerson() {
        return calculateTotalTip() / numOfPeople;
    }

    public double calculateTotalPerPerson() {
        return calculateTotalBillAndTip() / numOfPeople;
    }

    public void calculateAndPrint() {
        System.out.println("**************************************************************************************");
        System.out.println("* Total Tip: $" + String.format("%.2f", calculateTotalTip()));
        System.out.println("* Total Bill + Tip: $" + String.format("%.2f", calculateTotalBillAndTip()));
        System.out.println("* Total Tip per person: $" + String.format("%.2f", calculateTotalTipPerPerson()));
        System.out.println("* Total Bill + Tip per person: $" + String.format("%.2f", calculateTotalPerPerson()));
        System.out.println("**************************************************************************************");
    }
}
