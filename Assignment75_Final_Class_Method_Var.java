package assignments_gtm;

//Final class: Cannot be extended
		final class ParentClass1 {
		    public void display() {
		        System.out.println("This is a final class. It cannot be extended.");
		    }
		}

		// Class to demonstrate final methods and variables
		class FinalMethodVar {

		    // Final variable: Value cannot be modified after initialization
		    final int finalVariable = 100;

		    // Final method: Cannot be overridden
		    public final void finalMethod() {
		        System.out.println("This is a final method. It cannot be overridden.");
		    }

		    // Non-final method for comparison
		    public void nonFinalMethod() {
		        System.out.println("This is a non-final method. It can be overridden.");
		    }
		}

		// Subclass to demonstrate overriding of non-final methods
		class SubClass extends FinalMethodVar {
		    @Override
		    public void nonFinalMethod() {
		        System.out.println("This is an overridden non-final method.");
		    }

		    // Uncommenting the code below will cause an error because finalMethod() is final
		    /*
		    @Override
		    public final void finalMethod() {
		        System.out.println("Attempting to override a final method."); // Not allowed
		    }
		    */
		}

public class Assignment75_Final_Class_Method_Var {
			
		    public static void main(String[] args) {
		        // Demonstrate final variable
		    	FinalMethodVar demo = new FinalMethodVar();
		        System.out.println("Final variable value: " + demo.finalVariable);
		        // Uncommenting the line below will cause an error because finalVariable cannot be reassigned
		        // demo.finalVariable = 200;

		        // Demonstrate final method
		        demo.finalMethod();

		        // Demonstrate non-final method
		        SubClass subclass = new SubClass();
		        subclass.nonFinalMethod(); // Overridden method
		        demo.nonFinalMethod(); // Original method from FinalDemo

		        // Demonstrate final class
		        ParentClass1 finalClass = new ParentClass1();
		        finalClass.display();
		        // Uncommenting the line below will cause an error because FinalClass cannot be extended
		        // class ExtendedFinalClass extends FinalClass {}
		    }
		


	

}
