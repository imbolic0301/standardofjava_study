package chapter07.inventory;

public class Tv {
	
	public String color;
	public boolean power;
	public int channel;
	
	public void power() {power = !power; }
	public void channelUp() { ++channel; }
	public void channelDown() { --channel; }
}	
