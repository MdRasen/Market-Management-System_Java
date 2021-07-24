package MarketSystem;

public class Management {
	static double total_income = 0.0;
    static double total_expense = 0.0;           // Base of the project where Income, expense and profit of market
    private static double total_profit = 0.0;

    public void information_of_MarketManagement() {
        total_profit = total_income - total_expense;

        System.out.println("Total Income by a shop:" + " " + total_income);
        System.out.println("Total Expense by a shop:" + " " + total_expense); // method-overloading
        System.out.println("Total Profit by a shop:" + " " + total_profit);
        
        System.out.println("<----------------------------------------->");
        System.out.println("");
    }
	
}
