public class ElectronicKit extends LoanItems {

    private final String model;

    public ElectronicKit(String type, String title, double price, int year, int loandays, String model) {
        super(type, title, price, year, loandays);
        this.model = model;
    }

    @Override
    public String getDecription() {
        return this.getType() + ": " + this.getTitle() + "(" + this.getYear() + ") model: " + model + " at price: $" + this.getPrice() + ". Days loaned: " + this.getLoandays();
    }

    @Override
    public double feeAmount() {
        return this.getPrice() * 0.3;
    }


    @Override
    public String toString() {
        return super.toString() + " | Model: " + model;
    }

}