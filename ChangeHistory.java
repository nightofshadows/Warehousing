/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author night
 */
import java.util.ArrayList;
 
public class ChangeHistory {
 
    private ArrayList<Double> history;
 
    public ChangeHistory() {
	this.history = new ArrayList<>();
    }
 
    public void add(double status) {
	history.add(status);
    }
 
    public void clear() {
	history.clear();
    }
 
    public String toString() {
	return "" + history;
    }
 
    public double maxValue() {
	if (!(history.isEmpty())) {
	    double temp = -Double.MAX_VALUE;
	    for (double change : history) {
		if (temp < change) {
		    temp = change;
		}
	    }
	    return temp;
	}
	return 0;
    }
 
    public double minValue() {
	if (!(history.isEmpty())) {
	    double temp = Double.MAX_VALUE;
	    for (double change : history) {
		if (temp > change) {
		    temp = change;
		}
	    }
	    return temp;
	}
	return 0;
 
    }
 
    public double average() {
	if(!(history.isEmpty())){
	    double sum=0;
	    for(double change: history){
		sum+=change;
	    }
	    return sum/history.size();
	}
	return 0;
    }
    
}
