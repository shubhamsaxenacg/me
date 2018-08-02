package com.television;

/**
 * @author Shubham Saxena
 *
 *	This class contains the functions for the working of Television
 */
public class Television {
	
	private int channel; 
	private int volume;
	private boolean powerOn;
	
	/**
	 * This is a constructor which initializes the values
	 */
	public Television()
	{
		powerOn = false;
		volume = 50;
		channel = 3;
	}
	
	/**
	 * Getter functions for channel, volume and powerOn 
	 */
	public int getVolume() {
		return volume;
	}
	public int getChannel() {
		return channel;
	}
	public boolean getPowerOn(){
		return powerOn;
	}
	
	/**
	 * @param choosechannel
	 * This method is used to set the channel number
	 * Also checks if the parameter is valid
	 */
	public boolean setchannel(int choosechannel)
	{
		boolean changed = false;
		if(choosechannel<=200 && choosechannel>0)
		{
				channel = choosechannel;
				changed = true;
				
		}	
		return changed;
	}
	
	/**
	 * This method is toggle for the power button
	 */
	public void power()
	{
		powerOn = !powerOn;
	}
	
	/**
	 * @return
	 * This method increase the volume
	 * Check if volume value is exceeding
	 */
	public int increaseVolume() 
	{
		if(volume<100)
		{
			volume = volume + 1;
		}
		return volume;
	}
	
	/**
	 * @return
	 * This method decreases voulme
	 * Check that the volume value should not go negative 
	 */
	public int decreaseVolume()
	{
		if(volume>0)
		{
			volume = volume - 1;
		}
		return volume;
	}
	
}
