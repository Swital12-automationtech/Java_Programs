package assignments_gtm;

public class Assignment74_EncapsulationProg 
{
	String emailid = "test@gmail.com";
	String password = "ABC_123";
	public String getEmailid()
	{
		return emailid;
	}
	public void setEmailid(String emailid)
	{
		this.emailid = emailid;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static void main(String[] args) 
	{
		Assignment74_EncapsulationProg a2 = new Assignment74_EncapsulationProg();
		a2.setEmailid("Switaltest@gmail.com");
		System.out.println(a2.getEmailid());
		a2.setEmailid("Abs@#2");
		System.out.println(a2.getEmailid());

	}

}
