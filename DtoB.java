import java.util.*;


public class DtoB {
	public static void main (String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hi! I hope you're having a good day. Sorry if you aren't. I'm a user-friendly java program. \nDo you want to convert from binary to decimal (type btd) or from decimal to binary (type dtb)?");
		String choice = scan.next();
		if (choice.equalsIgnoreCase("dtb")){
			System.out.println("What number?");
			long dec = scan.nextLong();
			String bin = "";
			while (dec>0) {
				String temp = "";
				temp += dec%2;
				temp += bin;
				bin = temp;
				dec = dec/2;
			}
			System.out.print("This is the binary: " +bin);
			
		}
		else if (choice.equalsIgnoreCase("btd")) {
			System.out.println("What binary?");
			String bin = scan.next();
			long dec = 0;
			long mostRec = 1;
			HashMap <Long,Character> pairs = new HashMap<Long,Character>(); 
			for (int i = bin.length(); i>0;i--) {
				char subby = bin.charAt(i-1);
				pairs.put(mostRec,subby);
				mostRec = mostRec*2;
			}
			for (int i = 0; i<bin.length();i++) {
				long temp = (long) Math.pow(2, i);				
				dec += ((pairs.get(temp)-'0')*(temp));
			}
			System.out.print(dec);
		}
		else {
			System.out.println("Sorry, not an option. Please restart the program and try again.");
		}
		scan.close();
	}
	
}
