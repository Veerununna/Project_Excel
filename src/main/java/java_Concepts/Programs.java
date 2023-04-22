package java_Concepts;

public class Programs {
	
	public static void main(String[] args) {
		
		String greet = "Welcome to CapGemini";
		int count=0;
		for(int i=0; i<greet.length();i++) {
			if(greet.charAt(i)!=' ') 
				count++;
			
		}
		System.out.println("No of characters in the greet : " + count );
		
		
		//Vowels & Consonents
		
		String str = "This is a really simple sentence";
		int vowelCount = 0;
		int consCount = 0;
		String vc = str.toLowerCase();
		for(int i=0;i<vc.length();i++) {
			if(vc.charAt(i)== 'a' || vc.charAt(i)== 'e' || vc.charAt(i)== 'i' || vc.charAt(i)== 'o' || vc.charAt(i)== 'u' ) {
				vowelCount++;
				
			}
			else if(vc.charAt(i)!=' ') {
				consCount++;
		   
			}
		}
		System.out.println();
		System.out.println("No of vowels : " + vowelCount);
		System.out.println("No of Cons : " + consCount);
		
		String caps = caps("hello hi");
		System.out.println(caps);
		

		String s= "hello hi how are you";
		String[] split = s.split(" ");
		for(String sp : split) {
			String substring = sp.substring(0, 1);
			String upper = substring.toUpperCase();
			String lower = sp.substring(1);
			String sent = upper + lower;
			System.out.print(sent + " ");
			}
		System.out.println();
		int num = 50;
		int l;
		int k;
		if(num>1) {
			for(l=2;l<=num;l++) {
				count= 0;
				for(k=1;k<=l;k++) {
					if(l%k==0) {
						count = count + 1;
					}
				}
			}
			if(count==2) {
			System.out.print(l + "is a prime number");
			}
			else {
				System.out.print(l + " is non prime number");
			}
				
		}
		
	}

	public static String caps(String s) {
		String sent = "";
		String[] split = s.split(" ");
		for(String sp : split) {
			String substring = sp.substring(0, 1);
			String upper = substring.toUpperCase();
			String lower = sp.substring(1);
			 sent = upper + lower;
			}
		return sent;
		
		
	}
}
