#include <stdio.h>


int main(){
    FILE* fptr;

    // fopen( <file-path>, <mode>);
    fptr = fopen("file.txt","r"); //r: read mode

    if(fptr != NULL){
        printf("File opened successfully! \n");
    }else{
        perror("There was an issue opening the file \n");
    }

    return 0;
}