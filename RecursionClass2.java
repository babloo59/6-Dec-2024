import java.util.*;

public class RecursionClass2 {
    public static void ptintRev(String str, int index) {
        if(index == 0){
            System.out.println(str.charAt(index));
            return;
        }
        System.out.println(str.charAt(index));
        ptintRev(str, index-1);
    }

    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, int index, char element){
        if(index == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(index);
        if(currChar == element) {
            if(first == -1) {
                first = index;
            }else{
                last = index;
            }
        }

        findOccurance(str, index+1, element);
    }

    public static boolean isSorted(int arr[], int index){
        if(index == arr.length-1){
            return true;
        }
        if(arr[index] < arr[index+1]){
            // array is sorted till now
            return isSorted(arr, index+1);
        }
        else{
            return false;
        }
    }

    public static void moveAllX(String str, int index, int count, String newString){
        if(index == str.length()){
            for(int i=0; i<count;i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
        if(currChar == 'x'){
            count++;
            moveAllX(str, index+1, count, newString);
        }else {
            newString += currChar;
            moveAllX(str, index+1, count, newString);
        }
    }
    public static void main(String args[]) {
        // String str = "ABCD";
        // ptintRev(str, str.length()-1);

        // String str = "abaacdaef";
        // findOccurance(str, 0, 'e');

        // int arr[] = {1, 3, 5};
        // System.out.println(isSorted(arr, 0));

        String str = "axbcxxd";
        moveAllX(str, 0, 0, "");
    }
}
