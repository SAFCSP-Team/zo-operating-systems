#include <stdio.h>

int main(){
    FILE* fptr;

    fptr = fopen("file.txt","w+"); //w: write mode

    if(fptr == NULL){
        perror("There was an issue opening the file \n");
        return -1;
    }

    // Write into the file
    fprintf(fptr, "Hello from my C program!\nBy DEV");

    rewind(fptr); // Move the file pointer (position of an arrow in the file) to the start for reading now
    
    char line[256];
    while(fgets(line, sizeof(line), fptr )){
        printf("%s", line);
    }

    fclose(fptr);
    return 0;
}