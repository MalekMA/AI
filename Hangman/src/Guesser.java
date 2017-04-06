import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Guesser {
	
	private static int[] probabilities = new int[26];
	private static String guess = "";
	
	public String initialGuess(int length, String word){
		getProbabilities(length);
		boolean found = false;
		while(found == false){
			getLargest();
			System.out.println("Current guess: " + guess);
			if(word.indexOf(guess) != -1){
				found = true;
				System.out.println(guess + " found");
			}
			else{
				found = false;
			}
		}
		return this.guess;
	}
	
	private void getProbabilities(int length){
		String fileName = "probability.txt";
		String line = null;
		try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            int lineCount = 0;
            while((line = bufferedReader.readLine()) != null) {
            	lineCount++;
            	if(lineCount == length){
            		String[] nums = line.split(" ");
            		
            		int i = 0;
            		for(String p : nums){
            			probabilities[i] = Integer.parseInt(p);
            			i++;
            		}
            	}
            }   
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
        }
	}
	
	private void getLargest(){
		int largest = -1;
		int index = 0;
		for(int i = 0; i < probabilities.length; i++){
			if(probabilities[i] > largest){
				largest = probabilities[i];
				index = i;
			}
		}
		probabilities[index] = -1;
		this.guess = convertToLetter(index);
		
	}
	
	private String convertToLetter(int i){
		if(i == 0){
			return "a";
		}
		else if(i == 1){
			return "b";
		}
		else if(i == 2){
			return "c";
		}
		else if(i == 3){
			return "d";
		}
		else if(i == 4){
			return "e";
		}
		else if(i == 5){
			return "f";
		}
		else if(i == 6){
			return "g";
		}
		else if(i == 7){
			return "h";
		}
		else if(i == 8){
			return "i";
		}
		else if(i == 9){
			return "j";
		}
		else if(i == 10){
			return "k";
		}
		else if(i == 11){
			return "l";
		}
		else if(i == 12){
			return "m";
		}
		else if(i == 13){
			return "n";
		}
		else if(i == 14){
			return "o";
		}
		else if(i == 15){
			return "p";
		}
		else if(i == 16){
			return "q";
		}
		else if(i == 17){
			return "r";
		}
		else if(i == 18){
			return "s";
		}
		else if(i == 19){
			return "t";
		}
		else if(i == 20){
			return "u";
		}
		else if(i == 21){
			return "v";
		}
		else if(i == 22){
			return "w";
		}
		else if(i == 23){
			return "x";
		}
		else if(i == 24){
			return "y";
		}
		else if(i == 25){
			return "z";
		}
		else {
			return "UNKNOWN";
		}
	}
	
	private boolean checkIfExists(int length, String word){
		String fileName = Integer.toString(length) + ".txt";
		String line = null;
		try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            while((line = bufferedReader.readLine()) != null) {
            	if(line.equals(word)){
            		System.out.println("Word exists.");
            		return true;
            	}
            }   
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
        }
		System.out.println("Word does not exist!");
		return false;
	}
	
}
