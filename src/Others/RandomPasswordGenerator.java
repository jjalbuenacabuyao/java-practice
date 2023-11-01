package Others;

import java.util.Random;

public class RandomPasswordGenerator {
    static Random random = new Random();

    static public String generateRandom(int length, char[] sourceArray){
        String generatedOutput = "";

        for (int i = 0; i <= length; i++){
            int index = random.nextInt(0,26);
            generatedOutput += sourceArray[index];
        }

        return  generatedOutput;
    }
    public static void main(String[] args) {
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String characters = "!@#$%^&*()?/>.<,{[]}|\\+=-_";
        char[] lettersArray = letters.toCharArray();
        char[] charactersArray = characters.toCharArray();

        int randomNumber = random.nextInt(1,1_000_000);
        String randomLetters = generateRandom(8, lettersArray);
        String randomCharacters = generateRandom(5, charactersArray);

        String generatedPassword = randomLetters + randomCharacters + randomNumber;
        System.out.println(generatedPassword);
    }
}
