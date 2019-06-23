package singleton;

public class TestSingleton {

	public static void main(String[] args) {
		
		ConnectionSingleton connection1 = ConnectionSingleton.connect("first", "192.140.1.110");
		ConnectionSingleton connection2 = ConnectionSingleton.connect("second", "192.140.1.112");
		
		connection1.printConnection();
		connection2.printConnection();
		
	}

}
