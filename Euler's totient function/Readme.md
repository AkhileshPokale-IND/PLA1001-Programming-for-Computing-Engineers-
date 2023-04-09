# Euler's Totient Function

Euler's Totient Function, also known as Euler's phi function, is a mathematical function that counts the number of positive integers that are relatively prime to a given positive integer n.

## Formula

The formula for the Euler's Totient Function is:

```
ϕ(n) = n × ∏(p|n) (1 - 1/p)
```

where `ϕ(n)` is the Euler's Totient Function of `n`, `p` are the distinct prime factors of `n`, and `|` denotes "divides".

## Example

Let's take the example of `n=10`.

The prime factors of `10` are `2` and `5`.

Therefore, the Euler's Totient Function of `10` is:

```
ϕ(10) = 10 × (1-1/2) × (1-1/5) = 4
```

So, there are `4` positive integers less than or equal to `10` that are relatively prime to `10`, which are `1`, `3`, `7`, and `9`.

## Properties

Some important properties of Euler's Totient Function are:

- If `p` is a prime number, then `ϕ(p) = p - 1`.
- If `a` and `b` are relatively prime, then `ϕ(ab) = ϕ(a) × ϕ(b)`.
- If `n` is a positive integer, then `∑(d|n) ϕ(d) = n`, where `d` are the positive divisors of `n`.

## Applications

Euler's Totient Function has several applications in number theory and cryptography. It is used in:

- The RSA encryption algorithm
- The Miller-Rabin primality test
- The Pollard's rho factorization algorithm

## Implementation

Here's an example implementation of the Euler's Totient Function in Python:

```python
euler_totient(n):
    result = n
    p = 2
    while p * p <= n:
        if n % p == 0:
            while n % p == 0:
                n //= p
            result -= result // p
        p += 1
    if n > 1:
        result -= result // n
    return result
```

And here's an example implementation in Java:

```java
static int eulerTotient(int n) {
    int result = n;
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            while (n % i == 0) {
                n /= i;
            }
            result -= result / i;
        }
    }
    if (n > 1) {
        result -= result / n;
    }
    return result;
}
```

And finally, here's an example implementation in C++:

```cpp
int eulerTotient(int n) {
    int result = n;
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            while (n % i == 0) {
                n /= i;
            }
            result -= result / i;
        }
    }
    if (n > 1) {
        result -= result / n;
    }
    return result;
}
```

## References

- [Euler's totient function - Wikipedia](https://en.wikipedia.org/wiki/Euler's_totient_function)
- [Euler's Totient Function - Brilliant.org](https://brilliant.org/wiki/eulers-t)

- [Euler's Totient Function - GeeksforGeeks](https://www.geeksforgeeks.org/eulers-totient-function/)

## Conclusion

Euler's Totient Function is a powerful tool in number theory and cryptography. It can be used to compute the number of relatively prime integers to a given integer and has several applications in cryptography algorithms like RSA, Miller-Rabin primality test, and Pollard's rho factorization algorithm.
