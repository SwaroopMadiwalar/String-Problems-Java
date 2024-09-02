import java.util.Arrays;

public class Sortstring {
    public static void main(String[] args) {
        String str = "swaroop";
        char arr[] = str.toCharArray();
        char temp;

        //Approach1
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(new String(arr));

        //Approach2
         String str1 = "swaroop";
         char[] charArray = str1.toCharArray();
         Arrays.sort(charArray);
         System.out.println(new String(charArray));

    }
}
