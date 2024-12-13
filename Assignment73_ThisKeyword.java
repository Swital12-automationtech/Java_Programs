package assignments_gtm;

public class Assignment73_ThisKeyword 
{
	String username ="SwitalTest11_tech";
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public static void main(String[] args) 
	{
		Assignment73_ThisKeyword a1 = new Assignment73_ThisKeyword();
		a1.setUsername("Swital_MacwanQA123");
		System.out.println(a1.getUsername());

	}

}
