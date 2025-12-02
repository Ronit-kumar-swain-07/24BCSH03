// Q1. Implementation of Fractional Knapsack Problem.

#include <stdio.h>
#include<stdlib.h>

int main() {
    int n, capacity;
    printf("Enter number of items: ");
    scanf("%d", &n);

    int w[n], v[n];
    double r[n];
    printf("Enter weight and value:\n");
    for(int i=0; i<n; i++){
        scanf("%d %d", &w[i], &v[i]);
        r[i] = (double)v[i]/w[i];
    }

    printf("Enter knapsack capacity: ");
    scanf("%d", &capacity);

    for(int i=0;i<n-1;i++)
        for(int j=i+1;j<n;j++)
            if(r[i]<r[j]){
                double t=r[i]; r[i]=r[j]; r[j]=t;
                int tw=w[i]; w[i]=w[j]; w[j]=tw;
                int tv=v[i]; v[i]=v[j]; v[j]=tv;
            }

    double total=0;
    printf("\nSelected items:\n");
    for(int i=0;i<n && capacity>0;i++){
        if(w[i]<=capacity){
            printf("Item %d: %d (full)\n", i+1, w[i]);
            total += v[i];
            capacity -= w[i];
        } else {
            double f = (double)capacity/w[i];
            printf("Item %d: %d (%.2lf fraction)\n", i+1, capacity, f);
            total += v[i]*f;
            capacity = 0;
        }
    }

    printf("Maximum value: %.2lf\n", total);
    return 0;
}
