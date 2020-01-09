package Q1_06_String_Compression;

public class MyAnswer {

  public static void main(String[] args) {

    String source = "aa";

    String result = aggregate(source);

    System.out.println(result);
  }

  private static String aggregate(String source) {
    String result = "";
    char[] chars = source.toCharArray();

    char tmp = chars[0];
    int counter = 0;
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == tmp) {
        counter++;
        continue;
      }
      result += String.valueOf(tmp) + counter;
      tmp = chars[i];
      counter = 1;
    }
    result += String.valueOf(tmp) + counter;
    return result.length() < source.length() ? result : source;
  }

}
