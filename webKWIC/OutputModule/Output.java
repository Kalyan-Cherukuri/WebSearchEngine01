package OutputModule;

import java.util.ArrayList;
import java.util.List;

public interface Output {
    void setOutput(ArrayList<String> outputLines); //setter method
    void getOutput(); //getter method
    void setIgnoreWords(List<String> ignoreWord); // setter method for ignore word
}
