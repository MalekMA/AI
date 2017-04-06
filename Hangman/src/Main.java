import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		//LearnWords learn = new LearnWords();
		
		System.out.print("Enter word you want Namgah to guess: ");
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		System.out.println("Word to guess: " + word);
		String[] guess = new String[word.length()];
		
		for(int i = 0; i < guess.length; i++){
				guess[i] = "_";
		}
		
		printProgress(guess);
		
		Guesser g = new Guesser();
		String first = g.initialGuess(word.length(), word);
		
		if(first != ""){
			String[] update = word.split("");
			int j = 1;
			for(int i = 0; i < update.length; i++){
				if(update[i].equals(first)){
					guess[i] = first;
					j++;
				}
			}
			printProgress(guess);
		}
		
	}
	
	public static void printProgress(String[] guess){
		for(String i : guess){
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
