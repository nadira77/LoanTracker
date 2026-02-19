public abstract class LoanItems {
    private String type;
    private String title;
    private double price;
    private int year;
    private int loandays;

    //Konstruktør

    public LoanItems(String type, String title, double price, int year, int loandays) {
        this.type = type;
        this.title = title;
        this.price = price;
        this.year = year;
        this.loandays = loandays;

    }

    //Metode til at beregne fee. Encapsulation: Protected gør så både klasser + subklasser kan bruge denne metode
    protected double calculateFee (double rate) {
        return this.price * rate * this.loandays;
    }

    //Getters and setters

    public String getType(){
        return type;
    }

    public String getTitle(){
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public int getLoandays(){
        return loandays;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLoandays(int loandays) {
        this.loandays = loandays;
    }

    //Abstrakte metoder

    public abstract String getDescription();

    public abstract double feeAmount();

    //toString() metode
    @Override
    public String toString() {
        return "Type: " + type + " | Title: " + title + " | Price: " + price + " | Year: " + year + " | Loan days: " + loandays;
    }


}
