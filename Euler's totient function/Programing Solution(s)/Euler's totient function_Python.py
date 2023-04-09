def euler_totient(n):
    phi = n
    p = 2
    while p * p <= n:
        if n % p == 0:
            phi //= p
            phi *= (p - 1)
            while n % p == 0:
                n //= p
        p += 1
    if n > 1:
        phi //= n
        phi *= (n - 1)
    return phi

n = int(input("Enter a positive integer: "))
print("Euler's Totient Function of", n, "is", euler_totient(n))
