// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
  System.out.println("stopnie Celcjusza\tStopnie Fahrenheita");
    for(int C = 0; C <= 300; C += 20) {
      double F = (C * 9.0 / 5.0) + 32.0;
      System.out.printf(" %d\t\t\t\t\t%.2f\n", C, F);
    }
    }
}
//....