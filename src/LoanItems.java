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
    public abstract String getDecription();

    public abstract double feeAmount();

    //toString() metode
    @Override



}
