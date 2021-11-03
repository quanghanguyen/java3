package Ham;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class b8 {
    public static void main(String[] args) {
        int[] a = new int[5];
        b8.getValues(a);
        float avg = b8.Average(a);
        System.out.print("Average of above Array: " + avg);
    }
   
    public static void getValues(int[] a) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter values: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("Array: ");
        for(int i = 0; i < a.length; i++)               
        System.out.println(a[i]);
    }
    
    public static float Average(int[] a) {
        float avg = 0;
        for (int i = 0; i < a.length; i++) {
            avg += a[i];
        }
        avg /= (float)(a.length);
        return avg;
    }
}
