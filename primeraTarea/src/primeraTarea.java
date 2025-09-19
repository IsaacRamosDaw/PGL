import java.util.Scanner;

public class primeraTarea {
  public static void main(String[] args) {
    System.out.println("Primaide");

    for (int fila = 1; fila <= 3; fila++) {
      for (int ast = 0; ast != fila; ast++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println("Inicio del programa de tareas");

    System.out.println("Suma de array");
    System.out.println(" ");
    int numero = 0;

    int[] lista = { 10, 40, 25, 18 };

    for (int numeroIterado : lista) {
      numero += numeroIterado;
    }
    System.out.println(numero);

    // *-----------MULTIPLICAR------------- */
    int numeroEscogido = 2;

    System.out.println("El número escogido fue: " + numeroEscogido);

    for (int i = 0; i <= 10; i++) {
      System.out.println(i + " x " + numeroEscogido + " = " + i * numeroEscogido);
    }
  }

  // ? EJERCICIO 1
  public static boolean esPar() {
    Scanner teclado = new Scanner(System.in);
    int numero = teclado.nextInt();
    teclado.close();

    if (numero % 2 != 0) {
      return false;
    }

    return true;
  }

  // ? EJERCICIO 2
  public static int mayorDeTresNumeros(int numero1, int numero2, int numero3) {

    // !ARRAY WAY
    int[] numeros = { numero1, numero2, numero3 };
    int max = 0;

    for (int i = 0; i < numeros.length; i++) {
      if (max < numeros[i]) {
        max = numeros[i];
      }
    }

    System.out.println(max);

    // !METHOD WAY
    int numeroMayor = Math.max(Math.max(numero2, numero3), numero1);

    return numeroMayor;
  }

  // ? EJERCICIO 3
  public static void tablaMultiplicar() {
    Scanner numero = new Scanner(System.in);
    int numeroEscogido = numero.nextInt();

    System.out.println("El número escogido fue: " + numeroEscogido);

    for (int i = 0; i <= 10; i++) {
      System.out.println(i + " x " + numeroEscogido + " = " + i * numeroEscogido);
    }
    numero.close();

  }

  // ? EJERCICIO EXTRA
  public static int numeroDeArrays() {
    int numero = 0;

    int[] lista = { 10, 40, 25, 18 };

    for (int numeroIterado : lista) {
      numero += numeroIterado;
    }

    return numero;
  }

  // ? EJERCICIO 4
  public static int nNumerosNaturales() {
    Scanner numero = new Scanner(System.in);
    int numeroEscogido = numero.nextInt();
    numero.close();

    int acumulador = 0;

    for (int i = 0; i <= numeroEscogido; i++) {
      acumulador += numeroEscogido;
    }

    return acumulador;
  }

  // ? EJERCICIO 5
  public static void positivosNegativosCeros() {
    int numerosPositivos = 0;
    int numerosNegativos = 0;
    int numerosCeros = 0;

    int[] numeros = new int[10];
    int posicion = 0;

    Scanner numero = new Scanner(System.in);
    int numeroEscogido = numero.nextInt();
    numero.close();

    numeros[posicion] = numeroEscogido;
    numeroEscogido = 0;
    posicion++;

    while (numeroEscogido == 0 || posicion <= numeros.length) {
      numero = new Scanner(System.in);
      numeroEscogido = numero.nextInt();

      numeros[posicion] = numeroEscogido;
      posicion++;
    }

    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] > 0) {
        numerosPositivos++;
      }
      if (numeros[i] < 0) {
        numerosNegativos++;
      }
      if (numeros[i] == 0) {
        numerosCeros++;
      }
    }

    System.out.println("Numeros positivos son " + numerosPositivos);
    System.out.println("Numeros Negativos son " + numerosNegativos);
    System.out.println("Numeros Ceros son " + numerosCeros);
  }

  // ? EJERCICIO 6
  public static void adivinaElNumero() {
    int numeroAleatorio = (int) (Math.random() * 100) + 1;

    Scanner numero = new Scanner(System.in);
    int numeroEscogido = numero.nextInt();
    numero.close();

    if (numeroAleatorio != numeroEscogido) {
      while (numeroAleatorio != numeroEscogido) {
        numeroEscogido = numero.nextInt();
        numero.close();
      }
    }

    System.out.println("Enhorabuena, adivinaste el número");
  }

  // ? EJERCICIO 7
  public static void menuConSwitch() {
    System.out.println("Escoge dos números");

    System.out.println("Primer número:");
    Scanner numero = new Scanner(System.in);
    int numero1 = numero.nextInt();

    System.out.println("Segundo número:");
    int numero2 = numero.nextInt();
    numero.close();

    System.out.println("Escoge una opción");
    System.out.println("Suma = 1");
    System.out.println("Resta = 2");
    System.out.println("Salir = 3");

    Scanner opcion = new Scanner(System.in);
    int opcionSeleccionada = opcion.nextInt();
    opcion.close();

    switch (opcionSeleccionada) {
      case 1:
        System.out.println("Resultado : " + (numero1 + numero2));
        break;
      case 2:
        System.out.println("Resultado : " + (numero1 - numero2));
        break;

      default:
        System.out.println("Adios");
        break;
    }
  }

  // ? EJERCICIO 7
  public static void asteriscos() {
    Scanner numero = new Scanner(System.in);
    int numeroEscogido = numero.nextInt();
    numero.close();

    for (int fila = 1; fila <= 3; fila++) {
      for (int ast = 0; ast != fila; ast++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }
}