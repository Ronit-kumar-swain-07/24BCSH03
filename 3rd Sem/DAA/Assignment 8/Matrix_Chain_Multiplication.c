/*
Q1. Implementation of optimal parenthesis of given sequence of matrix using Matric Chain Multiplication
and display the intermediate tables.
*/

#include <stdio.h>
#include <limits.h>

#define MAX 100

int m[MAX][MAX];
int s[MAX][MAX];

void printOptimalParenthesis(int i, int j)
{
    if (i == j)
        printf("A%d", i);
    else
    {
        printf("(");
        printOptimalParenthesis(i, s[i][j]);
        printOptimalParenthesis(s[i][j] + 1, j);
        printf(")");
    }
}

void matrixChainOrder(int p[], int n)
{
    for (int i = 1; i <= n; i++)
        m[i][i] = 0;

    for (int l = 2; l <= n; l++)
    {
        for (int i = 1; i <= n - l + 1; i++)
        {
            int j = i + l - 1;
            m[i][j] = INT_MAX;

            for (int k = i; k < j; k++)
            {
                int q = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
                if (q < m[i][j])
                {
                    m[i][j] = q;
                    s[i][j] = k;
                }
            }
        }
    }

    printf("\nCost Table (m[i][j]):\n");
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n; j++)
        {
            if (i > j)
                printf("   - ");
            else
                printf("%4d ", m[i][j]);
        }
        printf("\n");
    }

    printf("\nSplit Table (s[i][j]):\n");
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n; j++)
        {
            if (i >= j)
                printf("  - ");
            else
                printf("%3d ", s[i][j]);
        }
        printf("\n");
    }

    printf("\nOptimal Parenthesization: ");
    printOptimalParenthesis(1, n);
    printf("\nMinimum number of multiplications: %d\n", m[1][n]);
}

int main()
{
    int n;
    printf("Enter number of matrices: ");
    scanf("%d", &n);

    int p[n + 1];
    printf("Enter dimensions : ");
    for (int i = 0; i <= n; i++)
        scanf("%d", &p[i]);

    matrixChainOrder(p, n);

    return 0;
}
