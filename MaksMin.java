import java.util.Scanner;

public class ClosestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dizideki sayıları giriniz: ");
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Girilen sayı: ");
        int target = scanner.nextInt();

        int closestSmallerNumber = Integer.MAX_VALUE;
        int closestGreaterNumber = Integer.MIN_VALUE;
        for (int number : array) {
            if (number < target && number > closestSmallerNumber) {
                closestSmallerNumber = number;
            }
            if (number > target && number < closestGreaterNumber) {
                closestGreaterNumber = number;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestSmallerNumber);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestGreaterNumber);
    }
}
