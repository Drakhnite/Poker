package tp18bis;

public class Spade extends Color {
	
	// char a = '\u2660';

	public String getArt() {
		StringBuilder card = new StringBuilder();
		card.append(" _____ ");
		card.append("\n");
		card.append("|%s.  |");
		card.append("\n");
		card.append("| /.\\ |");
		card.append("\n");
		card.append("|(_._)|");
		card.append("\n");
		card.append("|  |  |");
		card.append("\n");
		card.append("|___%s|");
card.append("\n");
		return card.toString();
	}

}
