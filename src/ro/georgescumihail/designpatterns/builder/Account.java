package ro.georgescumihail.designpatterns.builder;

public class Account {

	private String owner;
	private String iban;
	private float balance;
	
	private boolean isActive;
	private boolean isPremium;
	
	public Account(AccountBuilder builder) {

		this.owner = builder.owner;
		this.iban = builder.iban;
		this.balance = builder.balance;
		
		this.isActive = builder.isActive;
		this.isPremium = builder.isPremium;
	}
	
	public void display() {
		
		System.out.println(owner + " " + balance + " Premium: " + isPremium);
	}
	
	
	public static class AccountBuilder {

		private String owner;
		private String iban;
		private float balance;
		
		private boolean isActive;
		private boolean isPremium;
		
		public AccountBuilder(String owner, String iban, float balance) {

			this.owner = owner;
			this.iban = iban;
			this.balance = balance;
		}

		public AccountBuilder setActive(boolean isActive) {
			
			this.isActive = isActive;
			return this;
		}

		public AccountBuilder setPremium(boolean isPremium) {
			
			this.isPremium = isPremium;
			return this;
		}
		
		
		public Account build() {
			
			return new Account(this);
		}
		
	
	}
}
