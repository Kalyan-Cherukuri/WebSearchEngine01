package ReadInputModule;
import java.util.ArrayList;
import java.util.List;

public interface ReadInput {
    void readLines();              // read line from console
    ArrayList<String> getLines();  //getter method to get line
    List<String> getIgnoreWords(); // getter method for ignore words
}
