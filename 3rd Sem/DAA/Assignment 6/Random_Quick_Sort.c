//  Q1. Implementation of Randomized Quick Sort. 

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
    int idx = low + rand() % (high - low + 1);

    int temp = a[idx];
    a[idx] = a[high];
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
    printf("***Randomized Quick Sort.***\n");
    srand(time(0));

    int a[20];
    int n;
    printf("Enter the Size of the Array : ");
    scanf("%d",&n);
    printf("Enter the Array Elements: \n");
    for(int i = 0; i<n; i++)
    {
        scanf("%d",&a[i]);
    }

    randomizedQuickSort(a, 0, n - 1);

    printf("Sorted array: ");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", a[i]);
    }
}