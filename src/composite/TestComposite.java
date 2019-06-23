package composite;

public class TestComposite {

	public static void main(String[] args) {
	
	ISoldier soldier1 = new Soldier("Pikeman");
	ISoldier soldier2 = new Soldier("Pikeman");
	ISoldier soldier3 = new Soldier("Crossbowman");
	
	ISoldier smallGroup = new SoldierGroup("Auxiliaries");
	smallGroup.addSoldier(soldier1);
	smallGroup.addSoldier(soldier2);
	smallGroup.addSoldier(soldier3);
	
	smallGroup.getInfo();
	
	ISoldier soldier4 = new Soldier("Pikeman");
	ISoldier soldier5 = new Soldier("Crossbowman");
	ISoldier soldier6 = new Soldier("Pikeman");
	ISoldier soldier7 = new Soldier("Crossbowman");
	
	ISoldier swordsGroup = new SoldierGroup("Swords");
	swordsGroup.addSoldier(soldier4);
	swordsGroup.addSoldier(soldier5);
	swordsGroup.addSoldier(soldier6);
	swordsGroup.addSoldier(soldier7);
	
	swordsGroup.getInfo();
	
	ISoldier legion = new SoldierGroup("Legion");
	legion.addSoldier(swordsGroup);
	legion.addSoldier(smallGroup);
	
	legion.getInfo();
	}
}
