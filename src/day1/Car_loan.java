package day1;

import org.testng.annotations.Test;  
public class Car_loan   
{  
@Test  
public void WebLoginCarLoan()  
{  
System.out.println("Web Login car Loan  te2");  
}  
@Test  
public void MobileLoginCarLoan()  
{  
System.out.println("Mobile Login car Loan te2");  
}  
@Test(groups= {"SmokeTest"})  
public void APILoginCarLoan()  
{  
System.out.println("API Login car Loan te2");  
}  
}  