int eulerTotient(int n) {
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

int main() {
    int n;
    cout << "Enter a positive integer: ";
    cin >> n;
    cout << "Euler's Totient Function of " << n << " is " << eulerTotient(n) << endl;
    return 0;
}
