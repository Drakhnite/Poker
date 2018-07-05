package tp18bis;

public class Diamond extends Color {

	// char a = '\u2666';

	@Override
	public String getArt() {
		
		StringBuilder card = new StringBuilder();
		card.append(" _____ ");
		card.append("\n");
		card.append("|%s^  |");
		card.append("\n");
		card.append("| / \\ |");
		card.append("\n");
		card.append("| \\ / |");
		card.append("\n");
		card.append("|  .  |");
		card.append("\n");
		card.append("|___%s|");
		card.append("\n");
		return card.toString();
	}

}
