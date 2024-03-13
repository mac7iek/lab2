// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    String a = "helloWorld";

     for(int i = 0; i < a.length(); i++){
       for(int j = 0; j < i; j++){
         System.out.print(" ");
       }
      System.out.println(a.charAt(i));
    }
}
}