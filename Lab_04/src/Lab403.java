import java.util.*;
public class Lab403 {
 
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String fullName;
        String firstName;
        String midName;
        String lastName;
        
        System.out.println("please enter your name, separated by a space.");
        System.out.print(":");
        fullName = scan.nextLine();
        
        int space = fullName.indexOf(' ');
        firstName = fullName.substring(0,space);
        
        System.out.println(abbreviaName(fullName)+firstName);
        
        scan.close();
 
	}
	
	public static String abbreviaName(String fName) {
		String initailletter="";
		
		for(int i=0;i<fName.length();i++) {
			if(fName.charAt(i)==' ') {
				initailletter = (initailletter+fName.charAt(i+1)).toUpperCase() ;
				initailletter += ".";
			}
		}
		 return initailletter;
	}
 
}