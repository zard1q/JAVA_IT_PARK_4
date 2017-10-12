package ru.itpark;

public class Program {
    private int result = 0;



    public boolean isLetter(char c) {
        if (((int) c > 64 && (int) c < 91)||((int) c > 96 && (int) c < 123)||(((int) c > 1039 && (int) c < 1104))||(c == 1025)||(c == 1105)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isDigit(char c) {
        if ((int) c > 47 && (int) c < 58) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isUpper(char c) {
        if (((int) c > 64 && (int) c < 91)||((int) c > 1039 && (int) c < 1072)||(c == 1025)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isLower(char c) {
        if (((int) c > 96 && (int) c < 123)||(((int) c > 1071 && (int) c < 1104))||(c == 1105)) {
            return true;
        } else {
            return false;
        }
    }

    public int parse(char numbers[]){
        for (char number:numbers) {
            if (isDigit(number)) {
                result *=10;
                result += (- 48 + (int) number);
            }

        }
        return result;

    }
}
