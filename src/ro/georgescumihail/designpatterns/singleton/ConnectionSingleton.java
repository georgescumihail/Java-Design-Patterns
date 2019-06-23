package ro.georgescumihail.designpatterns.singleton;

public class ConnectionSingleton {

	private String name;
	private String ip;
	
	public static ConnectionSingleton uniqueConnection = null;
	
	private ConnectionSingleton(String name, String ip) {
		
		this.name = name;
		this.ip = ip;
	}
	
	public static ConnectionSingleton connect(String name, String ip) {
		
		if(uniqueConnection == null) {
			
			uniqueConnection = new ConnectionSingleton(name, ip);
		}
		
		return uniqueConnection;
	}
	
	public void printConnection() {
		
		System.out.println(uniqueConnection.name + ": " + uniqueConnection.ip);
	}
	
}
