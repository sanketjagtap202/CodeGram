package Lab04_Assignment01;

public class StringUtil 
{

	public String generatePassword(String firstName, String lastName, String yob) {
		// TODO Auto-generated method stub
		
		
		String firstPart=firstName.substring(1, 4);
		String secondPart = lastName.substring(1, 4);
		String thirdPart = yob.substring(2);
		
		StringBuilder sb = new StringBuilder();
		 sb.append(firstPart+secondPart+thirdPart);
		 
return sb.toString().toLowerCase();
		
	}

	

//	

	

}


/// Sanket Jagtap 1995