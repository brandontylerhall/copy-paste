import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Assessment {
    public static void main(String[] args) {
        cubed(3);
        difference(3, 7);
        average(new double[]{1, 6});
        Device device1 = new Tablet("phone", "microsoft", 8, true);
    }

    public static void cubed(int x) {
        x = x * x * x;
        System.out.println("x = " + x);
    }

    public static void difference(int x, int y) {
        /*found assistance at https://www.tutorialspoint.com/java/lang/math_abs_int.htm*/
        int difference = Math.abs(x - y);
        System.out.println("difference = " + difference);
    }

    public static void average(double[] numbers) {
        double total = 0;
        for (double num : numbers) {
            total += num;
        }
        double average = total / numbers.length;
        System.out.println("average = " + average);
    }

    public static HashMap<String, Device> createInventory(ArrayList<Device> invList) {
        invList = new ArrayList<>();
        HashMap<String, Device> invHash = new HashMap<>();

        System.out.println("invList = " + invList);
        return invHash;
    }
}
