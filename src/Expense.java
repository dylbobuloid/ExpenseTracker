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

    public String toString(){
        System.out.println("------- EXPENSE -------");
        return("£" + amount + " " + category + " " + description + " " + date);

    }




}
