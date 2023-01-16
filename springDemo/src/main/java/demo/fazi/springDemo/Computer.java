package demo.fazi.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Computer 
{
	@Value("Dell")
private String Company;
	@Value("75000")
private String price;
	@Autowired
private Monitor mn;
public Computer() 
{
	System.out.println("Computer created");
}
public void display()
{
	if(mn!=null)
	{
		System.out.println("Computer working fine");
		mn.displayMonitor();
		
	}
	else
	{
		System.out.println("compuer not working ");
	}
	
}
public void setCompany(String company) {
	Company = company;
}
public void setPrice(String price) {
	this.price = price;
}
public void setMn(Monitor mn) {
	this.mn = mn;
}

}
