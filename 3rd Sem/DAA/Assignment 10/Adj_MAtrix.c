// Q1. Representation of Undirected Graph in the form of Adjacency Matrix.

#include <stdio.h>

int main() {
    int n, e, u, v;
    printf("Enter number of vertices: ");
    scanf("%d", &n);
    printf("Enter number of edges: ");
    scanf("%d", &e);

    int adjMat[n][n];

    for(int i = 0; i < n; i++)
        for(int j = 0; j < n; j++)
            adjMat[i][j] = 0;

    printf("Enter edges (u v):\n");
    for(int i = 0; i < e; i++) {
        scanf("%d %d", &u, &v);
        adjMat[u][v] = 1;
        adjMat[v][u] = 1;
    }

    printf("\nAdjacency Matrix Representation:\n");
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++)
            printf("%d ", adjMat[i][j]);
        printf("\n");
    }

    return 0;
}
