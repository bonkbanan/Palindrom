package com.company;

public class Main {

    public static void main(String[] args) {
    String str= "abcdcba";
    Boolean isPalindrom = true;
    for (int i = 0; i < str.length(); i++) {
        if(str.charAt(i) != str.charAt(str.length() -1 - i)){
            isPalindrom=false;
        }
    }
    System.out.println(isPalindrom);
    //second way
    String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            reverse += str.charAt(str.length()-1 -i);
        }
        System.out.println(reverse);

            if(str.equals(reverse)){
                isPalindrom = true;
            }
        System.out.println(isPalindrom);
        }
}
