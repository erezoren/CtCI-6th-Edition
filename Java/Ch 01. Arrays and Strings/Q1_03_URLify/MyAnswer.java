package Q1_03_URLify;

public class MyAnswer {

  public static void main(String[] args) {
    String s = "ssss hhhh nvnnvn  nvjdlkjne";
    String url = urlify(s);
  }

  private static String urlify(String s) {

    char[] chars = s.toCharArray();
    for (int i=0;i<chars.length;i++){
      if(chars[i]==' '){
        System.out.println("%20");
      }
    }

    return "";
  }
}
