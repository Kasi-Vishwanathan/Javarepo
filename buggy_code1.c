/* buggy_code1.c - Corrected version */
#include <stdio.h>
#include <zlib.h>

#define BUFSIZE 128

int main(int argc, char **argv) {
    FILE *source;
    gzFile dest;
    int err;

    if (argc != 4) {
        fprintf(stderr, "usage: %s INFILE OUTFILE (c|d)\n", argv[0]);
        exit(1);
    }

    if (argv[3][0] == 'c') {
        /* Compress */
        char buf[BUFSIZE];
        unsigned len;

        if ((source = fopen(argv[1], "rb")) == NULL) {
            perror("fopen failed");
            exit(1);
        }
        if ((dest = gzopen(argv[2], "wb6")) == NULL) {
            fprintf(stderr, "gzopen failed\n");
            exit(1);
        }

        while ((len = fread(buf, 1, sizeof(buf), source)) > 0) {
            if (gzwrite(dest, buf, len) != len) {
                fprintf(stderr, "gzwrite failed: %s\n", gzerror(dest, &err));
                exit(1);
            }
        }

        if (ferror(source)) {
            perror("fread failed");
            exit(1);
        }

        if (fclose(source) != 0) {
            perror("fclose failed");
            exit(1);
        }
        if (gzclose(dest) != Z_OK) {
            fprintf(stderr, "gzclose failed: %s\n", gzerror(dest, &err));
            exit(1);
        }
    } else {
        /* Decompress */
        char buf[BUFSIZE];
        int len;

        if ((source = gzopen(argv[1], "rb")) == NULL) {
            fprintf(stderr, "gzopen failed\n");
            exit(1);
        }
        if ((dest = fopen(argv[2], "wb")) == NULL) {
            perror("fopen failed");
            exit(1);
        }

        while ((len = gzread(source, buf, sizeof(buf))) > 0) {
            if (fwrite(buf, 1, (size_t)len, dest) != (size_t)len) {
                perror("fwrite failed");
                exit(1);
            }
        }

        if (len < 0) {
            fprintf(stderr, "gzread failed: %s\n", gzerror(source, &err));
            exit(1);
        }

        if (fclose(dest) != 0) {
            perror("fclose failed");
            exit(1);
        }
        if (gzclose(source) != Z_OK) {
            fprintf(stderr, "gzclose failed: %s\n", gzerror(source, &err));
            exit(1);
        }
    }

    return 0;
}