import java.util.*;
public class Students {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();
        int n = s.nextInt();
        int dif1 = (x - n);
        int dif2 = (y - n);
        int dif3 = (z - n);
        if (dif1 >= 0 && dif2 >= 0 && dif3 >= 0) {
            if (dif1 <= dif2 && dif1 <= dif3) {
                System.out.println("L1");

            } else if (dif2 <= dif1 && dif2 <= dif3) {
                System.out.println("L2");
            }
        } else {
            System.out.println("No Body");
        }
    }




}
