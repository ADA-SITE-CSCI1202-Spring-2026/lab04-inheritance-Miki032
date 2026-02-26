import java.util.Scanner;

class MathDemo {

    int min(int a, int b) {
        if (a < b) return a;
        else return b;
    }

    int max(int a, int b) {
        if (a > b) return a;
        else return b;
    }

    int sum(int[] args) {
        int s = 0;
        for (int i = 0; i < args.length; i++) {
            s += args[i];
        }
        return s;
    }

    float mean(int[] args) {
        return (float) sum(args) / args.length;
    }

    int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathDemo m = new MathDemo();

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(m.min(a, b));
        System.out.println(m.max(a, b));

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(m.sum(arr));
        System.out.println(m.mean(arr));

        int num = sc.nextInt();
        System.out.println(m.factorial(num));
    }
}