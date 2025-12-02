//  Q1. Implement Dijkstra's Single Source Shortest Path Algorithm.

#include <stdio.h>
#include <stdbool.h>
#include<stdlib.h>

#define INF 9999

int minDistance(int dist[], bool visited[], int n)
{
    int min = INF, min_index;
    for (int i = 0; i < n; i++)
        if (!visited[i] && dist[i] <= min)
        {
            min = dist[i];
            min_index = i;
        }
    return min_index;
}

int main()
{
    int n;
    printf("Enter number of vertices: ");
    scanf("%d", &n);

    int graph[n][n];
    printf("Enter adjacency matrix :\n");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            scanf("%d", &graph[i][j]);
        }
    }

    int src;
    printf("Enter source vertex: ");
    scanf("%d", &src);

    int dist[n];
    bool visited[n];
    for (int i = 0; i < n; i++)
    {
        dist[i] = INF;
        visited[i] = false;
    }

    dist[src] = 0;

    for (int count = 0; count < n - 1; count++)
    {
        int u = minDistance(dist, visited, n);
        visited[u] = true;

        for (int v = 0; v < n; v++)
        {
            if (!visited[v] && graph[u][v] && dist[u] + graph[u][v] < dist[v])
            {
                dist[v] = dist[u] + graph[u][v];
            }
        }
    }

    printf("\nVertex \t Distance from Source %d\n", src);
    for (int i = 0; i < n; i++)
        printf("%d \t %d\n", i, dist[i]);

    return 0;
}