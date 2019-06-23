package decorator;

public class TestDecorator {

	public static void main(String[] args) {
		
		ICharacter simplePlayer1 = new SimplePlayer("Peasant Bob", 5);
		ICharacter simplePlayer2 = new SimplePlayer("Apprentice Richard", 20);
		ICharacter simplePlayer3 = new SimplePlayer("Knight Francis", 50);
		
		simplePlayer1.move();
		simplePlayer1.attack();
		simplePlayer2.move();
		simplePlayer2.attack();
		simplePlayer3.move();
		simplePlayer3.attack();
		
		AbstractCharacterDecorator wizardPlayer = new WizardPlayer(simplePlayer2, "Fireball");
		
		wizardPlayer.move();
		wizardPlayer.attack();
		
		AbstractCharacterDecorator knightPlayer = new KnightPlayer(simplePlayer3, "Jarl");
		
		knightPlayer.move();
		knightPlayer.attack();
	}

}
