package day16designpatterns;

public class Connection {

	private static Connection con=null;
	private Connection() {}//preventing object creation
	
	public static Connection getConnection() {
		 if(con==null)
			 con=new Connection();
		 return con;
	}//making it singleton
}

//examples of singleton in java
//->every servlet
//->spring mvc dispatcher

