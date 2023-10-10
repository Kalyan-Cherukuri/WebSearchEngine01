package ReadInputModule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReadInputImpl implements ReadInput {

    private ArrayList<String> lines = new ArrayList<String>();
    @Override
    public void readLines() {
        // Scanner scanner = new Scanner(System.in);
        
        // // int i=0;  //For Debuging
        // // Read input lines till the user wants to end
        // while (true) {
        //     System.out.print("Enter a line (or press Enter to finish): ");
        //     String line = scanner.nextLine();
            
        //     // Complete the user Input
        //     if (line.isEmpty()) {
        //         break;
        //     }
            
        //     // Add the input line to the ArrayList
        //     // System.out.print(line);  //For Debug
        //     lines.add(line);
        //     // System.out.println(lines.get(i));  //For Debug
        //     // i++; //For Debug
        // }
        // // Close the scanner
        // scanner.close();
        lines = ReadFileLines.fileLines();

    }

    //Sending Lines to requesting method
    @Override
    public ArrayList<String> getLines() {
        return lines;
    }
    
    //Sending Ignore Words to requesting method
    @Override
    public List<String> getIgnoreWords() {
        List<String> ignoreArrayList = Arrays.asList("i", "me", "my", "myself", "we", "our", "ours", "ourselves", "you", "your", "yours", "yourself", "yourselves", "he", "him", "his", "himself", "she", "her", "hers", "herself", "it", "its", "itself", "they", "them", "their", "theirs", "themselves", "what", "which", "who", "whom", "this", "that", "these", "those", "am", "is", "are", "was", "were", "be", "been", "being", "have", "has", "had", "having", "do", "does", "did", "doing", "a", "an", "the", "and", "but", "if", "or", "because", "as", "until", "while", "of", "at", "by", "for", "with", "about", "against", "between", "into", "through", "during", "before", "after", "above", "below", "to", "from", "up", "down", "in", "out", "on", "off", "over", "under", "again", "further", "then", "once", "here", "there", "when", "where", "why", "how", "all", "any", "both", "each", "few", "more", "most", "other", "some", "such", "no", "nor", "not", "only", "own", "same", "so", "than", "too", "very", "s", "t", "can", "will", "just", "don", "should","now");
        return ignoreArrayList;
    }
}
