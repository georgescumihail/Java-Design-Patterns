package composite;

import java.util.ArrayList;

public class SoldierGroup implements ISoldier {

	private ArrayList<ISoldier> soldiers = null;
	private String groupName;
	
	public SoldierGroup(String groupName) {

		this.groupName = groupName;
		this.soldiers = new ArrayList<>();
	}

	@Override
	public void attack() {

		for(ISoldier s : soldiers) {
			
			s.attack();
		}
	}

	@Override
	public void getInfo() {
		
		System.out.println("Group " + groupName + ": [");

		for(ISoldier s : soldiers) {
			
			s.getInfo();
		}
		
		System.out.println("]");
	}

	public void addSoldier(ISoldier s) {
		
		soldiers.add(s);
	}
	
	public void removeSoldier(ISoldier s) {
		
		soldiers.remove(s);
	}
	
	public ISoldier getSoldier(int i) {
		
		return soldiers.get(i);
	}
}
