package com.akshaypatil;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        BigInteger value1 = scanner.nextBigInteger();
        BigInteger value2 = scanner.nextBigInteger();

        System.out.println(value1.add(value2));
        System.out.println(value1.multiply(value2));
        System.out.println(value1.subtract(value2));
        System.out.println(value1.divide(value2));

    }
}