 
public class feedbackTorredeHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
mport java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;

/*
public class TorresDeHanoi {

	// Método que realiza (imprime) o movimento
	// de um disco entre dois pinos
	private static void mover(int O, int D) {
		System.out.println(O + " -> " + D);
	}

	// Método que implementa a recursão
	// O = pino origem
	// D = pino destino
	// T = pino de trabalho
	static void hanoi(int n, int O, int D, int T) {

		if (n > 0) {
			hanoi(n - 1, O, T, D);
			mover(O, D);
			hanoi(n - 1, T, D, O);
		}

	}

	// executando o hanoi
	public static void main(String[] args) {

		int n; // número de discos

		// recebe o número de discos digitado pelo usuário
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número de discos: ");
		n = entrada.nextInt();

		// executa o hanoi!
		TorresDeHanoi.hanoi(n, 1, 3, 2);
	}
}import java.util.Stack;
import java.util.Scanner;

public class HanoiIterativo {

	// pilha de comandos que substitui as chamadas recursivas
	private static Stack<String> pilha = new Stack<String>();

	// armazena o número no movimento atual
	private static long numMov;

	// Método que realiza (imprime) o movimento
	// de um disco entre dois pinos
	private static void mover(int O, int D) {
		numMov++;
		System.out.println("[" + numMov + "]:" + O + " -> " + D);
	}

	// método que implementa o algoritmo hanoi iterativo
	public static void hanoi(int n) {

		int O = 1; // pino origem
		int D = 3; // pino destino
		int T = 2; // pino trabalho

		// monta e empilha o primeiro comando
		String comandoAtual = n + "," + O + "," + D + "," + T;

		pilha.push(comandoAtual);

		// o jogo chega ao fim quando a pilha de comandos estiver vazia!
		while (!pilha.empty()) {

			// quando n > 1, devemos empilhar um novo comando
			if (n > 1) {

				// monta o novo comando a ser empilhado
				n--;
				String[] vetAux = comandoAtual.split(",");
				O = Integer.parseInt(vetAux[1]);
				D = Integer.parseInt(vetAux[2]);
				T = Integer.parseInt(vetAux[3]);

				// isto seria uma chamada recursiva...
				comandoAtual = n + "," + O + "," + T + "," + D;

				// empilha o novo comando
				pilha.push(comandoAtual);

				// caso contrário, devemos desempilhar
				// e executar um movimento
			} else {

				//desempilha um comando
				comandoAtual = pilha.pop();

				// separa n, origem, destino e trabalho
				String[] vetAux = comandoAtual.split(",");
				n = Integer.parseInt(vetAux[0]);
				O = Integer.parseInt(vetAux[1]);
				D = Integer.parseInt(vetAux[2]);
				T = Integer.parseInt(vetAux[3]);

				// executa movimento
				mover(O, D);

				// quando n > 1, é preciso empilhar
				// um comando depois do movimento
				if (n > 1) {
					n--;
					// isto seria uma chamada recursiva...
					comandoAtual=n + "," + T + "," + D + "," + O;
					pilha.push(comandoAtual);
				}

			}

		}

	}

// método main para restar o programa!
	public static void main(String[] args) {

		int n; // número de discos

		// recebe o nú	mero de discos digitado pelo usuário
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número de discos: ");
		n = entrada.nextInt();

		// executa o algoritmo iterativo das Torres de Hanói
		HanoiIterativo.hanoi(n);

	}
    int x = Integer.parseInt(JOptionPane.showInputDialog("Digite a qtde de discos"));
    int pilhaA[] = new int [x];
    int pilhaB[] = new int [x];
    int pilhaC[] = new int [x];

    for (int cont =0; cont<x; cont++){
        pilhaA[cont]= cont;  
    }

    if (){

    }
}
} public class HanoiIterativo {

    private int qtDiscos;
    private int tamanhoMax;
    private String sequenciaPares[] = {"1-->2", "2-->3", "3-->1"};//para pares
    private int indexPar;
    private int indexImpar;
    private String sequenciaImpares[] = {"1-->3", "1-->2", "3-->2"};//paraimapres

    public void lerDados() {
        System.out.println("Digite a quantidade de  discos");
        Scanner rc = new Scanner(System.in);
        try{
         qtDiscos = rc.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Amigão é fácil,digite o numero de discos em inteiros por favor!");
            lerDados();
        }
        tamanhoMax = (int) Math.pow(2, qtDiscos) - 1;

    }
    public void hanoi() {

        if (qtDiscos % 2 == 0) {
          sequenciaPares  = new String[]{"1--->2", "2--->3", "3--->1"};//para pares
          sequenciaImpares =new String[]{"1--->3", "1--->2", "3--->2"};//para impares
        }else{
          sequenciaPares  = new String[]{"1--->3", "3--->2", "2--->1"};//para pares
          sequenciaImpares =new String[]{"1--->2", "1--->3", "2--->3"};//para impares
        }
         for (int i = 0; i < tamanhoMax; i++) {
                if (i % 2 == 0) {
                    if (indexPar > 2) {
                        indexPar = 0;
                    }
                    System.out.println(sequenciaPares[indexPar]);
                    indexPar++;
                } else {
                    if (indexImpar > 2) {
                        indexImpar = 0;
                    }
                     System.out.println(sequenciaImpares[indexImpar]);
                    indexImpar++;
                }
          
            }
    }
    public static void main(String[] args) {
        HanoiIterativo h = new HanoiIterativo();
        h.lerDados();
        h.hanoi();
    }
}

include <stdio.h>
#include <stdlib.h>
/**
  Hanoi iterativo
* author Fábio
*/
int main(int argc, char *argv[])
{
     int qtDiscos=20;
     int tamanhoMax=(int) pow(2, qtDiscos) - 1;
     int sequenciaPares[3];//para pares
     int indexPar=0;
     int indexImpar=0;
     int sequenciaImpares[3];//para impares
     int i=0;
      if (qtDiscos % 2 == 0) {
          sequenciaPares[0]=12;
          sequenciaPares[1]=23;
          sequenciaPares[2]=31;
          ////////////////////////
          sequenciaImpares[0]=13;
          sequenciaImpares[1]=12;
          sequenciaImpares[2]=32;
        }else{
          sequenciaPares[0]=13;
          sequenciaPares[1]=32;
          sequenciaPares[2]=21;
          ////////////////////////
          sequenciaImpares[0]=12;
          sequenciaImpares[1]=13;
          sequenciaImpares[2]=23;
      }
        for (i = 0; i < tamanhoMax; i++) {
                if (i % 2 == 0) {
                    if (indexPar > 2) {
                        indexPar = 0;
                    }
                    printf(" %d ---> %d \n",sequenciaPares[indexPar]/10,sequenciaPares[indexPar]%10);
                    indexPar++;
                } else {
                    if (indexImpar > 2) {
                        indexImpar = 0;
                    }
                    printf(" %d ---> %d \n",sequenciaImpares[indexImpar]/10,sequenciaImpares[indexImpar]%10);
                    indexImpar++;
                }
          }

  system("PAUSE");	
  return 0;
}
class Disco implements Comparable{
Integer index;
String movimento;
Disco(int index,String movimento){
this.index=index;
this.movimento=movimento;
}
public int compareTo(Disco o) {
return index.compareTo(o.index);
}
}
public class HanoiIterativo {
private int qtDiscos;
private String sequenciaImpares[] = {“A–>C”, “C–>B”, “B–>A”};//para impares
private String sequenciaPares [] = {“A–>B”, “B–>C”, “C–>A”};//para pares
private List arrayDiscos = new ArrayList();
public void lerDados() {
System.out.println(“Digite a quantidade de discos”);
Scanner rc = new Scanner(System.in);
try{
qtDiscos = rc.nextInt();
}catch(InputMismatchException e){
System.out.println(“Amigão! É fácil, digite o numero de discos por favor!”);
lerDados();
}
}
public void hanoi() {
int maxP=(int) Math.pow(2, qtDiscos);
int y = 1;
int pos =1;
while(y <= qtDiscos ){
int ctPulos = (int) Math.pow(2, y);
pos*=2;
if(y==1){
pos=1;
}
if(qtDiscos%2==0){
populaArrayPares(pos,ctPulos,maxP,y);
}else{
populaArrayImpares(pos,ctPulos,maxP,y);
}
y++;
}
}
private void populaArrayPares(int pos,int intervalos, int maxP,int y){
int index = 0;
if(y%2==0){
for (int i = pos; i <= maxP; i+=intervalos) {
Disco d = new Disco(i, sequenciaPares[index]);
arrayDiscos.add(d);
index++;
if(index>2){
index=0;
}
}
}else{
for (int i = pos; i < maxP; i+=intervalos) {
Disco d = new Disco(i, sequenciaImpares[index]);
arrayDiscos.add(d);
index++;
if(index>2){
index=0;
}
}	   }		
	}
private void populaArrayImpares(int pos,int intervalos, int maxP,int y){
   int index = 0;
   if(y%2==0){
	   for (int i = pos; i < maxP; i+=intervalos) {
		   Disco d = new Disco(i, sequenciaImpares[index]);
			   arrayDiscos.add(d);
        	   index++;
        	   if(index>2){
        		  index=0; 
        	   }
		   }	           
   }else{
	  for (int i = pos; i <= maxP; i+=intervalos) {
		   Disco d = new Disco(i, sequenciaPares[index]);
		   arrayDiscos.add(d);
   	   index++;
   	   if(index>2){
   		  index=0; 
   	   }
	   }
	   
   }		
	}  
public static void main(String[] args) {  
    HanoiIterativo h = new HanoiIterativo();  
    h.lerDados();  
    h.hanoi();  
    Collections.sort(h.arrayDiscos);
    for (Disco d : h.arrayDiscos) {
	     System.out.println("execute: "+d.index+"  "+d.movimento);
	}
    import java.util.Stack;
import java.util.Scanner;

public class HanoiIterativo {

	// pilha de comandos que substitui as chamadas recursivas
	private static Stack<String> pilha = new Stack<String>();

	// armazena o número no movimento atual
	private static long numMov;

	// Método que realiza (imprime) o movimento
	// de um disco entre dois pinos
	private static void mover(int O, int D) {
		numMov++;
		System.out.println("[" + numMov + "]:" + O + " -> " + D);
	}

	// método que implementa o algoritmo hanoi iterativo
	public static void hanoi(int n) {

		int O = 1; // pino origem
		int D = 3; // pino destino
		int T = 2; // pino trabalho

		// monta e empilha o primeiro comando
		String comandoAtual = n + "," + O + "," + D + "," + T;

		pilha.push(comandoAtual);

		// o jogo chega ao fim quando a pilha de comandos estiver vazia!
		while (!pilha.empty()) {

			// quando n > 1, devemos empilhar um novo comando
			if (n > 1) {

				// monta o novo comando a ser empilhado
				n--;
				String[] vetAux = comandoAtual.split(",");
				O = Integer.parseInt(vetAux[1]);
				D = Integer.parseInt(vetAux[2]);
				T = Integer.parseInt(vetAux[3]);

				// isto seria uma chamada recursiva...
				comandoAtual = n + "," + O + "," + T + "," + D;

				// empilha o novo comando
				pilha.push(comandoAtual);

				// caso contrário, devemos desempilhar
				// e executar um movimento
			} else {

				//desempilha um comando
				comandoAtual = pilha.pop();

				// separa n, origem, destino e trabalho
				String[] vetAux = comandoAtual.split(",");
				n = Integer.parseInt(vetAux[0]);
				O = Integer.parseInt(vetAux[1]);
				D = Integer.parseInt(vetAux[2]);
				T = Integer.parseInt(vetAux[3]);

				// executa movimento
				mover(O, D);

				// quando n > 1, é preciso empilhar
				// um comando depois do movimento
				if (n > 1) {
					n--;
					// isto seria uma chamada recursiva...
					comandoAtual=n + "," + T + "," + D + "," + O;
					pilha.push(comandoAtual);
				}

			}

		}

	}

// método main para restar o programa!
	public static void main(String[] args) {

		int n; // número de discos

		// recebe o nú	mero de discos digitado pelo usuário
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número de discos: ");
		n = entrada.nextInt();

		// executa o algoritmo iterativo das Torres de Hanói
		HanoiIterativo.hanoi(n);

	}
return  

}

}  