package MarketSystem;

public class ValueAddedTax extends IncomeTax {
	
	String extragoods;
	double extratax;
	double vat;
	
	ValueAddedTax(String Goods, int tax, String extragoods, double extratax, double vat){
		super(Goods, tax);             // super keyword used for overriding 
		this.extragoods = extragoods;
		this.extratax = extratax;
		this.vat = vat;
	}
	
	void showDetails() {          // method-overrided with income tax class
		super.showDetails();
		System.out.println("Extra Products on Raid : " + extragoods);
		System.out.println("Extra on tax income : " + extratax);
		System.out.println("VAT on tax : " + vat);
	}

}
