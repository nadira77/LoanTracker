public class Video extends LoanItems {

    private final double runtime;

    public Video(String type, String title, double price, int year, int loandays, double runtime) {
        super(type, title, price, year, loandays);
        this.runtime = runtime;
    }

    @Override
    public String getDecription() {
        return this.getType() + ": " + this.getTitle() + "(" + this.getYear() + ") runtime: " + runtime + " at price: $" + this.getPrice() + ". Days loaned: " + this.getLoandays();
    }

    @Override
    public double feeAmount() {
        return this.getPrice() * 0.5;
    }

}
