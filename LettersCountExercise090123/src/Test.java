import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi! Insert a sentence:");

        String phrase = scanner.nextLine();

        char[] nameLength = phrase.toCharArray();

        System.out.println("The sentence's length is " + nameLength.length);

        Map<Character, Integer> letterCount = new TreeMap<>();
        for(int i = 0 ; i < nameLength.length ; i++){
            char singleLetter = phrase.charAt(i);
            if(Character.isLetter(singleLetter)){
                singleLetter = Character.toLowerCase(singleLetter);
                int count = letterCount.getOrDefault(singleLetter,0);
                letterCount.put(singleLetter,count + 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : letterCount.entrySet()){
            char letter = entry.getKey();
            int count = entry.getValue();
            System.out.println(letter + ": " + count);
        }
    }
}
