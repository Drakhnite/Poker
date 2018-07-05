package tp18bis;

public class Heart extends Color {

	// char a = '\u2665';

	@Override
	public String getArt() {

		StringBuilder card = new StringBuilder();
		card.append(" _____ ");
		card.append("\n");
		card.append("|"+value+" _ |");
		card.append("\n");
		card.append("|( v )|");
		card.append("\n");
		card.append("| \\ / |");
		card.append("\n");
		card.append("|  .  |");
		card.append("\n");
		card.append("|___"+value+"|");
		card.append("\n");
		return card.toString();
	}
}
