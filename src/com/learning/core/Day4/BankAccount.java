package com.learning.core.day4;

public class BankAccount {
	int accno;
	String custName;
	String accType;
	float balance;
	
	public BankAccount()
	{
		
	}
	public BankAccount(int acno,String cusnme,String type,float bal)
	{
		accno=acno;
		custName=cusnme;
		accType=type;
		balance=bal;
	}
	public void deposit(float amt) throws depositexception
	{
		if(amt>0)
		{
			balance=balance+amt;
		}
		else
		{
			throw new depositexception();
		}
	}
	
	public float getbalance() throws lowbalanceexception
	{
		
		if(((accType.equals("savings")&& (balance>1000))) || ((accType.equals("current")&& (balance>5000))))
		{
			return balance;
		}
		else
		{
			throw new lowbalanceexception();
		}
	}
	

}
