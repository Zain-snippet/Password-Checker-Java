import java.util.Scanner;

public class PasswordChecker {

	// function to check for password validation	

boolean checkPassword(String password){
	  		String specialChar = " -':;,.!@?#£%^&*()+×÷=/_<>[]' " ;
  
    boolean length = password.length() >= 8;
    boolean small = password.chars().anyMatch(Character :: isLowerCase);
    boolean large = password.chars().anyMatch(Character:: isUpperCase);
    boolean digit = password.chars().anyMatch(Character :: isDigit);
    boolean special = password.chars().anyMatch(ch -> specialChar.indexOf(ch) != -1);
    
    // check for validation
    if(!length){
    System.out.println("\nError! password must be atleast 8 characters long \n");
    return false;
   } 
   else if(!small){
   System.out.println("\nError! \nPassword must have atleast one small letter\n");
   return false;
       }
      
     else if(!large){
      System.out.println("\nError! \n Password must have atleast one capital letter \n");
      return false;
         }
         
     else if(!digit){
      System.out.println("\nError! \n Password must have atleast one digit\n ");
      return false;
         }
         
      else if(!special){
      System.out.println("\nError! \nPassword must have atleast one special character \n");
      return false;
          }
   
    else{
     System.out.println("\nPassword entered successful");
    return true;
	  }  
	    }
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		PasswordChecker obj = new PasswordChecker();
		
	while (true){
	System.out.println("Enter password");
	System.out.println("No spaces, spaces are removed by default : ");
	String password = input.nextLine().trim();	
	password = password.replaceAll("\\s", "");
	
		boolean valid = 	obj.checkPassword(password);
		if(valid)
         break;
				}	
		
	}
}
