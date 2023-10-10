package OutputModule;

import java.util.ArrayList;
import java.util.List;

public class OutputImpl implements Output{

    private List<String> ignoreWords = new ArrayList<String>();
    private ArrayList<String> outputLines = new ArrayList<String>();

    public OutputImpl(List<String> ignoreWords){
        setIgnoreWords(ignoreWords);//setter method for ignore words
    }
    //Print Output
    private void printOutput(){
        System.out.println("OUTPUT:- ");
        for(int i=0;i<outputLines.size();i++){      
            System.out.println(outputLines.get(i));
        }
    }

    //Remove Noise
    private ArrayList<String> SettingOutputList(ArrayList<String> outPutLines){
        ArrayList<String> tempArrayList = new ArrayList<String>();
        
        for(int i=0; i<outPutLines.size();i++){

            String[] words = outPutLines.get(i).split(" ");
            
            //Add to temp list if first word is not a noise
            if(!ignoreWords.contains(words[0].toLowerCase())){
                tempArrayList.add(outPutLines.get(i));
            }
        }
        return tempArrayList;
    }
    @Override
    public void setOutput(ArrayList<String> outPutLines) {
        outputLines = SettingOutputList(outPutLines); // setting output lines in private variable
    }

    @Override
    public void getOutput() {
        printOutput(); //calling print method
    }

    @Override
    public void setIgnoreWords(List<String> ignoreWord) {
        ignoreWords = ignoreWord; 
    }
    
}
