public class Main
{
public static void main (String[] args)
{
Account a1 = new Account(1122,20000);
Account.setAnnualIntrestRate(4.5);
a1.withdraw(2500);
a1.deposit(3000);

System.out.println(a1.getBalance());
System.out.println(a1.getMonthlyIntrest());
System.out.println(a1.getDateCreated());





}




}