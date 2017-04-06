import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LearnWords {
	
	private static int[][] letterCount = new int[25][27];
	
	public LearnWords() {
		
		for(int i = 0; i < 25; i++){
			for(int j = 0; j < 27; j++){
				letterCount[i][j] = 0;
			}
		}
		
		String fileName = "words.txt";
		String line = null;
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                String[] tokens = line.split("");
                letterCount[tokens.length][0]++;
                //createWordFiles(tokens.length, line);
                
                for(int i = 0; i < tokens.length; i++){
                	if(tokens[i].equals("a") || tokens[i].equals("A")){
                		letterCount[tokens.length][1]++;
                	}
                	else if(tokens[i].equals("b") || tokens[i].equals("B")){
                		letterCount[tokens.length][2]++;
                	}
                	else if(tokens[i].equals("c") || tokens[i].equals("C")){
                		letterCount[tokens.length][3]++;
                	}
                	else if(tokens[i].equals("d") || tokens[i].equals("D")){
                		letterCount[tokens.length][4]++;
                	}
                	else if(tokens[i].equals("e") || tokens[i].equals("E")){
                		letterCount[tokens.length][5]++;
                	}
                	else if(tokens[i].equals("f") || tokens[i].equals("F")){
                		letterCount[tokens.length][6]++;
                	}
                	else if(tokens[i].equals("g") || tokens[i].equals("G")){
                		letterCount[tokens.length][7]++;
                	}
                	else if(tokens[i].equals("h") || tokens[i].equals("H")){
                		letterCount[tokens.length][8]++;
                	}
                	else if(tokens[i].equals("i") || tokens[i].equals("I")){
                		letterCount[tokens.length][9]++;
                	}
                	else if(tokens[i].equals("j") || tokens[i].equals("J")){
                		letterCount[tokens.length][10]++;
                	}
                	else if(tokens[i].equals("k") || tokens[i].equals("K")){
                		letterCount[tokens.length][11]++;
                	}
                	else if(tokens[i].equals("l") || tokens[i].equals("L")){
                		letterCount[tokens.length][12]++;
                	}
                	else if(tokens[i].equals("m") || tokens[i].equals("M")){
                		letterCount[tokens.length][13]++;
                	}
                	else if(tokens[i].equals("n") || tokens[i].equals("N")){
                		letterCount[tokens.length][14]++;
                	}
                	else if(tokens[i].equals("o") || tokens[i].equals("O")){
                		letterCount[tokens.length][15]++;
                	}
                	else if(tokens[i].equals("p") || tokens[i].equals("P")){
                		letterCount[tokens.length][16]++;
                	}
                	else if(tokens[i].equals("q") || tokens[i].equals("Q")){
                		letterCount[tokens.length][17]++;
                	}
                	else if(tokens[i].equals("r") || tokens[i].equals("R")){
                		letterCount[tokens.length][18]++;
                	}
                	else if(tokens[i].equals("s") || tokens[i].equals("S")){
                		letterCount[tokens.length][19]++;
                	}
                	else if(tokens[i].equals("t") || tokens[i].equals("T")){
                		letterCount[tokens.length][20]++;
                	}
                	else if(tokens[i].equals("u") || tokens[i].equals("U")){
                		letterCount[tokens.length][21]++;
                	}
                	else if(tokens[i].equals("v") || tokens[i].equals("V")){
                		letterCount[tokens.length][22]++;
                	}
                	else if(tokens[i].equals("w") || tokens[i].equals("W")){
                		letterCount[tokens.length][23]++;
                	}
                	else if(tokens[i].equals("x") || tokens[i].equals("X")){
                		letterCount[tokens.length][24]++;
                	}
                	else if(tokens[i].equals("y") || tokens[i].equals("Y")){
                		letterCount[tokens.length][25]++;
                	}
                	else if(tokens[i].equals("z") || tokens[i].equals("Z")){
                		letterCount[tokens.length][26]++;
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
        
        //createProbFile();
//        for(int i = 1; i < 25; i++){
//        	System.out.println(letterCount[i][0] + " number of " + i + " letter words.");
//        	System.out.println("A: " + letterCount[i][1] + " " + "B: " + letterCount[i][2] + " " + "C: " + letterCount[i][3] + " "+ "D: " + letterCount[i][4] + " " +
//        			"E: " + letterCount[i][5] + " " + "F: " + letterCount[i][6] + " " + "G: " + letterCount[i][7] + " "+ "H: " + letterCount[i][8] + " " +
//        			"I: " + letterCount[i][9] + " " + "J: " + letterCount[i][10] + " " + "K: " + letterCount[i][11] + " "+ "L: " + letterCount[i][12] + " " +
//        			"M: " + letterCount[i][13] + " " + "N: " + letterCount[i][14] + " " + "O: " + letterCount[i][15] + " "+ "P: " + letterCount[i][16] + " " +
//        			"Q: " + letterCount[i][17] + " " + "R: " + letterCount[i][18] + " " + "S: " + letterCount[i][19] + " "+ "T: " + letterCount[i][20] + " " +
//        			"U: " + letterCount[i][21] + " " + "V: " + letterCount[i][22] + " " + "W: " + letterCount[i][23] + " "+ "X: " + letterCount[i][24] + " " +
//        			"Y: " + letterCount[i][25] + " " + "Z: " + letterCount[i][26] + " ");
//        }
	}
	
	public void createWordFiles(int num, String word){
		File file = new File(Integer.toString(num) + ".txt");
		try{
			if(file.exists()==false){
				System.out.println("Created new file");
			    file.createNewFile();
			}
			FileWriter fileWriter = new FileWriter(file, true);
			
			BufferedWriter out = new BufferedWriter(fileWriter);
			out.write(word);
			out.newLine();
			out.close();
		} catch(IOException e){
			System.out.println("Unable to add word");
		}
	}
	
	public void createProbFile(){
		File file = new File("probability.txt");
		try{
			if(file.exists()==false){
				System.out.println("Created new file");
			    file.createNewFile();
			}
			FileWriter fileWriter = new FileWriter(file, true);
			
			BufferedWriter out = new BufferedWriter(fileWriter);
			for(int i = 1; i < 25; i++){
	        	String probs = letterCount[i][1] + " " + letterCount[i][2] + " " + letterCount[i][3] + " " + letterCount[i][4] + " " +
	        			letterCount[i][5] + " " + letterCount[i][6] + " " + letterCount[i][7] + " " + letterCount[i][8] + " " + 
	        			letterCount[i][9] + " " + letterCount[i][10] + " " + letterCount[i][11] + " " + letterCount[i][12] + " " +
	        			letterCount[i][13] + " " + letterCount[i][14] + " " + letterCount[i][15] + " " + letterCount[i][16] + " " +
	        			letterCount[i][17] + " " + letterCount[i][18] + " " + letterCount[i][19] + " " + letterCount[i][20] + " " +
	        			letterCount[i][21] + " " + letterCount[i][22] + " " + letterCount[i][23] + " " + letterCount[i][24] + " " +
	        			letterCount[i][25] + " " + letterCount[i][26];
	        	out.write(probs);
	        	out.newLine();
			}
			out.close();
		} catch(IOException e){
			System.out.println("Unable to add word");
		}
	}
}
