#include <stdio.h>
#include <math.h>

int main() {
    int a, b, c;
    float root1, root2, discriminant;
    
    printf("Program for quadratic expression\n");
    printf("Write as ax^2 + bx + c\n");
    printf("Enter coefficients a, b, and c: ");
    scanf("%d %d %d", &a, &b, &c);
    
    discriminant = b * b - 4 * a * c;
    
    if (discriminant < 0) {
        printf("Roots are imaginary.\n");
    } else {
        root1 = (-b + sqrt(discriminant)) / (2.0 * a);
        root2 = (-b - sqrt(discriminant)) / (2.0 * a);
        printf("Root 1 = %.2f and Root 2 = %.2f\n", root1, root2);
    }
    
    return 0;
}
