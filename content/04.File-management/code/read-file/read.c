#include <stdio.h>

int main(){
    FILE* fptr;

    fptr = fopen("file.txt","r"); //r: read mode

    if(fptr == NULL){
        perror("Error ocurred while opening the file.");
        return -1;
    }
    // Read every line in the text file
    char line[256]; // Act as a buffer to hold every 256 character
    fgets(line, sizeof(line), fptr);

    // Print the content
    printf("%s\n", line);

    fclose(fptr);

    return 0;
}