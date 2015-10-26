
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpellChecker {
	private WordList dict;
	private WordList personal;
	private WordList words;

	public SpellChecker(String dictName, String fileName) {
		// Implementar na fase 1
	}

	public WordList getMisspelled() {
		// Implementar na fase 1
	}

	public WordList getSuggestions(String word) {
		// Implementar na fase 2
	}

	public void addWord(String word) {
		// Implementar na fase 2
	}

	private WordList edit(String word) { // Implementar na fase 2
		String alpha = "abcdefghijklmnopkrstuvxwyzABCDEFGHIJKLMNOPQRSTUVXWYZàáéíóúâêôãõçÀÁÉÍÓÚÂÊÔÃÕÇ";
		WordList list = new WordList();

		// Remoções
		// Inserções
		// Transposições
		// Modificações

		return list;
	}

	private WordList splitText(String text) { // Não modificar
		Pattern p = Pattern.compile("([a-zA-ZàáéíóúâêôãõçÀÁÉÍÓÚÂÊÔÃÕÇ]+(?:-[a-zA-ZàáéíóúâêôãõçÀÁÉÍÓÚÂÊÔÃÕÇ]+)*)");
		Matcher m = p.matcher(text);
		WordList words = new WordList();
		while (m.find()) {
			words.add(m.group().toLowerCase());
		} return words;
	}

	public static void main(String[] args) {
		// Implementar na fase 1
	}
}
