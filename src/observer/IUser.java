package observer;

public interface IUser {

	public void changePassword(String newPassword);
	public void addObserver(IObserver o);
}
