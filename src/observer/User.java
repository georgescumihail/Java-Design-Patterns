package observer;

import java.util.ArrayList;

public class User implements IUser {

	private String name;
	private String password;
	private ArrayList<IObserver> observers;
	
	
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
		this.observers = new ArrayList<IObserver>();
	}

	public void addObserver(IObserver o) {
		
		observers.add(o);
	}

	@Override
	public void changePassword(String newPassword) {
	
		if(newPassword.length() > 5) {
			this.password = newPassword;
			for(IObserver o : observers)
				o.notification(name);
		}
		else
			System.out.println("Password too short!!!");
	}

}
