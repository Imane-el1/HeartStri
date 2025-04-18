package Heros;


import java.util.ArrayList;
import java.util.List;

import cards.WeaponCard;
import cards.SpellCard;
import cards.MinionCard; 
import cards.Card;
import cards.Deck;

public class Hero {
	
	private String name;
	private int health;
	private int mana;
	private int playedCards;
	
	WeaponCard weapon = new WeaponCard();
	List<Card> hand = new ArrayList<>();
	Card  randomCard = new Card();
	Deck deck = new Deck();
	
	
	// add deck and hand and power and weapon they are objects prob
	
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getPlayedCards() {
		return playedCards;
	}

	public void setPlayedCards(int playedCards) {
		this.playedCards = playedCards;
	}

	public WeaponCard getWeapon() {
		return weapon;
	}

	public void setWeapon(WeaponCard weapon) {
		this.weapon = weapon;
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public Card getRandomCard() {
		return randomCard;
	}

	public void setRandomCard(Card randomCard) {
		this.randomCard = randomCard;
	}

	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}
	
	
//	public void drawCard(Card randomCard ) {
//		 randomCard = deck.drawCard(); // method in the deck class
//		 hand.add(randomCard) ;
//		 
//	}
//	
	public void castOn(SpellCard card ) {
		if(card.getEffect().equals("DAMAGE")) {
			this.health -= card.getAmount();
		}
		else if(card.getEffect().equals("HEAL")){
			this.health += card.getAmount();
		}
		else {
			System.out.println(card.getEffect()); // edit it later
		}
	}

	public static void attackWithWeapon(WeaponCard weapon) {
	}
	
	
}


