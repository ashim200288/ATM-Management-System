/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm.management.system;

/**
 *
 * @author ashim
 */
import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.GridLayout;

import javax.swing.JFrame;


public class InfoFrame extends JFrame{

	private InfoPanel infoPanel;
	
	public InfoFrame(){
		super("Customer Info");
		setSize(530, 280);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		infoPanel = new InfoPanel();
		this.setLocation(500, 500);
		add(infoPanel);
	}

	public void addToDisplay(String info){
		infoPanel.addToDisplay(info);
	}
	
	public boolean getBack(){
		return infoPanel.getBack();
	}
	
	public void setBackFalse(){
		infoPanel.setBackFalse();
	}
	
	public void clearDisplay(){
		infoPanel.clearDisplay();
	}
/*	public void addToAccountBox(String acct){
		depositPanel.addToAccountBox(acct);
	}
	
	public boolean getDeposit(){
		return depositPanel.getDeposit();
	}
	
	public void setDepositFalse(){
		depositPanel.setDepositFalse();
	}
	
	public String getSelectedAccount(){
		return depositPanel.getSelectedAccount();
	}
	
	public String getDepositAmount(){
		return depositPanel.getDepositAmount();
	}
	
	public void setDepositClear(){
		depositPanel.setDepositClear();
	}
*/	

}
