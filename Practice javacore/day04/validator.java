package javacore.day04;

public class validator extends Applicant{
	
	public validator(String name, String post, int age) 
	{
		super(name, post, age);
	}
	{
		
	}
	
	public boolean isValidApplicantName(String s) throws InvalidNameException
	{
		String name=this.applicantname;
		if(name.isBlank()==false)
		{
			return true;
		}
		else
		{
			throw new InvalidNameException();
		}
		
	}
	public boolean isValidPost(String s) throws InvalidPostException
	{
		String post=this.postapplied;
		if(post.equals("Probationary Officer") || post.equals("Assistant") || post.equals("Special Cdre Officer"))
		{
			return true;
		}
		else
		{
			throw new InvalidPostException();
		}
		
	}
	public boolean isValidAge(int a) throws InvalidAgeException
	{
		int age=this.applicantage;
		if(age>18 && age<30)
		{
			return true;
		}
		else
		{
			throw new InvalidAgeException();
		}
		
	}

}
