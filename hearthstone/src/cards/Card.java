package cards;

public class Card {
	
	public enum CardEffect {
	
		}

	protected String name;
	protected int mana;
	private int health;
	private int attack;
	private CardEffect effect;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getManaCost() {
		return mana;
	}
	public void setManaCost(int mana) {
		this.mana = mana;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public CardEffect getEffect() {
		return effect;
	}
	public void setEffect(CardEffect effect) {
		this.effect = effect;
	}
	
	
	
	
	
}
