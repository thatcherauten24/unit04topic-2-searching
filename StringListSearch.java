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
        int high = items.size() - 1;
        int low = 0;
        int mid = (low + high) / 2;

        while (low <= high) {
            if (term == items.get(mid)) {
                return mid;
            } else if (term.compareTo(items.get(mid)) > 0) {
                low = mid + 1;
                mid = (low + high) / 2;
            } else {
                high = mid - 1;
                mid = (low + high) / 2;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        
    }
}