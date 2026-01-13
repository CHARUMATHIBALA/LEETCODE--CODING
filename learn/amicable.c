#include <stdio.h>

// Function to calculate sum of proper divisors
int sumOfDivisors(int n) {
    int sum = 1;   // 1 is always a proper divisor

    for (int i = 2; i <= n / 2; i++) {
        if (n % i == 0) {
            sum += i;
        }
    }
    return sum;
}

int main() {
    int a, b;

    printf("Enter first number: ");
    scanf("%d", &a);

    printf("Enter second number: ");
    scanf("%d", &b);

    if (sumOfDivisors(a) == b && sumOfDivisors(b) == a) {
        printf("%d and %d are Amicable Numbers\n", a, b);
    } else {
        printf("%d and %d are NOT Amicable Numbers\n", a, b);
    }

    return 0;
}
