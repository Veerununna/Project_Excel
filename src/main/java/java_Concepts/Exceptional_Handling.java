package java_Concepts;

public class Exceptional_Handling {
	
	public static void main(String[] args) {
		try {
			int i =  Integer.parseInt("1");
		}
		catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.getStackTrace();
		}
		System.out.println("End Programme");
	}

}
