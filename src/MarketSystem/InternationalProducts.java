package MarketSystem;

public class InternationalProducts {
	
	    private final String ipname;
	    private final int ipID;
	    private final String iptype;              // Ordered products from outside 
	    private final double ipbroughtPrice;
	    private final double ipsellingPrice;
	    
	    InternationalProducts(String ipname, int ipID, String iptype, double ipbroughtPrice, double ipsellingPrice) {
	        this.ipname = ipname;
	        this.ipID = ipID;
	        this.iptype = iptype;
	        this.ipbroughtPrice = ipbroughtPrice;
	        this.ipsellingPrice = ipsellingPrice;
	        
	    }
	    
	    public void displayInternationalProductDetails() {
	    	
	    	System.out.println("International Product Lists : " );
	    	System.out.println("Product Name :" + ipname);
	    	System.out.println("Product ID :" + ipID);
	    	System.out.println("Product Type :" + iptype);
	    	System.out.println("Product Cost Price :" + ipbroughtPrice);
	    	System.out.println("Product Selling Price :" + ipsellingPrice);
	    		    	
	        //System.out.println("International Product, | Product Name : " + ipname + " | Product ID : " + ipID + " | Product Brought price : " 
	                           // + ipbroughtPrice + " | Product Selling price : " + ipsellingPrice);
        }
}