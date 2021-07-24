package MarketSystem;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		int i, Number_of_employees;      // Number of employees 
		Scanner sc = new Scanner(System.in);
		boolean choice = true;

        while (choice) {

        	System.out.println("_______________________________________________________________________________________________________________________________");
            System.out.println(">>>>><<<<<#####***** Welcome to Market Management System *****#####>>>>><<<<<");
            System.out.println("_______________________________________________________________________________________________________________________________");
            System.out.println("<<<<<<-----Main Menu----->>>>>");
            System.out.println("<----------------------------------------------->");
            System.out.println(" 1) New Employee Info Department ");
            System.out.println(" 2) International Trading Product Department ");
            System.out.println(" 3) Market Management ");
            System.out.println(" 4) Tax Department ");
            System.out.println(" 5) Sell Product ");
            System.out.println(" 6) Go back ");
            System.out.println("<----------------------------------------------->");

            try {
                System.out.print("<---- Choose option ----> (1/2/3/4/5/6) :  ");
                int option = sc.nextInt();

                switch (option) {
                        case 1:
                        	
                        	System.out.println("_______________________________________________________________________________________________________________________________");
                        	System.out.println(" Employee Department ");
                        	System.out.println("_______________________________________________________________________________________________________________________________");
                        	
                        	System.out.println("<----------------------------------------------->"); 
                        	System.out.print("Enter the number of Employees : ");
                        	
                        	Number_of_employees = sc.nextInt();            // Designed so how many employee can be shown or added           	
                            for(i=0; i<Number_of_employees; i++) {
                            	                          
                        	System.out.println("<----------------------------------------------->"); 
                        	
                            System.out.print("Enter Employee Name : ");
                            String ename = sc.next();

                            System.out.print("Enter Employee ID : ");
                            String eID = sc.next();

                            System.out.print("Enter Employee Department : ");
                            String edepartment = sc.next();
                            
                            System.out.print("Enter Employee Salary : ");
                            double esalary = sc.nextDouble();
                            
                            System.out.print("Enter Employee Joining date : ");
                            double ejd = sc.nextDouble();
                            
                            System.out.print("Enter Employee Area No. locked : ");
                            double elockers = sc.nextDouble();  
                            
                            System.out.print(" <<The Employee details have been added>> ");                            
                            System.out.println("<----------------------------------------------->");
                               
                            }
                            break;
                            
                        case 2:
                        	
                        	System.out.println("_______________________________________________________________________________________________________________________________");
                        	System.out.println("International Products are given below: ");
                        	System.out.println("_______________________________________________________________________________________________________________________________");
                        	
                        	System.out.println("<----------------------------------------------->");   
                        	
                        	InternationalProducts ipx1 = new InternationalProducts("Fox", 123, "Perfume", 1000, 1500);
                        	ipx1.displayInternationalProductDetails();
                        	System.out.println("_______________________________________________________________________________________________________________________________");
                        	
                        	InternationalProducts ipx2 = new InternationalProducts("Strawberry", 234, "Fruit", 4500, 5000);
                        	ipx2.displayInternationalProductDetails();
                        	System.out.println("_______________________________________________________________________________________________________________________________");
                        	
                        	InternationalProducts ipx3 = new InternationalProducts("Brown Sugar", 345, "Spices", 500, 650);
                        	ipx1.displayInternationalProductDetails();
                        	System.out.println("_______________________________________________________________________________________________________________________________");
                        	
                        	InternationalProducts ipx4 = new InternationalProducts("One-plue 8", 456, "Mobile", 50000, 70000);
                        	ipx4.displayInternationalProductDetails();  
                        	System.out.println("_______________________________________________________________________________________________________________________________");
                        	
                        	InternationalProducts ipx5 = new InternationalProducts("Asus XR", 567, "Machines", 70000, 90000);
                        	ipx5.displayInternationalProductDetails(); 
                        	System.out.println("_______________________________________________________________________________________________________________________________");
                        	
                        	InternationalProducts ipx6 = new InternationalProducts("Elgato", 678, "Cables", 4000, 5000);
                        	ipx6.displayInternationalProductDetails(); 
                        	System.out.println("_______________________________________________________________________________________________________________________________");
                        	
                        	InternationalProducts ipx7 = new InternationalProducts("LED Lights", 789, "Electric", 2500, 2700);
                        	ipx7.displayInternationalProductDetails(); 
                        	System.out.println("_______________________________________________________________________________________________________________________________");
                        	
                        	InternationalProducts ipx8 = new InternationalProducts("Potato", 890, "Grocery", 200, 300);
                        	ipx8.displayInternationalProductDetails(); 
                        	System.out.println("_______________________________________________________________________________________________________________________________");
                        	
                        	InternationalProducts ipx9 = new InternationalProducts("Coca-cola", 910, "Drinks", 100, 150);
                        	ipx9.displayInternationalProductDetails(); 
                        	System.out.println("_______________________________________________________________________________________________________________________________");
                        	
                        	InternationalProducts ipx10 = new InternationalProducts("Jackets", 101, "Cloths", 4000, 5500);
                        	ipx10.displayInternationalProductDetails(); 
                        	System.out.println("_______________________________________________________________________________________________________________________________");
                        	
                        	System.out.println("<----------------------------------------------->");
                        	break;
                        	
                        case 3: 	
                        	
                        	System.out.println("_______________________________________________________________________________________________________________________________");
                        	System.out.println(" Supply Products are given below: ");                        	
                        	System.out.println("_______________________________________________________________________________________________________________________________");
                        	
                        	System.out.println("<----------------------------------------------->");  
                        	
                        	Product px1 = new Product("Drinko", 987, "DR98", 400, 500 );
                        	px1.displayMarketManagingDetails();
                        	px1.information_of_MarketManagement();
                        	System.out.println("_______________________________________________________________________________________________________________________________");
                        	
                        	Product px2 = new Product("Centerfruit", 876, "CF87", 10, 5 );
                        	px2.displayMarketManagingDetails();
                        	px2.information_of_MarketManagement();
                        	System.out.println("_______________________________________________________________________________________________________________________________");
                        	
                        	Product px3 = new Product("Rice", 765, "RC76", 300, 450 );
                        	px3.displayMarketManagingDetails();
                        	px3.information_of_MarketManagement();
                        	System.out.println("_______________________________________________________________________________________________________________________________");
                        	
                        	Product px4 = new Product("Brush", 654, "BH65", 200, 300 );
                        	px4.displayMarketManagingDetails();
                        	px4.information_of_MarketManagement();
                        	System.out.println("_______________________________________________________________________________________________________________________________");
                        	
                        	Product px5 = new Product("Aerosol", 543, "AL54", 500, 400 );
                        	px5.displayMarketManagingDetails();
                        	px5.information_of_MarketManagement();
                        	System.out.println("_______________________________________________________________________________________________________________________________");
                        	
                        	Product px6 = new Product("Water", 432, "WR43", 600, 750 );
                        	px6.displayMarketManagingDetails();
                        	px6.information_of_MarketManagement();
                        	System.out.println("_______________________________________________________________________________________________________________________________");
                        	
                        	Product px7 = new Product("Dairy Milk", 321, "DK32", 900, 700 );
                        	px7.displayMarketManagingDetails();
                        	px7.information_of_MarketManagement();
                        	System.out.println("_______________________________________________________________________________________________________________________________");
                        	
                        	Product px8 = new Product("Ice-cream", 210, "IC21", 1500, 2000 );
                        	px8.displayMarketManagingDetails();
                        	px8.information_of_MarketManagement();
                        	System.out.println("_______________________________________________________________________________________________________________________________");
                        	
                        	Product px9 = new Product("Pen", 102, "PN02", 40, 50 );
                        	px9.displayMarketManagingDetails();
                        	px9.information_of_MarketManagement();
                        	System.out.println("_______________________________________________________________________________________________________________________________");
                        	
                        	Product px10 = new Product("Chips", 541, "CS41", 30, 30 );
                        	px10.displayMarketManagingDetails();
                        	px10.information_of_MarketManagement();
                        	System.out.println("_______________________________________________________________________________________________________________________________");
                        	
                        	System.out.println("<----------------------------------------------->");
                        	break;
                        	
                        case 4:
                        	
                        	System.out.println("_______________________________________________________________________________________________________________________________");
                        	System.out.println("<<<<<Income Tax Department>>>>>");
                        	System.out.println("_______________________________________________________________________________________________________________________________");
                        	
                        	System.out.println("<----------------------------------------------->");
                        	IncomeTax it = new IncomeTax ("Grocery", 10000);
                        	it.showDetails();
                        	
                        	System.out.println("<<<<<Value Added Tax (VAT) Department>>>>>");
                        	System.out.println("<----------------------------------------------->");                       	
                        	ValueAddedTax vx = new ValueAddedTax("Grocery", 10000, "Drinks", 5000, 3000);
                        	vx.showDetails();
                        	
                        	
                        	System.out.println("<----------------------------------------------->");
                        	break;
                        	
                        case 5: 
                        	
                        	System.out.println("_______________________________________________________________________________________________________________________________");
                        	System.out.println("$$$$$...Selling Product Department...$$$$$ ");
                            System.out.println("_______________________________________________________________________________________________________________________________");
                            
                        	System.out.println("<----------------------------------------------->");
                        	System.out.print("Enter Product Name : ");
                            String spname = sc.next();

                            System.out.print("Enter Product buying ID : ");
                            String spID = sc.next();

                            System.out.print("Enter amount of quantity to be sold : ");
                            int spquantity = sc.nextInt();
                            
                            System.out.print("Enter Product bercode : ");
                            double spcode = sc.nextDouble();
                            
                            System.out.print("Enter Product Price : ");
                            double spprice = sc.nextDouble();
                            
                            System.out.print("Enter Vat amount : ");
                            double spvat = sc.nextDouble();
                        	
                        	System.out.println("<<<<< Thanks for purchasing. See you again soon..... >>>>>");
                        	
                        	System.out.println("<----------------------------------------------->");
                        	break;
                        	
                        case 6:
                        	
                        	System.out.println("_______________________________________________________________________________________________________________________________");
                        	System.out.println("******Thanks for giving us your valueable time******");
                        	System.out.println("_______________________________________________________________________________________________________________________________");
                        	
                        	break;
                        	
                        default:
                        	
                        	System.out.println("_______________________________________________________________________________________________________________________________");
                            System.out.println("###### The option choosen is by default. Sorry try again...... #####");
                            System.out.println("_______________________________________________________________________________________________________________________________");
                            
                    }
                } 
            
                catch (InputMismatchException ime) {
                    System.out.println("InputMismatchException has occured");
                    String xyz = sc.next();
                } 
                catch (NullPointerException npe) {
                    System.out.println("NullPointerException has occured");      // Execution part
                } 
                catch (ArrayIndexOutOfBoundsException aie) {
                    System.out.println("ArrayIndexOutOfBoundsException has occured");
                    String xyz = sc.next();
                } 
                catch (NumberFormatException nfe) {
                    System.out.println("NumberFormatException has occured");
                    String xyz = sc.next();
                } 
                catch (ArithmeticException ae) {
                    System.out.println("ArithmeticException hasoccured");
                    String xyz = sc.next();
                } 
                catch (Exception e) {
                    System.out.println("Exception occured " + e.getMessage());
                    String xyz = sc.next();
                }
            }
        }
    }