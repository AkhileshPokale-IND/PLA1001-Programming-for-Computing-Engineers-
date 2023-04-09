public static int eulerTotient(int n) {
    int phi = n;
    int p = 2;
    while (p * p <= n) {
        if (n % p == 0) {
            phi /= p;
            phi *= (p - 1);
            while (n % p == 0) {
                n /= p;
            }
        }
        p++;
    }
    if (n > 1) {
        phi /= n;
        phi *= (n - 1);
    }
    return phi;
}

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    int n = input.nextInt();
    System.out.println("Euler's Totient Function of " + n + " is " + eulerTotient(n));
}
