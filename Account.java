import java.util.Date;
public class Account
{
private int id ;
private double balance ;
private static double annualIntrestRate=0;
private Date dateCreated = new Date() ;

public int getId()
{
return id ;
}
public void setId(int id)
{
this.id = id ;
} 


public double getBalance()
{
return balance ;
}
public void setBalance(double balance)
{
this.balance = balance ;
}


public static double getAnnualIntrestRate()
{
return annualIntrestRate ;
}
public static void setAnnualIntrestRate(double annualIntrestRate)
{
Account.annualIntrestRate = annualIntrestRate ;
}

public Date getDateCreated(){
return dateCreated;
}


public Account(int id , double balance)
{
this.id = id ;
this.balance = balance ;
}


public double getMonthlyIntrestRate()
{
return (getAnnualIntrestRate()/100)/12 ;
}


public double getMonthlyIntrest()
{
return balance*getMonthlyIntrestRate() ;
}

public double withdraw(double amount)
{
if (amount>balance){
	System.out.println("Amount is out of balance");
	return 0.0 ;
}
balance -= amount ;
return amount ; 
}


public void deposit(int amount)
{
if (amount<0)
{
	System.out.println("Amount is a negative Number");
}
else 
balance += amount ;
}

}