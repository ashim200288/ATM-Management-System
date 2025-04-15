/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm.management.system;

/**
 *
 * @author ashim
 */
import java.util.Comparator;

public class CustomerNameComparator implements Comparator<Customer> {
	@Override
	public int compare(Customer c1, Customer c2){
		
		return c1.getName().compareToIgnoreCase(c2.getName());
		
	}
	
	

}
