//  Q2. Implementation of Depth-First-Search Algorithm.

#include <stdio.h>
#include<stdlib.h>

int adj[100][100];
int visited[100];
int n;

void DFS(int v){
    visited[v]=1;
    printf("%d ",v);

    for(int i=0;i<n;i++){
        if(adj[v][i]==1 && !visited[i])
            DFS(i);
    }
}

int main(){
    printf("Enter number of vertices: ");
    scanf("%d",&n);

    printf("Enter adjacency matrix:\n");
    for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
            scanf("%d",&adj[i][j]);

    for(int i=0;i<n;i++) visited[i]=0;

    int start;
    printf("Enter starting vertex: ");
    scanf("%d",&start);

    printf("DFS Traversal: ");
    DFS(start);

    return 0;
}
