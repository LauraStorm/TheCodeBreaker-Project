import java.util.Scanner;

public class Test {

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
        /*

        //ceasarEncoder//
        String word = "hello";
        String wordEncodedCeacar = ceasarEncoder(word);
        System.out.println(wordEncodedCeacar);

        System.out.println("---------------------------------");

        //ceasarDecoder//
        String word2 = "khoor";
        String word2DecodedCeacar = ceasarDecoder(word2);
        System.out.println(word2DecodedCeacar);


        System.out.println("---------------------------------");
        System.out.println("Ceasar cypher - Encoder: Notes");

        String wordHello = "hello";
        int[] arrayWord = new int [wordHello.length()];

        int charIndex;

        for (int i = 0; i < wordHello.length(); i++) {
            char stringIndex = wordHello.charAt(i);
            //System.out.println(stringIndex);
            charIndex = alphabet.indexOf(stringIndex) +1;
            //System.out.println(charIndex);

            int charIndexPlus3 = (charIndex + 3) % alphabet.length();
            //System.out.println(charIndexPlus3 + "new index");
            char encodedChar = alphabet.charAt(charIndexPlus3-1);
            System.out.println(encodedChar + " char");

        }

        System.out.println("---------------------------------");
        System.out.println("Ceasar cypher - Decoder: Notes");


        String wordKhoor = "khoor";
        int[] arrayKhoor = new int[wordKhoor.length()];

        int charIndex2;

        for (int i = 0; i < wordKhoor.length(); i++) {
            char stringIndex2 = wordKhoor.charAt(i);
            //System.out.println(stringIndex2);
            charIndex2 = alphabet.indexOf(stringIndex2) + 1;
            //System.out.println(charIndex2);

            int charIndexMinus3 = (charIndex2 - 3) % alphabet.length();
            char decodedChar = alphabet.charAt(charIndexMinus3-1);
            System.out.println(decodedChar + " char");
        }

         */

        String wordBen = "ben";
        String encodedBen = numberCypherEncoder(wordBen);
        System.out.println(encodedBen);
        String [] encodedBenArray = encodedBen.split(";");

        String decodeNumbers = numberCypherDecoder(encodedBenArray);
        System.out.println(decodeNumbers);





/*
        int wordBenEncoded;
        for (int i = 0; i < wordBenArray.length; i++) {
            char currentCharacter = wordBen.charAt(i);
            wordBenEncoded = characterToIndex(currentCharacter);
            System.out.println(wordBenEncoded);


        }

 */


        //Mangler at printe i array:

        //System.out.println("\n----------------------------");
        //System.out.println("numberCypherDecoder");



        //System.out.println("----------------------------");


        //Number cypher//

        //Encoder: numberCypherEncoder
        //Input from User
        System.out.println("Please write a word and i will encode it in numbers:");
        String userWord = scanner.next();
        String wordEncoded = numberCypherEncoder(userWord);
        System.out.println(wordEncoded);
        String [] arrayResult = wordEncoded.split(";");

        //decoder her:
        String decodedWord = numberCypherDecoder(arrayResult);
        System.out.println(decodedWord);

        System.out.println("----------------------------");


        //Decoder:

    }
}
