import java.util.Scanner;
class Solution {
    public static int divide(double dividend, double divisor) {
        return ((int)(dividend / divisor));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double dividend = sc.nextInt();
        double divisor = sc.nextInt();
        int result = divide(dividend,divisor);
    }
}
