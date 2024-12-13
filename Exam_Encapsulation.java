package basicprograms;

public class Exam_Encapsulation {
	 String emailid = "abc@gmail.com";
	public String getEmailid()
	{
		return emailid;
	}
	public void setEmailid(String emailid)
	{
		this.emailid = emailid;
	}

	public static void main(String[] args) 
	{
		Exam_Encapsulation e1 = new Exam_Encapsulation();
		e1.setEmailid("Swital@gmail.com");
		System.out.println(e1.getEmailid());

	}

}
