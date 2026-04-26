package br.com.LeetCodeProblems;

import java.util.HashMap;
import java.util.Map;

/**
 Leia da esquerda para a direita:

 Se o número atual for maior ou igual ao próximo → soma
 Se o número atual for menor que o próximo → subtrai

 I	1
 V	5
 X	10
 L	50
 C	100
 D	500
 M	1000


 IV	4  -> 5 - 1
 IX	9 -> 10 - 1


 Example 1:

 Input: s = "III"
 Output: 3
 Explanation: III = 3.


 Example 3:

 Input: s = "MCMXCIV"
 Output: 1994
 Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.


 */


public class RomanToInteger {

    int currentNumber = 0;
    int nextNumber = 0;
    int sum = 0;

    public int romanToInt(String s) {

        ConversionRule(s.toUpperCase());

        return 1;
    }

    private int ConversionTable(String roman) {
        Map<String, Integer> RomanNumbers = Map.of(
                "I", 1,
                "V", 5,
                "X", 10,
                "L", 50,
                "C", 100,
                "D", 500,
                "M", 1000
        );



        return RomanNumbers.get(roman);
    }

    private void ConversionRule(String romanExpression){

        int index = 0;
        int expressionLenght = romanExpression.length();

        int current = ConversionTable(String.valueOf(romanExpression.charAt(index)));
        int next = ConversionTable(String.valueOf(romanExpression.charAt(index+1)));

        for (int i = index; i < expressionLenght; i++){
            if (current < next ) {
                this.currentNumber = current;
                this.nextNumber = next;

                this.sum = 

                this.sum = nextNumber;
            } else if (current >) {

            }

        }

    };

}

