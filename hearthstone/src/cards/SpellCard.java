package cards;

import Heros.Hero;

public class SpellCard extends Card {
	
// Enum for spell types
	public enum SpellEffect {
		DAMAGE,
		HEAL
	}
		
	
	private Card card;
	private SpellEffect effect;
	private int amount;
	private Hero player;

	// Constructor
	public SpellCard(SpellEffect effect, int amount) {
		this.effect = effect;
		this.amount = amount;
		this.card = new Card();
		this.player = new Hero();

	
		this.player.castOn(this); 
	}

	// Getters and Setters
	public SpellEffect getEffect() {
		return effect;
	}

	public void setEffect(SpellEffect effect) {
		this.effect = effect;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public Hero getPlayer() {
		return player;
	}

	public void setPlayer(Hero player) {
		this.player = player;
	}
}
