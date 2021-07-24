package MarketSystem;

public class Product extends Management {
	
	    private final String pname;
	    private final int pID;
	    private final String pcode;
	    private final double pcostprice;                  // Supply Products 
	    private final double psellingprice;

	    Product(String pname, int pID, String pcode, double pcostprice, double psellingprice) {
	        this.pname = pname;
	        this.pID = pID;
	        this.pcode = pcode;
	        this.pcostprice = pcostprice;
	        this.psellingprice = psellingprice;

	        total_income  += psellingprice; 
	        total_expense += pcostprice;
	    }

	    public void displayMarketManagingDetails() {
	    	
	    	System.out.println("Shop's product : ");
	    	System.out.println("Name :" + pname);
	    	System.out.println("ID :" + pID);
	    	System.out.println("Code :" + pcode);
	    	System.out.println("Cost Price :" + pcostprice);
	    	System.out.println("Selling Price :" + psellingprice);
	    	
	        //System.out.println("Shop's product, Name : " + pname + " | PID : " + pID + " | Code : " + pcode + " | Costprice : "
	        		           // + pcostprice + " | Sellingprice : " + psellingprice);       
	        System.out.println("");
	        System.out.println("After calculation: ");        // Method over-loading being used from management class
	 }

}
