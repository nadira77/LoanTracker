public class Book extends LoanItems {

    private final String author;

    public Book(String type, String title, double price, int year, int loandays, String author) {
        super(type, title, price, year, loandays);
        this.author = author;
    }

    @Override
    public String getDecription() {
        return this.getType() + ": " + this.getTitle() + "(" + this.getYear() + ") by: " + author + " at price: $" + this.getPrice() + ". Days loaned: " + this.getLoandays();
    }

    @Override
    public double feeAmount() {
        return this.getPrice() * 0.3;
    }


    @Override
    public String toString() {
        return super.toString() + " | Author: " + author;
    }

}
