import java.util.Scanner;
public class Chalenge4 {

    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        for(int i=0; i < n ;i++){
            String Phrase = readLine(leitor);
            System.out.println(FixOutput(Phrase));
        }
    }

    public static StringBuilder FixOutput(String Phrase){
        String FirstHalfPhrase = Phrase.substring(0, Phrase.length()/2);
        String LastHalfPhrase = Phrase.substring(Phrase.length()/2, Phrase.length());
        return new StringBuilder(FirstHalfPhrase).reverse().append( new StringBuilder(LastHalfPhrase).reverse());
    }

    public static String readLine(Scanner leitor) {
        String line = leitor.nextLine();
        while (line.isEmpty())
            line = leitor.nextLine();
        return line;
    }
}