import java.util.Scanner;

public class Hub {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {

      Start x = new Start();
      Livello1 livello1 = new Livello1();
      x.main(args);

      // creazione dell'oggetto LivelloDue nel hub
      LivelloDue livelloDue = new LivelloDue();

      // implementazione del metodo che fa partire il gioco
      livelloDue.quiz();

      System.out.println("a che difficoltà vuoi giocare ? ");
      int y = scanner.nextInt();

      LevelThree livelloTre = new LevelThree();
      if (y == 1) {
        livelloTre.modFacile();
      } else if (y == 2) {
        livelloTre.modIntermedio();
      } else if (y == 3) {
        livelloTre.modDifficile();
      }

    } catch (Exception e) {
      System.out.println("non ti preocuppare è un'errore");
    }

  }
}
