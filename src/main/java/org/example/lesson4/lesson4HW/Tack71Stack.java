package org.example.lesson4.lesson4HW;

import java.util.Stack;
//Учитывая строковый путь, который является абсолютным путем (начинающимся с косой черты '/') к
// файлу или каталогу в файловой системе в стиле Unix, преобразуйте его в упрощенный канонический путь.
//
//        В файловой системе в стиле Unix точка '.' относится к текущему каталогу, двойная точка '..'
//        относится к каталогу на более высоком уровне, а любые несколько последовательных косых черт (например, '//')
//        рассматриваются как одна косая черта '/'. Для этой проблемы любой другой формат периодов, такой как '...',
//        обрабатывается как имена файлов / каталогов.
//
//        Канонический путь должен иметь следующий формат:
//
//        Путь начинается с одной косой черты '/'.
//        Любые два каталога разделяются одной косой чертой '/'.
//        Путь не заканчивается конечным символом '/'.
//        Путь содержит только каталоги на пути от корневого каталога к целевому файлу или каталогу
//        (т.е. без точки '.' или двойной точки '..')
//        Верните упрощенный канонический путь.

//Input: path = "/home/"
//        Output: "/home"
//        Explanation: Note that there is no trailing slash after the last directory name.
//        Example 2:
//
//        Input: path = "/../"
//        Output: "/"
//        Explanation: Going one level up from the root directory is a no-op, as the root level is the highest level you can go.
//        Example 3:
//
//        Input: path = "/home//foo/"
//        Output: "/home/foo"
//        Explanation: In the canonical path, multiple consecutive slashes are replaced by a single one.
public class Tack71Stack {
    public static String simplifyPath (String path) {
        Stack<String> stack = new Stack<>();
        for (String s : path.split("/")) {
            if (s.equals("") || s.equals(".")) {
                continue;
            } else {
                if (s.equals("..")) {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                } else {
                    stack.add(s);
                }
            }
        }
        return "/" + String.join("/", stack);
    }

    public static void main (String[] args) {
        String path = "/home//foo/";
        System.out.println(simplifyPath(path));
    }
}


