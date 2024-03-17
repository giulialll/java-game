import java.util.Scanner;

public class LevelThree {
  // Quindi qui scriviamo i metodi in cui far ciclare un'ArrayList dato
  // L'ArrayList dato sarà per ogni livello di difficoltà:
  // 1)Facile - 2)Intermedio - 3)Difficile
  String[] facile = {
      "Il polimorfismo è una delle tre caratteristiche fondamentali dell’OOP?",
      "Il polimorfismo è anche una religione indonesiana?",
      "Il polimorfismo è la capacità di ereditare attributi e metodi?",
      "Il polimorfismo è presente solo in java?",
      "Quale delle seguenti non è un vantaggio del polimorfismo?",
      "Il polimorfismo può essere utilizzato solo in linguaggi di programmazione orientati agli oggetti?"
  };
  String[] intermedio = {
      "Il polimorfismo consente di avere funzioni con lo stesso nome ma con diversi insiemi di parametri?",
      "Nel linguaggio Java, l'override è un meccanismo che consente a una sottoclasse di fornire la propria\nimplementazione di un metodo ereditato dalla classe genitore, sostituendone l'implementazione predefinita?",
      "Nel polimorfismo, un oggetto può essere trattato come un'istanza di una classe derivata", "Vero 4 o Falso 4",
      "Qual è uno degli aspetti chiave del polimorfismo nei linguaggi di programmazione orientati agli oggetti?\n1)La capacità di un oggetto di cambiare di tipo durante l'esecuzione del programma.\n2)La capacità di un oggetto di essere istanziato come un'istanza di una classe astratta\n3)La capacità di un metodo di essere implementato in modo diverso dalle classi derivate.\n4)La capacità di una classe di ereditare i membri privati di una classe padre",
      "Domanda Nascosta!" };
  String[] difficile = {
      "Il polimorfismo permette agli oggetti di una classe derivata di essere trattati come oggetti della classe base",
      "Nel polimorfismo, un metodo può avere più implementazioni diverse nelle classi derivate",
      "Nel polimorfismo, un metodo può avere più implementazioni diverse nelle classi derivate ",
      "Quale dei seguenti NON è un tipo di polimorfismo:\n1)Polimorfismo Statico\n2)Polimorfismo dinamico\n3)Polimorfismo ereditario\n4)Polimorfismo parametrico",
      "Qual è il termine utilizzato per riferirsi al polimorfiso che si verifica durante la compilazione del programma?\n1)Early binding\n2)Late Binding\n3)Statico\n4)Dinamico",
      "Domanda Nascosta!" };

  public void modFacile() {

    String[] reazioniRisposta = { "Bravo, risposta esatta!", "Sbagliato!" };
    int counter = 0;

    Scanner scanner = new Scanner(System.in);

    // 1
    System.out.println(facile[0]);
    String risposta1 = scanner.nextLine();
    if (risposta1.equals("vero")) {
      System.out.println(reazioniRisposta[0]);
      counter++;
    } else {
      System.out.println(reazioniRisposta[1]);
    }

    // 2
    System.out.println(facile[1]);
    String risposta2 = scanner.nextLine();
    if (risposta2.equals("vero")) {
      System.out.println(reazioniRisposta[1]);
    } else {
      System.out.println(reazioniRisposta[0]);
      counter++;
    }

    // 3
    System.out.println(facile[2]);
    String risposta3 = scanner.nextLine();
    if (risposta3.equals("vero")) {
      System.out.println(reazioniRisposta[1]);
    } else {

      System.out.println(reazioniRisposta[0]);
      counter++;
    }

    // 4
    System.out.println(facile[3]);
    String risposta4 = scanner.nextLine();
    if (risposta4.equals("vero")) {
      System.out.println(reazioniRisposta[1]);
    } else {

      System.out.println(reazioniRisposta[0]);
      counter++;
    }

    // 5
    System.out.println(facile[4]);
    System.out.println("1) Maggiore flessibilità nel design del software");
    System.out.println("2) Codice più generico e riutilizzabile ");
    System.out.println("3) Maggiore complessità nel codice");
    System.out.println("4) Maggiore modularità nel design del software");
    int risposta5 = scanner.nextInt();
    if (risposta5 == 3) {
      System.out.println(reazioniRisposta[0]);
      counter++;
    } else {

      System.out.println(reazioniRisposta[1]);
    }

    // 6 (domanda segreta)
    if (counter == 0) {
      System.out.println(facile[5]);
      System.out.println("DA CONTROLLARE");
      // QUESTA STRUTTURA VA CONTROLLATA
      String risposta6 = scanner.nextLine();
      risposta6 = scanner.nextLine();
      if (risposta6.equals("vero")) {
        System.out.println(reazioniRisposta[0]);
      } else {
        System.out.println(reazioniRisposta[1]);
        System.out.println("Game over!");
        System.out.println("Hai totalizzato " + counter + " punti!");
      }
    }
  }

