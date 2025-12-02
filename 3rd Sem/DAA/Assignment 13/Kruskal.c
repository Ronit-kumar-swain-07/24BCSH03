//  Q2. Implementation Kruskal Minimum Spanning Tree Algorithm.

#include <stdio.h>

#define INF 9999

int find(int parent[], int i){
    if(parent[i]==i) return i;
    return parent[i] = find(parent, parent[i]);
}

void unionSet(int parent[], int x, int y){
    parent[y] = x;
}

int main() {
    int n;
    printf("Enter number of vertices: ");
    scanf("%d",&n);

    int graph[n][n];
    printf("Enter adjacency matrix (0 if no edge):\n");
    for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
            scanf("%d",&graph[i][j]);

    int parent[n];
    for(int i=0;i<n;i++) parent[i]=i;

    int edgesInMST = 0, totalCost = 0;
    printf("Edges in MST:\n");

    while(edgesInMST < n-1){
        int min = INF, x=-1, y=-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(graph[i][j] && graph[i][j]<min){
                    min = graph[i][j];
                    x=i; y=j;
                }
            }
        }

        if(x==-1) break;

        int set_x = find(parent,x);
        int set_y = find(parent,y);
        if(set_x != set_y){
            printf("%d - %d : %d\n", x, y, min);
            unionSet(parent,set_x,set_y);
            totalCost += min;
            edgesInMST++;
        }

        graph[x][y] = graph[y][x] = 0;
    }

    printf("Minimum Cost of MST: %d\n", totalCost);
    return 0;
}
