package decorator;

public class KnightPlayer extends AbstractCharacterDecorator{
	
	private String courtTitle;

	public KnightPlayer(ICharacter character, String courtTitle) {
		
		super(character);
		this.courtTitle = courtTitle;

	}

	@Override
	public void move() {

		System.out.println(courtTitle + " " + baseCharacter.getName() + " has moved");
		
	}

	@Override
	public void attack() {
		
		System.out.println(courtTitle + " " + baseCharacter.getName() + " attacked for " +
						baseCharacter.getPower() + " power");
	}

	@Override
	public String getName() {
		
		return baseCharacter.getName();
	}

	@Override
	public int getPower() {
		
		return baseCharacter.getPower();
	}

}
