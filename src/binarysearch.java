
public class binarysearch {


    public static void main(String[] args) {

        char[] charList = { 'a', 'b', 'c', 'd', 'e', 'k', 'm' };

        // Test: Variable is not in the list
        searchResult(searchChar(charList, 'c'));

        // Test 1: Variable is in the list
        searchResult(searchChar(charList, 'l'));

        // Test 1: Variable is in the list
        searchResult(searchChar(charList, 'b'));

    }

    public static int searchChar(char[] charArray, char search) {
        int x = Character.getNumericValue(search);

        int low = 0;
        int high = charArray.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // getNumericValue gets the numeric ASCI value of a char
            if (Character.getNumericValue(charArray[mid]) == x) {
                return search;
            }

            else if (Character.getNumericValue(charArray[mid]) < x) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }
        return -1;
    }


    public static void searchResult(int charEntry) {
        if (charEntry == -1) {
            System.out.println("Your search is not in the List");
            System.out.println();
        } else {
            System.out.println("Your letter is " + Character.toString((char) charEntry));
            System.out.println();
        }
    }

}
