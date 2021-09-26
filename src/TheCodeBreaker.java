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
        String DecodedString = "";

        for (int i = 0; i < numbersInput.length; i++) {
            String inexAsString = numbersInput[i];
            int stringToInt =Integer.parseInt(inexAsString)-1;  // minus 1

            char indexToCharacter = alphabet.charAt(stringToInt);
            System.out.println(indexToCharacter);

        }
        return " ";

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

        System.out.println("numberCypherEncoder:");
        String wordBen = "ben";
        int[] wordBenArray = new int[wordBen.length()];


        int wordBenEncoded;
        for (int i = 0; i < wordBenArray.length; i++) {
            char currentCharacter = wordBen.charAt(i);
            wordBenEncoded = characterToIndex(currentCharacter);
            System.out.println(wordBenEncoded);

        }



        //Mangler at printe i array:

        System.out.println("----------------------------");
        System.out.println("numberCypherDecoder");

        





        System.out.println("----------------------------");


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



        //Decoder:











        /*
        String word = "ben";
        int [] result = new int[word.length()];
        for (int i = 0; i < word.length(); i++) {
            char currentCharacter = word.length(i);
            System.out.println(currentCharacter);
            int encodedIndex = characterToIndex(currentCharacter);
            result[i] = encod
        }

         */


















    }



}
