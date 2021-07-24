package MarketSystem;

public class IncomeTax {
	
	String Goods;
	int tax;
		
	public IncomeTax(String Goods, int tax){
		this.Goods = Goods;
		this.tax = tax;
	}
		
	void showDetails() {                  // method overriding with value added tax class
		System.out.println("Raid on products : " + Goods);
		System.out.println("Income Statement : " + tax);
	
	}
}
