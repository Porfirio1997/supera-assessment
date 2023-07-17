public class Chalenge4 {

    public static void main(String args[]) {
        String Phrase = "I ENIL SIHTHSIREBBIG S";
        System.out.println(FixOutput(Phrase));
    }

    public static StringBuilder FixOutput(String Phrase){
        String FirstHalfPhrase = Phrase.substring(0, Phrase.length()/2);
        String LastHalfPhrase = Phrase.substring(Phrase.length()/2, Phrase.length());
        return new StringBuilder(FirstHalfPhrase).reverse().append( new StringBuilder(LastHalfPhrase).reverse());
    }
}