// Q1. Implementation Prim's Minimum Spanning Tree Algorithm.

#include <stdio.h>
#define INF 9999

int main() {
    int n;
    printf("Enter number of vertices: ");
    scanf("%d",&n);

    int graph[n][n];
    printf("Enter adjacency matrix:\n");
    for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
            scanf("%d",&graph[i][j]);

    int selected[n], edges=0, min, x, y, totalCost=0;
    for(int i=0;i<n;i++) selected[i]=0;

    selected[0]=1;
    printf("Edges in MST:\n");

    while(edges < n-1){
        min = INF;
        for(int i=0;i<n;i++){
            if(selected[i]){
                for(int j=0;j<n;j++){
                    if(!selected[j] && graph[i][j]){
                        if(graph[i][j] < min){
                            min = graph[i][j];
                            x = i;
                            y = j;
                        }
                    }
                }
            }
        }
        printf("%d - %d : %d\n", x, y, min);
        selected[y] = 1;
        totalCost += min;
        edges++;
    }

    printf("Minimum Cost of MST: %d\n", totalCost);
    return 0;
}
