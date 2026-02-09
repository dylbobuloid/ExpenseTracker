import java.util.ArrayList; // Import the ArrayList class
public class ExpenseTracker {
    ArrayList<Expense> expenses = new ArrayList<>(); // Create an ArrayList object

    public void addExpenses(Expense newExp){
        expenses.add(newExp);
    }

    public void view(){
        for(Expense e:expenses){
            System.out.println("------- EXPENSE -------");
            System.out.println(e.toString());
        }
    }
    public void total(){
        double total = 0;
        for(Expense e:expenses){
            total += e.getAmount();
        }
        System.out.println("TOTAL: £" + String.format("%.2f", total));
    }
    public void filter(){

    }

    public void save(){

    }

    public void load(){

    }
}
