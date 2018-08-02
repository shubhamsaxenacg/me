package com.television;

import java.util.*;

/**
 * @author Shubham Saxena
 * 
 * The object of this class is created in main function of class 'TelevisionRemote'
 */

public class Start {
	
	Scanner scanner = new Scanner(System.in);
	Television television = new Television();
	
	/**
	 * This function is called by the main class
	 * This contains switch case for choosing 
	 */
	public void show()
	{
		int option;		
		do {
			showMenu();
			option = scanner.nextInt();
			switch (option) 
			{
				case 1: power();
						break;
				case 2: volumeIncrease();
						break;
				case 3:	volumeDecrease();
						break;
				case 4: changechannel();
						break;
				case 5: stateInformation();
						break;
				case 6:	break;
				
				default: System.out.println("Invalid Option");
						break;
			}
		}while(option!=6);
		scanner.close();
	}
	
	/**
	 * This function prints menu
	 */
	private void showMenu() {
		System.out.println("Enter your option.....");
		System.out.println("1. Switch");
		System.out.println("2. Increase volume");
		System.out.println("3. Decrease Volume");
		System.out.println("4. Change Channels");
		System.out.println("5. Current State Information");
		System.out.println("6. Exit");
		
	}
	
	/**
	 * This function is called to change the power state of television 
	 */
	private void power() {
		television.power();
		System.out.println("State changed");		
	}
	
	/**
	 * This function is called to increase volume
	 */
	private void volumeIncrease() {
		int volume = television.increaseVolume();
		System.out.println("Volume increased to "+volume);		
	}
	
	/**
	 * This function is called to decrease volume
	 */
	private void volumeDecrease() {
		int volumeDecrease = television.decreaseVolume();
		System.out.println("Volume decreased to "+volumeDecrease);	
	}
	
	/**
	 * This function is called to change channel number
	 */
	private void changechannel() {
		System.out.println("Input channel....");
		int choosechannel = scanner.nextInt();
		boolean changed = television.setchannel(choosechannel);
		if(changed)
			System.out.println("Channel changed to "+choosechannel);
		else
			System.out.println("Invalid Input");
	}
	
	/**
	 * This function is called by switch case to give all information of television 
	 */
	private void stateInformation() {
		boolean state = television.getPowerOn();
		int volumeState = television.getVolume();
		int channelState = television.getChannel();
		String power;
		if(state)
		{
			power = "on";
		}
		else
			power = "off";
		System.out.println("Power:"+power);
		System.out.println("channel:"+channelState);
		System.out.println("Volume:"+volumeState);
	}

}
