package adapter;

public class TestAdapter {

	public static void main(String[] args) {
		
		ISwordsman sirJohn = new Swordsman("Sir John", 50);
		sirJohn.attack();
		sirJohn.defend();
		
		IKnight sirWilliam = new Knight("Sir William", 80);
		sirWilliam.hit();
		sirWilliam.block();
		
		SwordsmanKnightAdapter adapter = new SwordsmanKnightAdapter(sirJohn);
		adapter.hit();
		adapter.block();

	}

}
