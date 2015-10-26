
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SCFile {

	private static String path = System.getProperty("user.dir");

	public static String read(String fileName) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(path + "/texts/" + fileName));
			StringBuffer data = new StringBuffer();
			String line;
			while ((line = reader.readLine()) != null)
				data.append(line + "\n");
			reader.close();
			return data.toString();
		} catch (Exception e) {
			System.err.format("Exception occurred trying to read \"%s\".\n", fileName);
			e.printStackTrace();
			return null;
		}
	}

	public static WordList readDict(String dictName) {
		WordList wordlist = new WordList();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(path + "/dicts/" + dictName));
			String line;
			while ((line = reader.readLine()) != null)
				wordlist.add(line.trim());
			reader.close();
			return wordlist;
		} catch (Exception e) {
			System.err.format("Exception occurred trying to read \"%s\".\n", dictName);
			e.printStackTrace();
			return null;
		}
	}

	public static void writeDict(String dictName, WordList dict) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(path + "/dicts/" +  dictName));
			for (String word : dict) {
				writer.append(word);
				writer.newLine();
			} writer.close();
		} catch (IOException e) {
			System.err.format("Exception occurred trying to write in \"%s\".\n", dictName);
			e.printStackTrace();
		}

	}
}
