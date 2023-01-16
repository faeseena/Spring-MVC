package demo.fazi.springDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Monitor 
{
	@Value("25")
private int size;
	@Value("55")
private int pixels;
public Monitor() 
{
  System.out.println("monitor object created");	
}
public void displayMonitor()
{
	System.out.println("Displaying Monitor with size ="+size+"pixels ="+pixels);
}
public void setSize(int size) {
	this.size = size;
}
public void setPixels(int pixels) {
	this.pixels = pixels;
}

}
