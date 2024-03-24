import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String inputStr=scanner.nextLine();

        System.out.println("Enter the Sub-String: ");
        String subStr = scanner.nextLine();

        subStrIndexFinder(inputStr, subStr);
    }

    private static void subStrIndexFinder(String inputStr, String subStr) {
        int index = inputStr.indexOf(subStr);
        System.out.println("Index of: \n"+subStr+" >> "+index);
    }
}