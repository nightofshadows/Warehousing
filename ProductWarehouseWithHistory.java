/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author night
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
 
    private ChangeHistory changes;
 
    public ProductWarehouseWithHistory(String productName, double capacity, double intialBalance) {
	super(productName, capacity);
	this.setBalance(intialBalance);
	changes = new ChangeHistory();
	changes.add(intialBalance);
    }
    public String history(){
	return ""+changes;
    }
    public void addToWarehouse(double amount){
	super.addToWarehouse(amount);
	changes.add(super.getBalance());
    }
    public double takeFromWarehouse(double amount){
	double remaining =super.takeFromWarehouse(amount);
	changes.add(super.getBalance());
	return remaining;
    }
    public void printAnalysis(){
	System.out.println("Product: " + super.getName());
	System.out.println("History:" + changes);
	System.out.println("Largest amount of product: " + changes.maxValue());
	System.out.println("Smallest amount of product: " + changes.minValue());
	System.out.println("Average: " + changes.average());
    }
    
    
 
}
