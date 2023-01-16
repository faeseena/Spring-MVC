package demo.fazi.springDemo;

public class Inmakes 
{
 private String technology;
 private int duration;
 private double amount;
public Inmakes(String technology, int duration, double amount) {
	super();
	this.technology = technology;
	this.duration = duration;
	this.amount = amount;
}
 public void mockTest()
 {
	 System.out.println("Mock test compleated");
	 System.out.println("technology "+technology);
	 System.out.println("duration "+duration);
	 System.out.println("amount "+amount);
	 
 }
}
