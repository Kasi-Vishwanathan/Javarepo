#include <stdio.h>

// Correct function definition using ANSI C prototype
void reverseArray(int arr[], int n) {
    int start = 0;
    int end = n - 1;  // Fix: end starts at last valid index
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}

int main() {
    int arr[] = {1, 2, 3, 4, 5};
    int n = sizeof(arr) / sizeof(arr[0]);  // Calculate array size safely
    reverseArray(arr, n);
    // Loop runs within 0 to n-1 (valid indices)
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
    return 0;
}