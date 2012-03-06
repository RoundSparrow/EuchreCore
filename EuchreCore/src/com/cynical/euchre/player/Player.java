package com.cynical.euchre.player;

import com.cynical.euchre.domain.Card;
import com.cynical.euchre.domain.EuchreHand;
import com.cynical.euchre.domain.Suit;

public abstract class Player implements Partner {
	
	private String name;
	private EuchreHand cardHand;
	
	
	///////////////////////////////////////////
	//	Operations while laying cards
	///////////////////////////////////////////
	
	/**
	 * Play a card from the player's hand
	 * @param c The card to play.
	 */
	public abstract void playCard(Card c);	
	
	//////////////////////////////////////////
	//	Operations when deciding trump
	//////////////////////////////////////////
	
	/**
	 * If player is the dealer, and on the first round when deciding trump, the player will 
	 * pick up the top (face up) card if trump is decided. The player must then discard a card.
	 * @return The card the player chooses to discard.
	 */
	public abstract Card pickUp(Card c);
	
	/**
	 * Order up trump to the dealer. Only available on first pass.
	 */
	public abstract void orderUp();
	
	/**
	 * Pass the opportunity to order up or call trump to the next player. 
	 */
	public abstract void pass();
	
	/**
	 * If on the second pass, player has the opportunity to call trump. They can not 
	 * choose the suit that was turned down on the first pass.
	 * @param trump The suit to make trump.
	 */
	public abstract void callTrump(Suit trump);
	
	///////////////////////////////////////////
	//	Etc.
	///////////////////////////////////////////
	
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name of the player.
	 * @param name The name of the player
	 */
	public void setName(String name) {
		this.name = name;
	}

}
