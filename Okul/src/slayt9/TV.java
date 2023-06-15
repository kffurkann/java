package slayt9;

public class TV {
	int channel = 1; // Default channel is 1
	  int volumeLevel = 1; // Default volume level is 1
	  boolean on = false; // By default TV is off
	  
	  
	  public TV() {//default const
		  System.out.println("buaraya yazýýnca nesnede otomtik çýkýyor");
	  }
	  
	  public void turnOn() {//methods
	    on = true;
	  }
	  
	  public void turnOff() {
	    on = false;
	  }
	  
	  public void setChannel(int newChannel) {
	    if (on && newChannel >= 1 && newChannel <= 120)
	      this.channel = newChannel;//gelen referansla oluþan bu sýnýfýn hýzý eþittir gelen hýz
	  }
	  
	  public void setVolume(int newVolumeLevel) {
	    if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
	      volumeLevel = newVolumeLevel;
	  }
	  
	  public void channelUp() {
	    if (on && channel < 120)
	      channel++;
	  }
	  
	  public void channelDown() {
	    if (on && channel > 1)
	      channel--;
	  }
	  
	  public void volumeUp() {
	    if (on && volumeLevel < 7)
	      volumeLevel++;
	  }
	  
	  public void volumeDown() {
	    if (on && volumeLevel > 1)
	      volumeLevel--;
	  }
}
