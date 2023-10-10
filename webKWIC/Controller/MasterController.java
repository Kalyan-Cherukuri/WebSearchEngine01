package Controller;

import AlphabetizerModule.Alphabetizer;
import AlphabetizerModule.AlphabetizerImpl;
import CircularShiftModule.CircularShift;
import CircularShiftModule.CircularShiftImpl;
import OutputModule.Output;
import OutputModule.OutputImpl;
import ReadInputModule.Indexing;
import ReadInputModule.IndexingImpl;
import ReadInputModule.ReadInput;
import ReadInputModule.ReadInputImpl;

public class MasterController{
    
    // recives call as the application starts 
    public static void  startApplication(){
        //Calls generateKwic method 
        generateKwic();
    }

    //Handeling method
    private static void generateKwic(){
        
        //read Input
        ReadInput readInput =new ReadInputImpl();
        readInput.readLines(); //Method call to read InputLines

        //Generate Indexing
        Indexing indexing = new IndexingImpl();
        indexing.generateCircularShiftIndex(readInput.getLines()); // Call method to generate index for circular shift

        //Circularshifting
        CircularShift circularShift = new CircularShiftImpl(indexing.getShiftedIndex());
        circularShift.generateCircularShift(readInput.getLines());//call method to generate circular shift lines
        
        //Alphabetizing
        Alphabetizer alphabetizer = new AlphabetizerImpl(circularShift.getShiftedList());//call method to generate sorted lines
        
        //Provide Output
        Output output = new OutputImpl(readInput.getIgnoreWords());
        output.setOutput(alphabetizer.getSortedList()); //setting Output 
        output.getOutput();//GettingOutput
    }

}