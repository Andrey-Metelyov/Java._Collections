import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //put your code here
    Scanner scanner = new Scanner(System.in);
    String init = scanner.nextLine();
    String key = scanner.nextLine();
    String toCipher = scanner.nextLine();
    String toDecipher = scanner.nextLine();
    char[] arrInit = init.toCharArray();
    char[] arrKey = key.toCharArray();
    Map<Character, Character> cipherMap = new HashMap<>();
    Map<Character, Character> decipherMap = new HashMap<>();
    for (int i = 0; i < arrInit.length; i++) {
      cipherMap.put(arrInit[i], arrKey[i]);
      decipherMap.put(arrKey[i], arrInit[i]);
    }
    System.out.println(cypher(toCipher, cipherMap));
    System.out.println(cypher(toDecipher, decipherMap));
  }

  private static String cypher(String message, Map<Character, Character> cipherMap) {
    StringBuilder sb = new StringBuilder();
    char[] arr = message.toCharArray();
    for (char c : arr) {
      sb.append(cipherMap.get(c));
    }
    return sb.toString();
  }
}