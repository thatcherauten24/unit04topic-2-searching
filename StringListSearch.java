import java.util.ArrayList;

public class StringListSearch {

    public static int unorderedSearch(ArrayList<String> items, String term) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(term)) {
                return i;
            }
        }
        return -1;
    }

    public static int orderedLinearSearch(ArrayList<String> items, String term) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(term)) {
                return i;
            }
            if (items.get(i).compareTo(term) > 0) {
                return -1;
            }
        }
        return -1;
    }

    public static int orderedBinarySearch(ArrayList<String> items, String term) {
        int start = 0;
        int midpoint = items.size() / 2;
        int end = items.size() - 1;

        while (start != end) {
            if (items.get(midpoint).equals(term)) {
                return midpoint;
            } else if (items.get(midpoint).compareTo(term) < 0) {
                start = midpoint;
            } else if (items.get(midpoint).compareTo(term) > 0) {
                end = midpoint;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        
    }
}