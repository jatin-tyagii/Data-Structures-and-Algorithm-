import java.util.Scanner;
import java.lang.*;
public class anybaseadditon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int base = sc.nextInt();

        int res = anybaseadd(n1, n2, base);
        System.out.println(res);
    }
    public static int anybaseadd(int n1, int n2, int base){
        int rv = 0;
        int carry = 0;
        int power = 1;
        while (n1>0 || n2>0 || carry>0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;

            int sum  = d1+ d2+ carry;
            int dig = sum % base;
            carry = sum / base;
            rv += dig * power;
            power = power * 10;

        }
        return rv;
    }
}
