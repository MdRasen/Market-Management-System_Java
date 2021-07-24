package MarketSystem;

public abstract class SellingProduct {
	protected String spname; 
	protected String spID; 
	protected int spquantity;       // selling product class to sell product 
	protected double spcode;
	protected double spprice;
    protected double spvat;

	public void setspname(String spname) {
		this.spname = spname;
	}
	public void setspID(String spID) {
		this.spID = spID;
	}
	public void setspquantity(int spquantity) {
		this.spquantity = spquantity;
	}
	public void setspcode(double spcode) {
		this.spcode = spcode;
	} 
	public void setspprice(double spprice) {
		this.spprice = spprice;
	} 
	public void setspvat(double spvat) {
		this.spvat = spvat;
	} 
	public String getspname() {
		return spname;
	}
	public String getspID() {
		return spID;
	}
	public int getspquantity() {
		return spquantity;
	}
	public double getspcode() {
		return spcode;
	}
	public double getspprice() {
		return spprice;
	}
	public double getspvat() {
		return spvat;
	}
	
	public abstract void showdetails();    // Abstraction used so that the tax does not show up
		
}