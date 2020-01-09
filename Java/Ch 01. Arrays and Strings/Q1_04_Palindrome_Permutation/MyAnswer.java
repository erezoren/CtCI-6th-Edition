package Q1_04_Palindrome_Permutation;

import com.sun.tools.javac.util.StringUtils;

public class MyAnswer {

  public static void main(String[] args) {

    String str = "T a c t Cooa";

    String result = isParePal(str.trim().toLowerCase());
    if (result != null) {
      System.out.println(result);
    }
    else{
      System.err.println("NOT GOOD");
    }
  }

  private static String isParePal(String str) {
    int[] counter = new int[128];
    char[] chars = str.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      counter[chars[i]] += 1;
    }
    // System.out.println(counter);

    String side = "";
    String mid = "";
    for (int j = 0; j < counter.length; j++) {
      if((char) j==' '){
        continue;
      }
      if (counter[j] > 2) {
        return null;
      }
      if (counter[j] == 2) {
        side += (char) j;
      }
      else if(counter[j] == 1){
        mid+=(char) j;
      }
    }
    return new StringBuilder(side).append(mid).append(new StringBuilder(side).reverse()).toString();

  }

}
