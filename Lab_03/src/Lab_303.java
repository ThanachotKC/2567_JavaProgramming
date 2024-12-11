import java.util.Scanner;

public class Lab_303 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Input a sentence: ");
        String sentence = scanner.nextLine();

        while (!sentence.endsWith(".")) {
            System.out.print("Input a sentence, again :");
            sentence = scanner.nextLine();
        } 
        
        {
            
            sentence = sentence.substring(0, sentence.length() - 1);

            
            String[] words = sentence.split("\\s+");
            int wordCount = words.length;

            
            int spaceCount = sentence.length() - sentence.replace(" ", "").length();

            
            System.out.println("This sentence has " + spaceCount + "spacebar.");
            System.out.println("This sentence has " + wordCount + "word.");
        }

        
        scanner.close();
    }
}
