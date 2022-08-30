package com.tw;

public class MultiplicationTable {
    public String create(int start, int end) {

        if(isValid(start, end)){
            generateTable(start, end);
        }
        return null;
    }

    public Boolean isValid(int start, int end) {
        return isInRange(start) && isInRange(end) && isStartNotBiggerThanEnd(start, end);
    }

    public Boolean isInRange(int number) {
        return number >=1 && number <= 1000;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return start <= end;
    }

    public String generateTable(int start, int end) {
        String line = "";
        for(int index = start; index <= end; index++) {
            line = line + generateLine(start, index) + System.lineSeparator();
        }
        return line.trim();
    }

    public String generateLine(int start, int row) {
        String line = "";
        for(int index = start; index <= row; index++) {
            line = line + index + "*" + row + "=" + (index*row) + "  ";
        }
        return line.trim();
    }
    public String generateSingleExpression(int multiplicand, int multiplier) {
        return multiplicand + "*" + multiplier + "=" + (multiplicand*multiplier);
    }
}
