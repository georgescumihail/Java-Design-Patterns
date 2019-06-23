package ro.georgescumihail.designpatterns.observer;

public class TestObserver {

	public static void main(String[] args) {
		
		IUser user = new User("MrMario", "123456");
		
		IObserver o1 = new SecondaryEmail("mario123@gmail.com");
		IObserver o2 = new SecondaryEmail("mario123@yahoo.com");
		user.addObserver(o1);
		user.addObserver(o2);
		
		user.changePassword("asdfgh");
		user.changePassword("1234");
		
		IObserver o3 = new SecondaryEmail("mariomario@something.com");
		user.addObserver(o3);
		
		user.changePassword("realpassword");
	}

}
