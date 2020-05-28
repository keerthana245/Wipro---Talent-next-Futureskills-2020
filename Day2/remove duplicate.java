public class RemoveDuplicatesFromWord {
 
	public static String removeDuplicateCharFromGivenWord(String inputWord) {
		inputWord = inputWord.toLowerCase();
		char charsOfWord[] = inputWord.toCharArray();
		LinkedHashSet<Character> wordWithoutDuplicate = new LinkedHashSet<>();
		for (Character c : charsOfWord)
			wordWithoutDuplicate.add(c);
		StringBuilder finalOutput = new StringBuilder();
		for (Character ch : wordWithoutDuplicate)
			finalOutput.append(ch);
		return finalOutput.toString();
 
	}
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the word to remove duplicate chars:");
 
		String userInput = sc.nextLine();
 
		sc.close();
 
		System.out.println("You entered : \"" + userInput + "\"");
 
		System.out.println(
				"String after removing duplicate chars: \"" + removeDuplicateCharFromGivenWord(userInput) + "\"");
	}
 
}
