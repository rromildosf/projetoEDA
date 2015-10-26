
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class WordList implements Set, Iterable<String> {

	private int size;
	private int n;
	private ArrayList<String> table[];

	public WordList() { // Não modificar
		this(20);
	}

	@SuppressWarnings("unchecked")
	public WordList(int size) { // Não modificar
		this.size = size;
		table = (ArrayList<String>[]) new ArrayList[size];
		for (int i = 0; i < size; i++)
			table[i] = new ArrayList<String>();
	}

	@SuppressWarnings("unchecked")
	public WordList(ArrayList<String> words) { // Não modificar
		this.size = (int) (words.size() / 0.75);
		table = (ArrayList<String>[]) new ArrayList[size];
		for (int i = 0; i < size; i++)
			table[i] = new ArrayList<String>();
		for (String word : words)
			add(word);
	}

	@Override
	public void add(String word) {
		// Implementar
	}

	@Override
	public void remove(String word) {
		// Implementar
	}

	@Override
	public boolean lookup(String word) {
		// Implementar
	}

	@Override
	public int size() { // Não modificar
		return n;
	}

	@Override
	public boolean isEmpty() { // Não modificar
		return n == 0;
	}

	public String toString() { // Não modificar
		String s = "";
		for (int i = 0; i < size; i++) {
			if (i < 10)
				s += i + "  |";
			else if (i < 100)
				s += i + " |";
			else
				s += i + "|";

			ArrayList<String> list = table[i];
			for (int j = 0; j < list.size(); j++) {
				if (j == 0)
					s += "[" + list.get(j) + "]";
				else
					s += "->[" + list.get(j) + "]";
			}
			s += "\n";
		}
		return s;
	}

	@Override
	public Iterator<String> iterator() { // Não modificar
		return new WordIterator();
	}

	private int hash(String word) {
		// Implementar
	}

	private void rehash(int capacity) {
		// Implementar
	}

	private ArrayList<String> words() {
		// Implementar
	}

	private double loadFactor() {
		return (double) n / size;
	}

	private class WordIterator implements Iterator<String> {
		// Não modifique esta classe! Ela serve para gerar o iterator

		private ArrayList<String> words;
		private int current = 0;

		public WordIterator() {
			words = words();
		}

		@Override
		public boolean hasNext() {
			return current < words.size();
		}

		@Override
		public String next() {
			if (!hasNext())
				return null;
			return words.get(current++);
		}

		@Override
		public void remove() {
		}

	}

	public static void main(String args[]) {
		// Esse método main serve exclusivamente para testar o funcionamento da classe WordList
		WordList wl = new WordList();
		wl.add("Ana");
		wl.add("Ada");
		wl.add("Abba");
		wl.add("Boris");
		wl.add("Caco");
		wl.add("Console");
		wl.add("Casa");
		wl.add("Cadu");
		wl.add("Dário");
		wl.add("Dóris");
		wl.add("Denna");
		wl.add("Esso");
		wl.add("Elso");
		wl.add("Edna");
		wl.add("Fela");
		wl.add("Zaad");
		wl.add("Zorro");
		System.out.println(wl);
		System.out.println(wl.loadFactor());
		wl.remove("Dário");
		wl.remove("Cadu");
		wl.remove("Denna");
		wl.remove("Caco");
		wl.remove("Casa");
		wl.remove("Zaad");
		wl.remove("Zorro");
		wl.remove("Esso");
		wl.remove("Fela");
		wl.remove("Dóris");
		wl.remove("Ana");
		wl.remove("Console");
		wl.remove("Boris");
		wl.remove("Edna");
		wl.remove("Abba");
		wl.remove("Elso");
		wl.remove("Ada");
		System.out.println(wl);
		wl.add("Óris");
		wl.add("Siris");
		wl.add("Fassos");
		wl.add("Donnes");
		wl.add("Lontus");
		wl.add("Messos");
		wl.add("Sontes");
		wl.add("Castos");
		wl.add("Meliontes");
		System.out.println(wl);
		System.out.println(wl.loadFactor());
	}
}
