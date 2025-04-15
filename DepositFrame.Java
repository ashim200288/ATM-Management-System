
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


public class DepositFrame extends JFrame{

	private DepositPanel depositPanel;
	
	public DepositFrame(){
		super("Make A Deposit");
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		depositPanel = new DepositPanel();
		this.setLocation(500, 500);
		add(depositPanel);
	}
	
	public void addToAccountBox(String acct){
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
	

}
