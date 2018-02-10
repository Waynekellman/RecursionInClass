package com.company;

public class Main {


    public static void main(String[] args) {
	// write your code here
        parens(3);
    }

    static void parens(int n) {
        parens(n,n,"");
    }

    private static void parens(int open, int close, String output) {
        if (open == 0 && close == 0) {
            System.out.println(output + ", ");
        }
        if (open > 0) {
            parens(open - 1, close, output+"(");
        }
        if (close > 0 && open < close) {
            parens(open, close -1, output + ")");
        }
    }
}
