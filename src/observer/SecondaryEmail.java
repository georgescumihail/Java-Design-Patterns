package observer;

public class SecondaryEmail implements IObserver{

	private String email;

	
	public SecondaryEmail(String email) {
		
		this.email = email;
	}



	@Override
	public void notification(String user) {
		
		System.out.println("Notifiation on " + email + ": " + "Password changed for " + user);
		
	}

}
