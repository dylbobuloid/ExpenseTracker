import java.time.LocalDate; // import the LocalDate class

public class Expense {
    private double amount;
    private String category;
    private String description;
    private LocalDate date;

    public Expense(double amount, String category, String description){
        this.amount = amount;
        this.category = category;
        this.description = description;
        date = LocalDate.now();

    }

    public Expense(double amount, String category, String description, LocalDate date){
        this.amount = amount;
        this.category = category;
        this.description = description;
        this.date = date;

    }

    public String getCategory() {
        return category;
    }

    public String toString(){
        return("£" + amount + " | " + category + " | " + description + " | " + date);
    }
    public double getAmount(){
        return amount;
    }





}
