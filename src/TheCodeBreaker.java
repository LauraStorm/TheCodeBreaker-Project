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
        String encodedString = "";

        for (int i = 0; i < word.length(); i++) {
            char wordIndex = word.charAt(i);
            int charIndex = characterToIndex(wordIndex);

            int charIndexShift = (charIndex + 3) % alphabet.length();
            char encodedChar = indexToCharacter(charIndexShift);

            encodedString = encodedString + encodedChar;

        } return encodedString;
    }

    public static String ceasarDecoder (String word){
        int[] wordArray = new int[word.length()];
        String decodedString = "";

        for (int i = 0; i < word.length(); i++) {
            char wordIndex = word.charAt(i);
            int charIndex = characterToIndex(wordIndex);

            int charIndexShift = (charIndex - 3) % alphabet.length();
            char decodedChar = indexToCharacter(charIndexShift);

            decodedString = decodedString + decodedChar;

        } return decodedString;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Intro
        System.out.println("------------------------------------\n");
        System.out.println("Welcome to - The code breaker 🔐 🔓");
        System.out.println("\n------------------------------------");


        //Number Cypher Encoder//
        System.out.println("\n----------------------------");
        System.out.println("** NumberCypherEncoder **");
        System.out.println("----------------------------");

        //Get a word
        System.out.println("First - let's start encode a word to numbers!🔐\nPlease write one word:");
        String word = scanner.next();
        word = word.toLowerCase(Locale.ROOT);

        //Encoded word
        String wordEncodedToNumbers =  numberCypherEncoder(word);
        String encodedToNumbersResult ="\nHere is your word encoded to numbers: \n" + wordEncodedToNumbers;
        System.out.println(encodedToNumbersResult);


       //Number Cypher Decoder//
        System.out.println("\n----------------------------");
        System.out.println("** NumberCypherDecoder **");
        System.out.println("----------------------------");

        System.out.println("NOW! - Let's say your friend received your encoded message in numbers and wanted to decode it!🔓\n");
        System.out.println("Received encoded word in numbers: \n" + wordEncodedToNumbers);

        //encoded word array
        String[] encodedWordArrayResult = wordEncodedToNumbers.split(";");                 //we use encoded word and put it in an array and split the numbers

        //decode word
        String decodedWord = numberCypherDecoder(encodedWordArrayResult);
        String decodedWordResult = "\nDecoded word: \n" + decodedWord;
        System.out.println(decodedWordResult);


        //Ceasar Cypher Encoder//
        System.out.println("\n----------------------------");
        System.out.println("** CeasarEncoder **");
        System.out.println("----------------------------");

        //Get a word
        System.out.println("Let's try Ceasar cypher and encode a word!🔐\nPlease write one word to encode:");
        String wordInput = scanner.next();
        wordInput = wordInput.toLowerCase(Locale.ROOT);

        //Encode word
        String wordEncodedCeasar = ceasarEncoder(wordInput);
        String resultEncodedCeasar = "\nHere is your encoded word using Ceasar cypher:\n" + wordEncodedCeasar;
        System.out.println(resultEncodedCeasar);


        //Ceasar Cypher Decoder//
        System.out.println("\n----------------------------");
        System.out.println("** CeasarDecoder **");
        System.out.println("----------------------------");

        //Get a word
        System.out.println("Now we have an encoded word - let's decode it!🔓\n");
        System.out.println("Encoded word:\n" + wordEncodedCeasar +"\n");

        //Decode word
        String wordDecodedCeasar = ceasarDecoder(wordEncodedCeasar);
        String ResultDecodedCeasar = "Decoded word:\n" + wordDecodedCeasar;
        System.out.println(ResultDecodedCeasar);















    }



}
