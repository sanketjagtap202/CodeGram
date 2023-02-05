package Lab04_Assignment02;

/*
 * Desciption: TO get a command from given url.
*/

public class StringUtilTest {

	public static void main(String[] args) {
		
		
		StringUtil stringUtil = new StringUtil();
		String command =stringUtil.getCommand("www.sample.com/admin/file.html");
		System.out.println("Command from url is: "+command);
	}

}
