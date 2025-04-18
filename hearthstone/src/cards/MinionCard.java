package cards;


import Heros.Hero;

public class MinionCard extends Card{
	private int attack;
	private int health;
	
	private boolean canAttack;
	private boolean taunt;
	private boolean charge;
	private boolean divineShield;
	
	public MinionCard(int attack, int health, int cost, boolean canAttack, boolean taunt, boolean charge, boolean divineShield) {
		this.attack = attack;
		this.canAttack = canAttack;
		this.health = health;
		this.taunt = taunt;
		this.charge = charge;
		this.divineShield = divineShield ;
		
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	
	public boolean isCanAttack() {
		return canAttack;
	}
	
	public void setCanAttack(boolean canAttack) {
		this.canAttack = canAttack;
	}
	
	public boolean isTaunt() {
		return taunt;
	}

	public void setTaunt(boolean taunt) {
		this.taunt = taunt;
	}

	public boolean isCharge() {
		return charge;
	}

	public void setCharge(boolean charge) {
		this.charge = charge;
	}

	public boolean isDivineShield() {
		return divineShield;
	}

	public void setDivineShield(boolean divineShield) {
		this.divineShield = divineShield;
		
	}
	
	public void attack(Hero player) {
		if(this.isDivineShield()) {
			this.setDivineShield(false);
		}
		
		if(this.isCharge()) {
			this.setCanAttack(true);
		}
		
		else if (!this.isCharge()) {
			this.setCanAttack(false);
		}
		
////		if(this.isTaunt()){
//		
//		}		
		else {
			player.setHealth(player.getHealth() - getAttack());
		}
		
	}
	
	
	
	
	
	
	
}
