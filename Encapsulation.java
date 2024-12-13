package basicprograms;

class Amazon_Program
{
	private String emailid = "testdata@gmail.com";
	 public String getEmailId()
	   {
	  return emailid;
	   }
	public void setEmailId(String emailid)
	 {
		this.emailid = emailid;
	 }
	private int age = 24;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class Encapsulation 
{
	public static void main(String[] args) 
	{
		Amazon_Program e1 = new Amazon_Program();
		e1.setEmailId("aa@gmail.com");
		System.out.println(e1.getEmailId());
		e1.setAge(55);
		System.out.println(e1.getAge());
	}

}
