package basicprograms;

public class ThisKeyword {
	int age;
	String name;
	double salary;
	
	void Student_details(int age, String name, double salary)
	{
		this.age = age;
		//this.globalvariable = localvariable;
		//this can only be used in non static context
	}

	public static void main(String[] args) 
	{
		ThisKeyword t1 = new ThisKeyword();
		t1.Student_details(44,"Swital", 130000);
        System.out.println(t1.age);
        System.out.println(t1.name);
        System.out.println(t1.salary);

	}
}
