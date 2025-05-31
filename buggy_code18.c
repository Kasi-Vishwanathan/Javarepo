#include <stdio.h>

void reverseArray(int arr[], int n) {
    int start = 0;
    int end = n - 1; // Correct end index to avoid out-of-bounds access
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
    int n = sizeof(arr) / sizeof(arr[0]); // Calculate array length
    reverseArray(arr, n);
    for (int i = 0; i < n; i++) { // Loop within bounds
        printf("%d ", arr[i]);
    }
    printf("\n");
    return 0;
}