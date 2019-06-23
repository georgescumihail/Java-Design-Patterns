package ro.georgescumihail.designpatterns.composite;

public interface ISoldier {

	public void attack();
	public void getInfo();
	
	public void addSoldier(ISoldier s);
	public void removeSoldier(ISoldier s);
	public ISoldier getSoldier(int i);
	
}