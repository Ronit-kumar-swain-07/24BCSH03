#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int partition(int a[], int low, int high)
{
    int pivot = a[high];
    int i = low - 1;

    for (int j = low; j < high; j++)
    {
        if (a[j] <= pivot)
        {
            i++;
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    int temp = a[i + 1];
    a[i + 1] = a[high];
    a[high] = temp;

    return i + 1;
}

int randomizedPartition(int a[], int low, int high)
{
    int randIndex = low + rand() % (high - low + 1);

    int temp = a[randIndex];
    a[randIndex] = a[high];
    a[high] = temp;

    return partition(a, low, high);
}

void randomizedQuickSort(int a[], int low, int high)
{
    if (low < high)
    {
        int pi = randomizedPartition(a, low, high);
        randomizedQuickSort(a, low, pi - 1);
        randomizedQuickSort(a, pi + 1, high);
    }
}

int main()
{
    srand(time(0));

    int a[] = {10, 7, 8, 9, 1, 5};
    int n = sizeof(a) / sizeof(a[0]);

    randomizedQuickSort(a, 0, n - 1);

    printf("Sorted array: ");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", a[i]);
    }
}
