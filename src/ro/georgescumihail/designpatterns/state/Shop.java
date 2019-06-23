package ro.georgescumihail.designpatterns.state;

public class Shop {

	private String name;
	private IState state;
	
	public Shop(String name) {

		this.name = name;
		this.state = null;
	}
	
	void setState(IState state) {
		
		this.state = state;
	}
	
	public String getName() {
		
		return this.name;
	}
}
