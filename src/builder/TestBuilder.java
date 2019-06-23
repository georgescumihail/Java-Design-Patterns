package builder;

public class TestBuilder {

	public static void main(String[] args) {
		
		Account account = new Account.AccountBuilder("John", "RO1234", 5000).setActive(true).setPremium(false).build();
		account.display();
	}

}
