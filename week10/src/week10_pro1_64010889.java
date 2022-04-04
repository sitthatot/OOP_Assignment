import java.util.*;
public class week10_pro1_64010889 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int input = scanner.nextInt();

        try {
            int[] Array = new int[100];
            for (int i = 0; i < 100; i++) {
                int Random = (int) (Math.random() * 100);
                Array[i] = Random;
            }
            System.out.println("the corresponding element value "+Array[input]);
        }
        catch (ArrayIndexOutOfBoundsException outOfBoundsException){
            System.out.println("index is out of bounds");
        }
    }
}
