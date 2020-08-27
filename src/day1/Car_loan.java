package day1;

import org.testng.annotations.Test;  
public class Car_loan   
{  
@Test  
public void WebLoginCarLoan()  
{  
System.out.println("Web Login car Loan");  
}  
@Test  
public void MobileLoginCarLoan()  
{  
System.out.println(" EEENE Mobile Login car Loan");  
}  
@Test(groups= {"SmokeTest"})  
public void APILoginCarLoan()  
{  
System.out.println("API Login car Loan");  
}  
}  