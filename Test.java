import java.util.*;

class Solution{
    public int lastLength(String s){
        int i = s.length()-1;
        int count =0;
        while(i>=0 && s.charAt(i)== ' '){
           i--;
        }
        while(i>=0 && s.charAt(i) != ' '){
            count++;
            i--;
        }
        return count;
    }
}

public class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();

        Solution obj = new Solution();
        int length = obj.lastLength(s);
        System.out.println("The length of last word is: "+ length);

    }
}