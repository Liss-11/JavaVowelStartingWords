import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a sentence, you only can separate the words with \", \" or \" \"");
        var myString = reader.nextLine();
        extractVowelWords(myString);
        reader.close();
    }

    public static void extractVowelWords(String myString){
        String[] allWords = myString.split("[, \\ ]");
        int vowelWords = 0;
        int errors = 0;
        for(String word : allWords){
            if(word.length() != 0){
                if(isVowel(Character.toString(word.charAt(0)))) vowelWords++;
                else errors++;
            }
        }
        System.out.print(vowelWords + " words start with VOWELS\n" + errors + " Errors");
    }

    public static Boolean isVowel(String letter){
        String[] vowels = {"a", "e", "i", "o", "u"};
       for( String vowel : vowels) {
           if (vowel.equals(letter.toLowerCase())) return true;
       }
       return false;
    }
}