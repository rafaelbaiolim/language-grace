/**

Versão C - bubblesort da documentação da Grace
sem booleano
**/
#include <stdio.h>
int v[10] = {10,9,8,7,6,5,4,3,2,1};

void bubblesort(int v[], int n) {
    int i=0, j;
    int trocou = 1;
    while (i < n-1 && trocou) {
        trocou = 0;
        for (j=0; j<(n-i-1); j+=1) {
            if (v[j] > v[j+1]) {
                int aux = v[j];
                v[j] = v[j+1];
                v[j+1] = aux;
                trocou = 1;
            }
        }
        i += 1;
    }
}

int main(){
    int i;
    printf("%s","Arranjo Inicial:\nA = ");
    for (i=0; i<10; i+=1) {
        printf("%d ", v[i]);
    }
    bubblesort(v, 10);
    printf("%s","\nArranjo ordenado:\nA = ");
    for (i=0; i<10; i+=1) {
        printf("%d ", v[i]);
    }

}