package javacore.day04;

public class D04P03 {
	public static void main(String[] args)
	{
		Applicant a=new Applicant("Mary","Assistant",20);
		validator v1=new validator(a.applicantname,a.postapplied,a.applicantage);
		
		try
		{
			boolean name=v1.isValidApplicantName(v1.applicantname);
			boolean post=v1.isValidPost(v1.postapplied);
			boolean age=v1.isValidAge(v1.applicantage);
			if(name==true && post==true && age==true)
			{
				System.out.println("All Details are Valid");
			}
			
		}
		catch(InvalidNameException | InvalidPostException | InvalidAgeException e)
		{
			e.printStackTrace();
		}
		
		
	}

}
