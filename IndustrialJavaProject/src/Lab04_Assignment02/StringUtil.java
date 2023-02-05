package Lab04_Assignment02;

public class StringUtil {

	public String getCommand(String url) {
		// TODO Auto-generated method stub
		
		
	

	String path =url.substring(url.lastIndexOf("/"));
		
		
		return path;
	}

}
