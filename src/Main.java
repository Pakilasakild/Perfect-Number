import java.util.Scanner;

public class Main {
    public static boolean isPerfectNumber(int n) {
        if (n < 1){
            return false;
        }
        int sum = 0;
        for (int i = 1; i < n; i++){
            if (n % i == 0){
                sum +=i;
            }
        }
        return sum == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if (isPerfectNumber(n)){
            System.out.println(n + " is a perfect number");
        }
        else {
            System.out.println(n + " is not a perfect number");
        }
    }
}