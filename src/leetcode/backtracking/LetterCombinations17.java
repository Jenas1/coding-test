package leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations17 {

    static String[] arr = new String[]{"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {
        String digits = "23";
        // out ["ad","ae","af","bd","be","bf","cd","ce","cf"];

        List<String> list = letterCombinations(digits);

        for (String s : list) {
            System.out.print(s + " ");
        }
    }

    public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();

        if (digits.length() == 0)
            return list;

        //성능 메서드 + String
        StringBuilder sb = new StringBuilder();

        backtrack(list, digits, sb, 0);

        return list;
    }

    private static void backtrack(List<String> list, String digits, StringBuilder sb, int index) {

        if (sb.length() == digits.length()) {
            list.add(sb.toString());
        } else {
            int val = digits.charAt(index) - '0';

            for (int i = 0; i < arr[val - 1].length(); i++) {
                sb.append(arr[val - 1].charAt(i));
                backtrack(list, digits, sb, index + 1);

                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}