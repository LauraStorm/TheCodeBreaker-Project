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









    }
}
