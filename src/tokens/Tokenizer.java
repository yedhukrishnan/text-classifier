package tokens;

public class Tokenizer {
	
	private String text;
	
	public Tokenizer(String text) {
		this.text = text;
	}
	
	public String[] tokenize() {
		String[] words;
		for(String word : text.split("([\\s+\\W+])")) {
			System.out.println(word);
		}
		return new String[0];
	}

}
