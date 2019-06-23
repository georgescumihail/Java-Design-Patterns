package adapter;

public class SwordsmanKnightAdapter implements IKnight {

	ISwordsman swordsman;
	
	
	
	public SwordsmanKnightAdapter(ISwordsman swordsman) {

		this.swordsman = swordsman;
	}

	@Override
	public void hit() {
		
		swordsman.attack();
	}

	@Override
	public void block() {

		swordsman.defend();
	}

	
}
