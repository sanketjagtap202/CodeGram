package util.java;

import java.net.URL;

public class UrlCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{    
		    URL url=new URL("www.sample.com/admin/createProject.html");    
		   
		    System.out.println("File Name: "+url.getFile());    //Using getFile() method  
		    }  
		    catch(Exception e)  
		    {  
		        System.out.println(e);
		     }    
	}    
		
}	
	


