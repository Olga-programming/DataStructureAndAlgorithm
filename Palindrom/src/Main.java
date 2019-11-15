import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String newWord;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word");
        newWord = scanner.nextLine();

        //while loop
        boolean isPalindrome = true;
        int min =0;
        int max = newWord.length() - 1;
        while(min < max ){
            if (newWord.charAt(min) != newWord.charAt(max)){
                isPalindrome = false;
                break;
            }else {
                min ++;
                max --;
            }
        }
        if(isPalindrome == false){
            System.out.println("Not a palindrome");
        }else{
            System.out.println("Palindrome");
        }

        //for loop
        /*
        int length  = newWord.length();
        int i, begin, end, middle;

        begin  = 0;
        end    = length - 1;
        middle = (begin + end)/2;

        for (i = begin; i <= middle; i++) {
            if (newWord.charAt(begin) == newWord.charAt(end)) {
                begin++;
                end--;
            }
            else {
                break;
            }
        }
        if (i == middle + 1) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
        */
    }
    }
