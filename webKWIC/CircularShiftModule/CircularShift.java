package CircularShiftModule;
import java.util.ArrayList;

public interface CircularShift {
    void generateCircularShift(ArrayList<String> lines); //generates circular shifted lines
    void setCircularShiftIndex(ArrayList<int[]> index);  //setter method to set index of lines and words
    ArrayList<String> getShiftedList();                  //getter method to get circular shifted lines
}
