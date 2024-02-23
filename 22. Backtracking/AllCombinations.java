import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AllCombinations {
    public static void generateAllCombinations(Map<Character, List<Character>> map, String digit,
            int i, StringBuffer combination, List<String> combinationsList) {
        if (i == digit.length()) {
            combinationsList.add(combination.toString()); // Add the generated combination to the list
            return;
        }

        char currentDigit = digit.charAt(i);
        List<Character> characters = map.get(currentDigit); // Get the characters corresponding to the current digit
        for (char chr : characters) {
            StringBuffer newCombination = new StringBuffer(combination);
            newCombination.append(chr); // Append the current character to the combination
            generateAllCombinations(map, digit, i + 1, newCombination, combinationsList); // Recursively generate
                                                                                          // combinations for the
                                                                                          // remaining digits
        }
    }

    public static void main(String[] args) {
        Map<Character, List<Character>> map = new HashMap<>();
        map.put('2', List.of('a', 'b', 'c'));
        map.put('3', List.of('d', 'e', 'f'));
        map.put('4', List.of('g', 'h', 'i'));
        map.put('5', List.of('j', 'k', 'l'));
        map.put('6', List.of('m', 'n', 'o'));
        map.put('7', List.of('p', 'q', 'r', 's'));
        map.put('8', List.of('t', 'u', 'v'));
        map.put('9', List.of('w', 'x', 'y', 'z'));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digits: ");
        String digit = sc.next();

        List<String> combinationsList = new ArrayList<>();
        StringBuffer combination = new StringBuffer();
        generateAllCombinations(map, digit, 0, combination, combinationsList);

        System.out.println(combinationsList);

        sc.close();
    }
}
