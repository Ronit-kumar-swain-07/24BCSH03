// Q2. Representation of Undirected Graph in the form of Adjacency List.

#include <stdio.h>
#include <stdlib.h>

typedef struct Node {
    int data;
    struct Node* next;
} Node;

Node* createNode(int v) {
    Node* newNode = (Node*)malloc(sizeof(Node));
    newNode->data = v;
    newNode->next = NULL;
    return newNode;
}

int main() {
    int n, e;
    printf("Enter number of Vertices: ");
    scanf("%d", &n);
    printf("Enter number of Edges: ");
    scanf("%d", &e);

    Node* adjList[n];
    for(int i=0; i<n; i++)
        adjList[i] = NULL;

    printf("Enter edges (u v):\n");
    for(int i=0; i<e; i++) {
        int u, v;
        scanf("%d %d", &u, &v);

        Node* newNode = createNode(v);
        newNode->next = adjList[u];
        adjList[u] = newNode;

        newNode = createNode(u);
        newNode->next = adjList[v];
        adjList[v] = newNode;
    }

    printf("\nAdjacency List Representation:\n");
    for(int i=0; i<n; i++) {
        printf("%d: ", i);
        Node* temp = adjList[i];
        while(temp) {
            printf("%d -> ", temp->data);
            temp = temp->next;
        }
        printf("NULL\n");
    }
    return 0;
}
