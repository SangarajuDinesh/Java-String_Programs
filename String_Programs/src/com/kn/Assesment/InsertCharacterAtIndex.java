package com.kn.Assesment;

import java.util.Scanner;

public class InsertCharacterAtIndex {

public static void main(String[] args)

{

Scanner scanner = new Scanner(System.in);

String inputString = scanner.nextLine();

char character = scanner.next().charAt(0);

String result = insertChar(inputString, character, 3);

System.out.println(result);
scanner.close();

}

// Method to insert a character at a specific index in a string

public static String insertChar(String str, char ch, int index)

{

if (index < 0 || index > str.length())

{

return str;

}

StringBuilder stringBuilder = new StringBuilder(str);

stringBuilder.insert(index, ch);

return stringBuilder.toString();

}

}