package ReadInputModule;

import java.util.ArrayList;

public class IndexingImpl implements Indexing{

    private ArrayList<int[]> circularShiftIndex = new ArrayList<int[]>();

    @Override
    public void generateCircularShiftIndex(ArrayList<String> lines) {
        // Get line in an ArrayList
        for (int i=0;i<lines.size();i++) {
            String[] line = lines.get(i).split(" "); //Generate an array of words in a line
            for (int j=0;j<line.length;j++) {
                int[] index = {i, j};           // Add Combination of index of line and word in an array
                circularShiftIndex.add(index);  //Adding index of word in List...... set above array in list
            }
        }
    }

    @Override
    public ArrayList<int[]> getShiftedIndex() {
        return circularShiftIndex;
    }
    
}
