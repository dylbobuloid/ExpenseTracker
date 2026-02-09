public class ExpenseTest {

    public static void main(String[] args){
        ExpenseTracker expenseTracker = new ExpenseTracker();
        Expense ex1 = new Expense(20, "Bills", "Electricity and Water bill");
        Expense ex2 = new Expense(11.30, "Travel", "To Guilford by train");
        Expense ex3 = new Expense(15, "Entertainment", "Marty Supreme tickets");
        Expense ex4 = new Expense(3.99, "Food", "Bunsik half and half with cheese");
        Expense ex5 = new Expense(49, "Health", "The London Climbing wall gym");

        expenseTracker.addExpenses(ex1);
        expenseTracker.addExpenses(ex2);
        expenseTracker.addExpenses(ex3);
        expenseTracker.addExpenses(ex4);
        expenseTracker.addExpenses(ex5);

        expenseTracker.view();

        expenseTracker.total();
    }
}
