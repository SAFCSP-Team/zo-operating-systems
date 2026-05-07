#include <stdio.h>

int main(){
    FILE* fptr;

    fptr = fopen("file.txt","w"); //w: write mode

    if(fptr == NULL){
        perror("There was an issue opening the file \n");
        return -1;
    }

    // Write into the file
    fprintf(fptr, "Hello from my C program!\nBy DEV");

    fclose(fptr);
    return 0;
}