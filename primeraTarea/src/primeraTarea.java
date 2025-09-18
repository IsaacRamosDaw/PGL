import java.util.Scanner;

public class primeraTarea {
  public static void main(String[] args) {
    System.out.println("Inicio del programa de tareas");

    System.out.println("Suma de array");
    System.out.println(" ");
    int numero = 0;

    int[] lista = { 10, 40, 25, 18 };

    for (int numeroIterado : lista) {
      numero += numeroIterado;
    }
    System.out.println(numero);
  }

  public static boolean esPar(){
    Scanner teclado = new Scanner(System.in);
    int numero = teclado.nextInt();
    teclado.close();

    if (numero % 2 != 0) {
      return false;
    }

    return true;
  }

  public static int mayor(int numero1, int numero2, int numero3) {
    int numeroMayor = Math.max(Math.max(numero2, numero3), numero1);

    return numeroMayor;
  }

  // public static void tablaMultiplicar(){
  //   Scanner numero = new Scanner(System.in)

  // }

  public static int numeroDeArrays() {
    int numero = 0;

    int[] lista = { 10, 40, 25, 18 };

    for (int numeroIterado : lista) {
      numero += numeroIterado;
    }

    return numero;
  }
}