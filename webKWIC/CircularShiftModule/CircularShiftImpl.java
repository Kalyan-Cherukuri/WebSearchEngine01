package CircularShiftModule;
import java.util.ArrayList;

public class CircularShiftImpl implements CircularShift {

    private ArrayList<int[]> circularShiftIndex = new ArrayList<int[]>();
    private ArrayList<String> circularShiftedListed = new ArrayList<String>(); 
    
    public CircularShiftImpl(ArrayList<int[]> circularShiftIndex) {
        setCircularShiftIndex(circularShiftIndex); // call setter method setting the indexs of line and word
    }

    @Override
    public void generateCircularShift(ArrayList<String> lines){
        
        for(int i=0; i<circularShiftIndex.size();i++){

            int[] index = circularShiftIndex.get(i); // get line number and word number
            int lineNumber = index[0]; // set line number
            int wordNumber = index[1]; // set word number
            String[] wordsInLine = lines.get(lineNumber).split(" "); //create an array of all words in line
            boolean toAppend = true; // to get first word in shifting
            StringBuilder tempString = new StringBuilder(); //String after first word of line
            StringBuilder currentLine = new StringBuilder(); //final current line

            for (int j=0;j<wordsInLine.length;j++) {
                if (toAppend) {
                    String toAdd = wordsInLine[j];
                    if (j==wordNumber) {
                        toAppend = false;
                        currentLine.append(toAdd).append(" "); //First word of shifted line is added to final line tuened toappened as false 
                    } else {                    
                        tempString.append(toAdd) // second word onwards will be appended to this list
                        .append(" ");
                    }
                } else {
                    currentLine.append(wordsInLine[j]) // if toAppend is turned false rest of the word can be added to final string
                                .append(" ");
                }
            }
        currentLine.append(tempString.toString()); //append rest of the string to final line
        circularShiftedListed.add(currentLine.toString().trim());
        }
        
    }

    @Override
    public void setCircularShiftIndex(ArrayList<int[]> index) {
        circularShiftIndex = index;
    }

    @Override
    public ArrayList<String> getShiftedList() {
        return circularShiftedListed;
    }
}
