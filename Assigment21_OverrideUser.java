package assignments_gtm;

class User 
{
	void login()
	{
		System.out.println("This is the super user class");
	}
}
class Admin extends User
{
	void login()
	{
		System.out.println("This is the admin subclass");
	}
}

class Teacher extends User
{
	void login()
	{
		System.out.println("This is the teacher subclass");
	}
}
class Student extends User
{
	void login()
	{
		System.out.println("This is the student subclass");
	}
}
public class Assigment21_OverrideUser 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.login();
		Teacher t1 = new Teacher();
		t1.login();
		Admin a1 = new Admin();
		a1.login();
	}

}
