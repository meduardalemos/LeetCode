import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_13 {

    // Task: Given a roman numeral, convert it to an integer.

    public static void main(String[] args) {
        String romanNumber = "MCMXCIV";
        System.out.println(solution01(romanNumber));
        System.out.println(solution02(romanNumber));
        System.out.println(solution03(romanNumber));
    }

    public static int solution01 (String s) {
        // Criar um dicionario com os valores por letra
        Map<Character, Integer> romanNumbers = new HashMap<>();
        romanNumbers.put('I', 1);
        romanNumbers.put('V', 5);
        romanNumbers.put('X', 10);
        romanNumbers.put('L', 50);
        romanNumbers.put('C', 100);
        romanNumbers.put('D', 500);
        romanNumbers.put('M', 1000);

        // Instancia variavel para acumular os valores das letras
        int sumLetters = 0;

        /* Percorre a string pegando letra por letra da esquerda para direita até a penultima
        letra somando ou subtraindo os resultados dependendo do valor da próxima letra */
        for (int i = 0; i < s.length() - 1; i++) {
            char letter = s.charAt(i);
            char nextLetter = s.charAt(i + 1);
            // Verifica se a letra atual é menor que próxima letra
            if(romanNumbers.get(letter) < romanNumbers.get(nextLetter)){
                sumLetters -= romanNumbers.get(letter);
            } else {
                sumLetters += romanNumbers.get(letter);
            }
        }

        // Soma a última letra
        sumLetters += romanNumbers.get(s.charAt(s.length() - 1));

        return sumLetters;
    }

    public static int solution02 (String s) {
        Map<Character, Integer> romanNumbers = new HashMap<>();
        romanNumbers.put('I', 1);
        romanNumbers.put('V', 5);
        romanNumbers.put('X', 10);
        romanNumbers.put('L', 50);
        romanNumbers.put('C', 100);
        romanNumbers.put('D', 500);
        romanNumbers.put('M', 1000);

        int sumLetters = 0;

        for (int i = 0; i < s.length(); i++) {
            if(i < s.length()-1 && romanNumbers.get(s.charAt(i)) < romanNumbers.get(s.charAt(i + 1))) {
                sumLetters -= romanNumbers.get(s.charAt(i));
            } else {
                sumLetters += romanNumbers.get(s.charAt(i));
            }
        }

        return sumLetters;
    }

    public static int solution03 (String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('L', 50);
        map.put('X', 10);
        map.put('I', 1);
        map.put('V', 5);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = map.get(s.charAt(s.length()-1));
        for (int i = s.length()-2; i >= 0 ; i--) {
            if(map.get(s.charAt(i)) < map.get(s.charAt(i + 1))){
                result -= map.get(s.charAt(i));
            } else {
                result += map.get(s.charAt(i));
            }
        }
        return result;
    }
}