  public void modIntermedio() {
    int counter = 0;
    // Domanda 1 VERO
    System.out.println("1)" + intermedio[0]);
    Scanner sc = new Scanner(System.in);// Prendo la risposta dello user // DEVE ESSERE VERA
    System.out.println("Rispondi VERO oppure FALSO");
    String intermedioAnswer = sc.nextLine();
    if (intermedioAnswer.equalsIgnoreCase("vero") || intermedioAnswer.equalsIgnoreCase("v")) {
      System.out.println("----------\nBravo, la risposta era VERO! +1 punto!\n----------");
      counter++;
    } else {
      System.out.println("----------\nRisposta SBAGLIATA!!!! Non hai guadagnato nessun punto!\n----------");
    }
    // Domanda 2 VERO
    System.out.println("2)" + intermedio[1]);
    System.out.println("Rispondi VERO oppure FALSO");
    intermedioAnswer = sc.nextLine();
    if (intermedioAnswer.equalsIgnoreCase("vero") || intermedioAnswer.equalsIgnoreCase("v")) {
      System.out.println("----------\nBravo, la risposta era VERO! +1 punto!\n----------");
      counter++;
    } else {
      System.out.println("----------\nRisposta SBAGLIATA!!!! Non hai guadagnato nessun punto!\n----------");
    }
    // Domanda 3 VERO
    System.out.println("3)" + intermedio[2]);
    System.out.println("Rispondi VERO oppure FALSO");
    intermedioAnswer = sc.nextLine();
    if (intermedioAnswer.equalsIgnoreCase("vero") || intermedioAnswer.equalsIgnoreCase("v")) {
      System.out.println("----------\nBravo, la risposta era VERO! +1 punto!!!\n----------");
      counter++;
    } else {
      System.out.println("----------\nRisposta SBAGLIATA!!!! Non hai guadagnato nessun punto!\n----------");
    }
    // Domanda 4 VERO
    System.out.println("4)" + intermedio[3]);
    System.out.println("Rispondi VERO oppure FALSO");
    intermedioAnswer = sc.nextLine();
    if (intermedioAnswer.equalsIgnoreCase("vero")) {
      System.out.println("----------\nBravo, la risposta era VERO! +1 punto!!!\n----------");
      counter++;
    } else {
      System.out.println("----------\nRisposta SBAGLIATA!!!! Non hai guadagnato nessun punto!\n----------");
    }
    // Domanda 5 FALSO
    System.out.println("5)" + intermedio[4]);
    System.out.println("----------\nRispondi scrivendo il numero della risposta\n----------");
    intermedioAnswer = sc.nextLine();
    if (intermedioAnswer.equals("1")) {
      System.out.println("----------\nBravo, la risposta era la numero 1!!! +1 punto!!!\n----------");
      counter++;
    } else {
      System.out.println("----------\nRisposta SBAGLIATA!!!! Non hai guadagnato nessun punto!\n----------");
    }
    // Domanda 6
    if (counter == 0) {
      System.out.println("Woosh! Hai sbloccato la DOMANDA SEGRETA!");
      System.out.println("Hai sbloccato questa domanda perchè i tuoi punti di questo livello ammontano a: " + counter);
      System.out.println("6)" + intermedio[5]);
    } else {
      System.out.println("Sei arrivato alla fine del gioco!\n I tuoi punti di questo livello ammontano a: " + counter);
    }
  }

  public void modDifficile() {

    int counterPunti = 0;
    Scanner myScan = new Scanner(System.in);
    System.out.println(difficile[0] + "rispondi con si o no");
    String risposta1 = myScan.nextLine();
    if (risposta1.equalsIgnoreCase("si")) {
      System.out.println("bravo,la risposta è vera");
      counterPunti++;
    } else {
      System.out.println("risposta sbagliata");
    }
    System.out.println(difficile[1] + "rispondi con si o no");
    String risposta2 = myScan.nextLine();
    if (risposta2.equalsIgnoreCase("si")) {
      System.out.println("bravo,la risposta è vera");
      counterPunti++;
    } else {
      System.out.println("risposta sbagliata");
    }
    System.out.println(difficile[2] + "rispondi con si o no");
    String risposta3 = myScan.nextLine();
    if (risposta3.equalsIgnoreCase("si")) {
      System.out.println("bravo,la risposta è vera");
      counterPunti++;
    } else {
      System.out.println("risposta sbagliata");
    }
    System.out.println(difficile[3] + "rispondi scegliendo un numero");
    String risposta4 = myScan.nextLine();
    if (risposta4.equalsIgnoreCase("3")) {
      System.out.println("bravo,la risposta è la numero 3!!!");
      counterPunti++;
    } else {
      System.out.println("risposta sbagliata");
    }
    System.out.println(difficile[4] + "rispondi scegliendo un numero");
    String risposta5 = myScan.nextLine();
    if (risposta5.equals("1")) {
      System.out.println("bravo,la risposta è la numero 1!!!");
      counterPunti++;
    } else {
      System.out.println("risposta sbagliata");
    }
    if (counterPunti == 0) {
      System.out.println("hai sbagliato tutte le risposte,questo sblocca la domanda segreta");
      System.out.println(difficile[5]);
      String rispostaSegreta = myScan.nextLine();
    } else {
      System.out.println("Hai finito complimenti, i tuoi punti sono: " + counterPunti);
    }
  }

}
