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

    public int romanToInt(String s) {
        return calculate(s.toUpperCase());
    }

    private int conversionTable(String roman) {
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

    private int calculate(String romanExpression){

        int expressionLenght = romanExpression.length();

        int sum = 0;

        for (int i = 0; i < expressionLenght; i++){

            int current = conversionTable(String.valueOf(romanExpression.charAt(i)));
            int next = (i + 1 < romanExpression.length())
                    ? conversionTable(String.valueOf(romanExpression.charAt(i + 1))) : 0;

            conversionTable(String.valueOf(romanExpression.charAt(i)));

            int decision = conversionRule(current, next);

            if (decision == 1){
                sum += current;
                System.out.println("Soma: " + current + " =  " + sum);
            }
            else {
                sum -= current;
                System.out.println("subtrai:  " + current + " =  " + sum);

            }

        }

        return sum;

    }

    private int conversionRule(int currentNumber, int nextNumber){
        if (currentNumber < nextNumber) {
            return 0;

        } else if (currentNumber >= nextNumber) {
            return 1;
        }
        return 0;
    }
}

