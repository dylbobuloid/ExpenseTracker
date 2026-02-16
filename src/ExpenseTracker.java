import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList; // Import the ArrayList class
import java.util.Locale;
import java.util.Scanner;

public class ExpenseTracker {
    ArrayList<Expense> expenses = new ArrayList<>(); // Create an ArrayList object

    public void addExpenses(Expense newExp) {
        expenses.add(newExp);
    }

    public void view() {
        System.out.println("------- EXPENSE -------");
        for (Expense e : expenses) {
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

    public void filter() {

    }

    public void save(String filename) throws FileNotFoundException, UnsupportedEncodingException, FileNotFoundException {
        PrintWriter writer = new PrintWriter(filename, "UTF-8");
        for (Expense e : expenses) {
            writer.println(e.toString());
        }
        writer.close();
        System.out.println("Successfully saved");
    }

    public void load(String filename) {
        File myObj = new File(filename);
        System.out.println("Loading...");
        try (Scanner myReader = new Scanner(myObj)) {
            while (myReader.hasNextLine()) {
                String expenseName = myReader.nextLine();
                String[] expenseSplit = expenseName.split(" \\| ");
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                formatter = formatter.withLocale(Locale.ENGLISH);
                LocalDate date = LocalDate.parse(expenseSplit[3], formatter);
                java.lang.String price = expenseSplit[0].substring(1);
                Expense e = new Expense(Double.parseDouble(price), expenseSplit[1], expenseSplit[2], date);
                addExpenses(e);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while loading.");
            e.printStackTrace();
        }
        view();
    }

}


