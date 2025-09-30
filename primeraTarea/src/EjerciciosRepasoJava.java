import java.util.Scanner;

public class EjerciciosRepasoJava {
  public static void main(String[] args) {
    //* Para que funcione correctamente hay que descomentar un solo método y probarlo, no he conseguido hacerlo todos seguidos */ 
    // esPar();
    // mayorDeTresNumeros();
    // tablaMultiplicar();
    // nNumerosNaturales();
    // positivosNegativosCeros();
    // adivinaElNumero();
    // menuConSwitch();
    // asteriscos();
    // numeroDeArrays();
  }

  // ? EJERCICIO 1
  public static boolean esPar() {
    System.out.println("Escoje un número para comprobar si es par");
    Scanner teclado = new Scanner(System.in);
    int numero = teclado.nextInt();

    if (numero % 2 != 0) {
      System.out.print("No es par");
    } else {
      System.out.print("Es par");
    }

    teclado.close();
    return (numero % 2 != 0);
  }

  // ? EJERCICIO 2
  public static void mayorDeTresNumeros() {
    Scanner scanner = new Scanner(System.in);
    int numero1, numero2, numero3;

    System.out.println("Selecciona el primero de 3 números");
    numero1 = scanner.nextInt();
    System.out.println("Selecciona el segundo de 3 números");
    numero2 = scanner.nextInt();
    System.out.println("Selecciona el tercero de 3 números");
    numero3 = scanner.nextInt();

    // !ARRAY WAY
    int[] numeros = { numero1, numero2, numero3 };
    int max = 0;

    for (int i = 0; i < numeros.length; i++) {
      if (max < numeros[i]) {
        max = numeros[i];
      }
    }

    System.out.println("El mayor de los 3 números es:");
    scanner.close();
    System.out.println(max);

    // !METHOD WAY
    // int numeroMayor = Math.max(Math.max(numero2, numero3), numero1);
  }

  // ? EJERCICIO 3
  public static void tablaMultiplicar() {
    System.out.println("Escoge un número para hacer la tabla de multiplicar");

    Scanner numero = new Scanner(System.in);
    int numeroEscogido = numero.nextInt();

    System.out.println("El número escogido fue: " + numeroEscogido);

    for (int i = 0; i <= 10; i++) {
      System.out.println(numeroEscogido + " x " + i + " = " + i * numeroEscogido);
    }

    numero.close();
  }

  // ? EJERCICIO 4
  public static void nNumerosNaturales() {
    System.out.println("Selecciona un número para sumar todos los números hasta ese");

    Scanner numero = new Scanner(System.in);
    int numeroEscogido = numero.nextInt();

    int acumulador = 0;

    for (int i = 0; i <= numeroEscogido; i++) { acumulador += i; }

    numero.close();
    System.out.println("La suma de los números naturales es: " + acumulador);
  }

  // ? EJERCICIO 5
  public static void positivosNegativosCeros() {
    int numerosPositivos = 0, numerosNegativos = 0, numerosCeros = 0;
    int[] numeros = new int[10];
    Scanner numero = new Scanner(System.in);
    int numeroEscogido = 0;

    System.out.println("Escoge 10 números para meter en el array");

    for (int i = 0; i < numeros.length; i++) {
      System.out.println("Escoge el número " + (i + 1));  
      numeroEscogido = numero.nextInt();
      numeros[i] = numeroEscogido;
    }

    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] > 0) { numerosPositivos++; }
      if (numeros[i] < 0) { numerosNegativos++; }
      if (numeros[i] == 0) { numerosCeros++; }
    }

    numero.close();
    System.out.println("Numeros positivos son " + numerosPositivos);
    System.out.println("Numeros Negativos son " + numerosNegativos);
    System.out.println("Numeros Ceros son " + numerosCeros);
  }

  // ? EJERCICIO 6
  public static void adivinaElNumero() {
    int numeroAleatorio = (int) (Math.random() * 100) + 1;

    System.out.println("Selecciona un número");
    System.out.println(numeroAleatorio);

    Scanner numero = new Scanner(System.in);
    int numeroEscogido = 0;

    while (numeroEscogido != numeroAleatorio) {
      System.out.print("Introduce tu número: ");

      if (numero.hasNextInt()) {
        numeroEscogido = numero.nextInt();

        if (numeroEscogido < numeroAleatorio) {
          System.out.println("Demasiado bajo. Intenta con un número mayor");
        } else if (numeroEscogido > numeroAleatorio) {
          System.out.println("Demasiado alto. Intenta con un número menor");
        }
      } else {
        System.out.println("Por favor, introduce un número entero.");
        numero.next();
      }
    }

    System.out.println("Enhorabuena, adivinaste el número");
    numero.close();
  }

  // ? EJERCICIO 7
  public static void menuConSwitch() {
    Scanner numero = new Scanner(System.in);
    System.out.println("Escoge dos números");

    System.out.println("Primer número:");
    int numero1 = numero.nextInt();

    System.out.println("Segundo número:");
    int numero2 = numero.nextInt();

    System.out.println("Escoge una opción");
    System.out.println("Suma = 1");
    System.out.println("Resta = 2");
    System.out.println("Salir = 3");

    int opcionSeleccionada = numero.nextInt();

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
    numero.close();
  }

  // ? EJERCICIO 8
  public static void asteriscos() {
    Scanner numero = new Scanner(System.in);
    System.out.println("Escoja un número para la pirámide del ejerecicio 8");
    int numeroEscogido = numero.nextInt();

    numero.close();
    System.out.println("Piramide");

    for (int fila = 1; fila <= numeroEscogido; fila++) {
      int numAsteriscos = 2 * fila - 1;

      for (int k = 0; k < numAsteriscos; k++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }

  // ? EJERCICIO EXTRA
  public static void numeroDeArrays() {
    int numero = 0;

    int[] lista = { 10, 40, 25, 18 };

    for (int numeroIterado : lista) {
      numero += numeroIterado;
    }

    System.out.println("La suma total del array es: " + numero);
  }
}