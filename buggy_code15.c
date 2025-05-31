#include <stdio.h>

void bubbleSort(int arr[], size_t n) {
    for (size_t i = 0; i < n - 1; ++i) {
        int swapped = 0;
        for (size_t j = 0; j < n - i - 1; ++j) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = 1;
            }
        }
        if (!swapped) break;
    }
}

int main(void) {
    int arr[] = {5, 2, 9, 1, 5, 6};
    size_t n = sizeof(arr) / sizeof(arr[0]);
    bubbleSort(arr, n);
    for (size_t i = 0; i < n; ++i) {
        printf("%d ", arr[i]);
    }
    printf("\n");
    return 0;
}