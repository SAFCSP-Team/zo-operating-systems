#include <stdio.h>

int main(){
    FILE* fptr;

    fptr = fopen("file.txt","a"); //w: write mode

    if(fptr == NULL){
        perror("There was an issue opening the file \n");
        return -1;
    }

    // Write into the file
    fprintf(fptr, "\nDeveloper");

    fclose(fptr);
    return 0;
}