
public class Television {
	/** 
	*The purpose of this class is to model a television
	*Senay Alemayehu February 24, 2020
	*/

	String MANUFACTURER;				/** constant for the company name */
	int SCREEN_SIZE;					/** constant for the TV dimension */
	
	boolean powerOn;
	 int channel;
	int volume;
	
	
/** the purpose of this is to initialize the object of a class */
	public Television() {
		
		MANUFACTURER=" ";
		SCREEN_SIZE=0;
		channel=0;
		volume=0;
		powerOn=false;
	}
	
	public Television(Television t) {
		MANUFACTURER = t.MANUFACTURER;
		SCREEN_SIZE= t.SCREEN_SIZE;
		volume=t.volume;
		channel=t.channel;
		powerOn=t.power();
		
		
	}
	
	public Television(String manufacturer, int ScreenSize, int channel, int volume, boolean power) {
		this.MANUFACTURER=manufacturer;
		this.SCREEN_SIZE=ScreenSize;
		this.channel=channel;
		this.volume=volume;
		this.powerOn=power;
		
		
	}
	
	
	
	
	
	
	
	
	public Television (String x, int y) {
		MANUFACTURER= x;
		SCREEN_SIZE=y;
		
		powerOn=false;
		volume=20;
		channel=2;
		
	}
	
	/** Method to get the volume value */
	public int getVolume() {
		return volume;
		
		
	}
	 
	/** Method to find channel number */
	public int getChannel() {
		
		return channel;
	}
	
	/** Method to find brand */
	public String getManufacturer() {
		
		return MANUFACTURER;
	}
	
	/** Method to get dimensions */
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
	
	/** Method to set the channel number */
	public void setChannel(int channel) {
		this.channel=channel;
		
	}
	
	
	/** Unfinished!!! */
	public boolean power() {
		return true;
		
		
	}
	
	
	/** Method to increase the volume by 1 */
	public void increaseVolume() {
		volume+=1;
		
	}
	
	/** Method to decrease the volume by 1 */
	public void decreaseVolume() {
		
		volume-=1;
	}
	
	
	
	
	
	
	
	

}
