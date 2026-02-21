package lab03;

import java.util.Scanner;

public class ex2 {

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }


    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


    public static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {


        if (args.length > 0) {

            int[] arr = new int[args.length];

            for (int i = 0; i < args.length; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }

            System.out.println("From Command Line:");
            System.out.println("Minimum: " + findMin(arr));
            System.out.println("Maximum: " + findMax(arr));

            int[] result = findMinMax(arr);
            System.out.println("Both (Min, Max): " + result[0] + ", " + result[1]);
        }


        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter size of array: ");
        int n = sc.nextInt();

        int[] arr2 = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("From Scanner Input:");
        System.out.println("Minimum: " + findMin(arr2));
        System.out.println("Maximum: " + findMax(arr2));

        int[] result2 = findMinMax(arr2);
        System.out.println("Both (Min, Max): " + result2[0] + ", " + result2[1]);

        sc.close();
    }
}
