package ro.georgescumihail.designpatterns.decorator;

public class WizardPlayer extends AbstractCharacterDecorator {

	private String magic;
	
	public WizardPlayer(ICharacter character, String magic) {
		
		super(character);
		this.magic = magic;
	}

	@Override
	public void move() {

		System.out.println("Wizard " + baseCharacter.getName() + " has moved");
		
	}

	@Override
	public void attack() {
		
		System.out.println("Wizard " + baseCharacter.getName() + " attacked " + " using " +
							magic + " magic ability for " + baseCharacter.getPower() + " power");
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
