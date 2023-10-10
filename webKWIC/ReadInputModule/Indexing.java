package ReadInputModule;

import java.util.ArrayList;

public interface Indexing {

    ArrayList<int[]> getShiftedIndex(); //getter method for index
    void generateCircularShiftIndex(ArrayList<String> lines); //Generate Index
    
}
