package org.example.lesson4;

import java.util.ArrayDeque;
import java.util.List;

public class Tack20Stack {
    public boolean isValid (String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        List<Character> openBraces = List.of('{', '(', '[');

        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);
            if (openBraces.contains(curChar)) {
                //открывающая просто в стек
                stack.push(curChar);
            } else {
                // мы находимся в закрывающей
                if (stack.isEmpty()) { //если некого закрывать
                    return false;
                }
                //на стеки кто-то точно есть
                //проверяем совпадение типов
                if ((curChar == ')' && stack.peek() == '(') ||
                        (curChar == ']' && stack.peek() == '[') ||
                        (curChar == '}' && stack.peek() == '{')) {
                    stack.pop();
                }else {
                    //здесь типы скобок не совподают, значит ошибка
                    return false;
                }
            }
        }
        //проверяем что все скобки закрыты
        return stack.isEmpty();
    }
}
