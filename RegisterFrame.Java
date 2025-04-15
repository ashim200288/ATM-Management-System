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

public class RegisterFrame extends JFrame{
	
	private RegisterPanel registerPanel;
	private boolean accept;



	public RegisterFrame(){
		
		super("Enter Name and PIN");
		setSize(350, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		registerPanel = new RegisterPanel();
		this.setLocation(500, 500);
		add(registerPanel);
	}
	
	public String getName(){
		
		return registerPanel.getName();
		
	}
	
	public String getPIN(){
		
		return registerPanel.getPIN();
		
	}
	
	public void setAcceptFalse(){
		registerPanel.setAcceptFalse();
	}
	
	public void setBackFalse(){
		registerPanel.setBackFalse();
	}
	
	public void setIncorrectPIN(){
		registerPanel.addIncorrectPIN();
	}
	
	public void setClear(){
		registerPanel.setClear();
	}
	
	public boolean getBack(){
		return registerPanel.getBack();
	}
	
}
