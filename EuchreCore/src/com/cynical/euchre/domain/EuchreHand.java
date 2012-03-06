package com.cynical.euchre.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.cynical.euchre.exception.IllegalHandStateException;

public class EuchreHand {
	
	ArrayList<Card> cards;
	
	/**
	 * Creates a new EuchreHand object
	 */
	public EuchreHand() {
		this.cards = new ArrayList<Card>(5);
	}
	
	/**
	 * Adds a card to the hand.
	 * @param c The card to add.
	 * @throws IllegalHandStateException If the card hand already contained 5 cards.
	 */
	public void addCard(Card c) throws IllegalHandStateException {
		if(cards.size() < 5) {
			cards.add(c);
		}
		else {
			throw new IllegalHandStateException("Too many cards in hand"); 
		}
	}
	
	/**
	 * Removes a card from the card hand
	 * @param c The card to remove.
	 * @return True, if the card was removed successfully.
	 */
	public boolean removeCard(Card c) {
		return cards.remove(c);
	}
	
	/**
	 * Returns the card hand. This is a copy to ensure the hand isn't modified.
	 * @return A copy of the card hand.
	 */
	public List<Card> getHand() {
		List<Card> copy = new ArrayList<Card>(5);
		Collections.copy(copy, cards);
		return copy;
	}

}
