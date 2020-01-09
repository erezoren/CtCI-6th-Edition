package Q1_05_One_Away;

public class MyAnswer {

  public static void main(String[] args) {
    String a = "aadd";
    String b = "aadddd";

    boolean isOneEditAway = isOneEditAway(a, b);
    System.out.println(isOneEditAway);
  }

  private static boolean isOneEditAway(String a, String b) {

    if (Math.abs(a.length() - b.length()) > 1){
      return false;
    }

    char[] charsA = a.toCharArray();
    char[] charsB = b.toCharArray();
    int indexA = 0;
    int indexB = 0;

    boolean diffFound = false;
    while (indexA < charsA.length && indexB < charsB.length) {

      if (charsA[indexA] != charsB[indexB]) {
        if (diffFound) {
          return false;
        }
        diffFound = true;
      }
      indexA++;
      indexB++;
    }

    return true;
  }
}
