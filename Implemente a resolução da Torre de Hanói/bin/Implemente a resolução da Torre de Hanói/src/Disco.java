
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Disco {

  public static void main(String[] args) throws IOException {
    try (Scanner ler = new Scanner(System.in)) {
		int i, n;

		System.out.printf("Informe o número para a tabuada:\n");
		n = ler.nextInt();

		FileWriter arq = new FileWriter("Disco");
		try (PrintWriter gravarArq = new PrintWriter(arq)) {
			gravarArq.printf("+--Resultado--+%n");
			for (i=1; i<=10; i++) {
			  gravarArq.printf("| %2d X %d = %2d |%n", i, n, (i*n));
			}
			gravarArq.printf("Disco Gravacao");
		}

		arq.close();
	}
    System.out.printf("Disco"); 
  }

}