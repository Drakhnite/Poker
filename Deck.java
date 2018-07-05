package tp18bis;

import java.util.ArrayList;
import java.util.List;

public class Deck {

	public static String[][] value = new String[][] { { "Heart", "Diamond", "Spade", "Club" },
			{ "7", "8", "9", "X", "J", "Q", "K", "A" } };

	private List<Card> deck;

	public List<Card> getDeck() {
		return deck;
	}

	public Deck() {
		this.deck = new ArrayList<Card>();
		initPokerDeck();
	}

	private void initPokerDeck() {

		for (int i = 0; i < value.length; i++) {
			for (int j = 0; j < value[i].length; j++) {

				deck.add(new Color());
				System.err.println(deck);
			}
		}
	}

	public void print() {
		for (Card card : deck) {
			card.print();

		}
	}
}
