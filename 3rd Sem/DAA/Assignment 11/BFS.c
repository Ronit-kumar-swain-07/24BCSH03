//  Q1. Implementation of Breadth-First-Search Algorithm.

#include <stdio.h>
#include<stdlib.h>

#define MAX 100

int queue[MAX], front=-1, rear=-1;

void enqueue(int v){
    queue[++rear] = v;
    if(front == -1) {
        front = 0;
    }
}

int dequeue(){
    return queue[front++];
}

int isEmpty(){
    return front > rear || front == -1;
}

int main(){
    int n;
    printf("Enter number of vertices: ");
    scanf("%d",&n);

    int adj[n][n];
    printf("Enter adjacency matrix:\n");
    for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
            scanf("%d",&adj[i][j]);

    int visited[n];
    for(int i=0;i<n;i++) visited[i]=0;

    int start;
    printf("Enter starting vertex: ");
    scanf("%d",&start);

    enqueue(start);
    visited[start]=1;

    printf("BFS Traversal: ");
    while(!isEmpty()){
        int v = dequeue();
        printf("%d ",v);

        for(int i=0;i<n;i++){
            if(adj[v][i]==1 && !visited[i]){
                enqueue(i);
                visited[i]=1;
            }
        }
    }
    return 0;
}
