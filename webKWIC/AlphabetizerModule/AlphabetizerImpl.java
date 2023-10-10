package AlphabetizerModule;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AlphabetizerImpl implements Alphabetizer{
    private ArrayList<String> sortedList = new ArrayList<String>();

    public AlphabetizerImpl(ArrayList<String> lines){
        sortedList = lines;//setting Lines to private list
        mergeSort(sortedList);//calling sorting algorithm
    }

    //Sorting Algorithm
    public static void mergeSort(List<String> list) {
        if (list.size() <= 1) {
            return;
        }

        int mid = list.size() / 2;
        List<String> left = new ArrayList<>(list.subList(0, mid));
        List<String> right = new ArrayList<>(list.subList(mid, list.size()));

        // Recursively sort both halves
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves using a case-insensitive comparator
        merge(list, left, right, String.CASE_INSENSITIVE_ORDER);
    }

    private static void merge(List<String> list, List<String> left, List<String> right, Comparator<String> comparator) {
        int i = 0, j = 0, k = 0;

        // Merge left and right lists back into the original list
        while (i < left.size() && j < right.size()) {
            if (comparator.compare(left.get(i), right.get(j)) <= 0) {
                list.set(k++, left.get(i++));
            } else {
                list.set(k++, right.get(j++));
            }
        }

        // Copy remaining elements of left and right lists, if any
        while (i < left.size()) {
            list.set(k++, left.get(i++));
        }
        while (j < right.size()) {
            list.set(k++, right.get(j++));
        }
    }
    
    @Override
    public ArrayList<String> getSortedList() {
        return sortedList;
    }

}
