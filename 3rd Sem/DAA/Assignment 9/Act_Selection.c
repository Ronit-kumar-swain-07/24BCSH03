//  Q2. Implementation of Activity Selection Problem.

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    printf("Enter number of activities: ");
    scanf("%d", &n);

    int start[n], finish[n];
    printf("Enter start times: ");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &start[i]);
    }
    printf("Enter finish times: ");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &finish[i]);
    }
    for (int i = 0; i < n - 1; i++)
        for (int j = i + 1; j < n; j++)
            if (finish[i] > finish[j])
            {
                int t = finish[i];
                finish[i] = finish[j];
                finish[j] = t;
                t = start[i];
                start[i] = start[j];
                start[j] = t;
            }

    printf("Selected Activities are: ");
    int lastFinish = 0;
    for (int i = 0; i < n; i++)
    {
        if (start[i] >= lastFinish)
        {
            printf("%d ", i + 1);
            lastFinish = finish[i];
        }
    }
}
