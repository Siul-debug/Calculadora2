public class Calculadora2 {
    public static void main(String[] args) {
    // Valores predefinidos (puedes cambiarlos aquí)
    double num1 = 10.5;
    char operador = '/';
    double num2 = 3.2;
    double resultado = 0;
    switch (operador) {
    case '/':
    if (num2 == 0) {
    System.out.println("Error: División entre cero");
    } else {
    resultado = num1 / num2;
    }
    break;
    default:
    System.out.println("Operador inválido");
    return;
    }
    System.out.println("Resultado: " + resultado);
    }
    }