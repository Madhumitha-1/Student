import java.util.*;
import java.io.*;
public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int n = sc.nextInt();
        int a = x - n;
        int b = y - n;
        int c = z - n;
        a = a < 0 ? n : a;
        b = b < 0 ? n : b;
        c = c < 0 ? n : c;
        int result = a < b ? ((a < c) ? 1 : 3) : ((b < c) ? 2 : 3);
        System.out.println(result);
    }
}
