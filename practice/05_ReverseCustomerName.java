import java.util.Scanner;

public class ReverseCustomerName {
    static String reverseCustomerName(String customerName) {
        char[] name = customerName.toCharArray();

        for (int i = 0; i < name.length / 2; i++) {
            char temp = name[i];
            name[i] = name[name.length - 1 - i];
            name[name.length - 1 - i] = temp;
        }

        return new String(name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();

        String reversed = reverseCustomerName(customerName);

        System.out.println("Original Name: " + customerName);
        System.out.println("Reversed Name: " + reversed);
    }
}