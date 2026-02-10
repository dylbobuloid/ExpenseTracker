import java.util.ArrayList; // Import the ArrayList class

public class ExpenseTracker {
    ArrayList<Expense> expenses = new ArrayList<>(); // Create an ArrayList object

    public void addExpenses(Expense newExp) {
        expenses.add(newExp);
    }

    public void view() {
        for (Expense e : expenses) {
            System.out.println("------- EXPENSE -------");
            System.out.println(e.toString());
        }
    }

    public void total() {
        double total = 0;
        for (Expense e : expenses) {
            total += e.getAmount();
        }
        System.out.println("TOTAL: £" + String.format("%.2f", total));
    }

    public void filter(String categoryFilter) {
        // We need to filter out all the expenses based on the category
        // How can we single out 1 category?
        // If we do get category lets add all the expenses into a new array
        // if the array is empty we know that category wasnt found at all
        ArrayList<Expense> filteredExpenses = new ArrayList<>();

        for (Expense e : expenses) {
            if (e.getCategory().equals(categoryFilter)) {
                filteredExpenses.add(e);
            }
        }

        if (filteredExpenses.isEmpty()) {
            System.out.println("No categories found with that name.");
        } else {
            System.out.println("------- " + categoryFilter + " EXPENSE -------");
            for (Expense eFiltered : filteredExpenses) {
                System.out.println(eFiltered.toString());
            }
        }

    }


    public void save() {

    }

    public void load() {

    }
}
