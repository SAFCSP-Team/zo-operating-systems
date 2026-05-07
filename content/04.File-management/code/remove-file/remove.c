#include <stdio.h>

int main(){
    
    if (remove("file.txt") == 0) {
        printf("File deleted successfully.\n");
    } else {
        perror("Error deleting the file");
        return -1;
    }

    return 0;
}