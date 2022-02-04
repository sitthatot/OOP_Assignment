import java.util.Arrays;
import java.util.Scanner;

public class Pro2_64010889 {
    public static void main(String[] args) {
        System.out.print("Enter list1: ");
        Scanner scanner = new Scanner(System.in);
        String[] str1 = scanner.nextLine().split(" ");
        int box1[] = new int[str1.length]; // ให้ array มีขนาดเท่าไหร่
        for (int i = 0; i < str1.length; i++) {
            box1[i] = Integer.parseInt(str1[i]); //แปลง ascii เป็น int
        }

        System.out.print("Enter list2: ");
        str1 = scanner.nextLine().split(" ");
        int box2[] = new int[str1.length];
        for (int i = 0; i < str1.length; i++) {
            box2[i] = Integer.parseInt(str1[i]);
        }
        int[] merged = Merge(box1,box2);
        Arrays.sort(merged);
        System.out.print("The merged list is");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(" ");
            System.out.print(merged[i]);
        }
    }

    public static int[] Merge(int[] box1, int[] box2){
        int[] merge = new int[box1.length + box2.length];
        int c = 0;
        for (int i = 0; i < box1.length; i++) {
            merge[i] = box1[i];
            c++;
        }
        for (int j = 0; j < box2.length; j++) {
            merge[c++] = box2[j];
        }
        return merge;
    }
}
