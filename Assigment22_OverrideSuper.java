package assignments_gtm;

class User1
{
	void login()
	{
		System.out.println("This is superuser");
	}
}
class Admin1 extends User1
{
	void login()
	{
		System.out.println("This is the admin subclass");
	}
}

class Teacher1 extends User1
{
	void login()
	{
		super.login();
		System.out.println("This is the teacher subclass");
	}
}
class Student1 extends User1
{
	void login()
	{
		super.login();
		System.out.println("This is the student subclass");
	}
}
public class Assigment22_OverrideSuper
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a1 = new Student();
		a1.login();
		Teacher t1 = new Teacher();
		t1.login();
	}

}
