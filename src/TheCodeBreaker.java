import java.util.Locale;
import java.util.Scanner;

public class TheCodeBreaker {

    //Methods//

    static String alphabet = "abcdefghijklmnopqrstuvwxyzæøå";

    public static int characterToIndex (char character){
            int characterIndexNumber = alphabet.indexOf(character)+1;
            return characterIndexNumber;
     }

    public static char indexToCharacter(int index){
             char indexToCharacter = alphabet.charAt(index-1);
             return indexToCharacter;
    }

    public static String numberCypherEncoder (String wordInput){
    String encodedString = "";

        for (int i = 0; i < wordInput.length() ; i++) {
            char stringToIndex = wordInput.charAt(i);
            int charIndex = alphabet.indexOf(stringToIndex) + 1;

            encodedString = encodedString + charIndex + ";";
        }
        return encodedString;

    }

    public static String numberCypherDecoder (String [] numbersInput){
        String decodedString = "";

        for (int i = 0; i < numbersInput.length; i++) {
            String indexAsString = numbersInput[i];
            int stringToInt =Integer.parseInt(indexAsString)-1;

            char indexToCharacter = alphabet.charAt(stringToInt);

            decodedString = decodedString + indexToCharacter ++;

        }
        return decodedString;

    }

    public static String ceasarEncoder (String word){
        int[] wordArray = new int[word.length()];

        for (int i = 0; i < word.length(); i++) {
            char wordIndex = word.charAt(i);
            int charIndex = characterToIndex(wordIndex);

            int charIndexShift = (charIndex + 3) % alphabet.length();
            char encodedString = indexToCharacter(charIndexShift);

            System.out.print(encodedString);

        } return " ";
    }

    public static String ceasarDecoder (String word){
        int[] wordArray = new int[word.length()];

        for (int i = 0; i < word.length(); i++) {
            char wordIndex = word.charAt(i);
            int charIndex = characterToIndex(wordIndex);

            int charIndexShift = (charIndex - 3) % alphabet.length();
            char encodedString = indexToCharacter(charIndexShift);

            System.out.print(encodedString);

        } return " ";
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Intro
        System.out.println("------------------------------------\n");
        System.out.println("Welcome to - The code breaker 🔐 🔓");
        System.out.println("\n------------------------------------");


        //Number cypher//

        //Encoder
        System.out.println("\n----------------------------");
        System.out.println("** NumberCypherEncoder **");
        System.out.println("----------------------------");

        //Get a word
        System.out.println("First - let's start encode a word to numbers!🔐\nPlease write one word:");
        String word = scanner.next();
        word = word.toLowerCase(Locale.ROOT);

        //Encode word
        String wordEncodedToNumbers =  numberCypherEncoder(word);
        System.out.println("\nHere is your word encoded to numbers: \n" + wordEncodedToNumbers);

       //Decoder:
        System.out.println("\n----------------------------");
        System.out.println("** NumberCypherDecoder **");
        System.out.println("----------------------------");

        System.out.println("NOW! - Let's say your friend received your encoded message in numbers and wanted to decode it!🔓\n");
        System.out.println("Received encoded word in numbers: \n" + wordEncodedToNumbers);

        //encoded word
        String[] encodedWordArrayResult = wordEncodedToNumbers.split(";");                 //we use encoded word and put it in an array and split the numbers
        String decodedToWord = numberCypherDecoder(encodedWordArrayResult);
        String decodedWordResult = "\nDecoded to word: \n" + decodedToWord;
        System.out.println(decodedWordResult);


        //Ceasar cypher//

        //CeasarEncoder
        System.out.println("\n----------------------------");
        System.out.println("** CeasarEncoder **");
        System.out.println("----------------------------");

        //Get a word
        System.out.println("Let's try Ceasar cypher and encode a word!🔐\nPlease write one word:");
        String wordInput = scanner.next();
        wordInput = wordInput.toLowerCase(Locale.ROOT);

        //Encode word
        System.out.println("\nHere is your encoded word using Ceasar cypher:");
        String wordEncodedCeasar = ceasarEncoder(wordInput);
        System.out.println(wordEncodedCeasar);

        //CeasarDecoder
        System.out.println("\n----------------------------");
        System.out.println("** CeasarDecoder **");
        System.out.println("----------------------------");

        //Get a word
        String word2 = "khoor";
        String word2DecodedCeasar = ceasarDecoder(word2);
        System.out.println(word2DecodedCeasar);















    }



}
