#include <stdio.h>


int main(){
    FILE* fptr;

    fptr = fopen("file.txt","r");

    if(fptr == NULL) {
        perror("There was an issue opening the file \n");
        return -1;
    }

    printf("File opened successfully! \n");


    if(fclose(fptr) != 0){
        perror("Error while closing the file\n");
        return -1;
    }
        printf("File closed successfully! \n");

    return 0;
}