import java.util.Scanner;
public class Painel {
    static void painel(float primeiroValor, String operator, float segundoValor) {
        System.out.println(
                "Para utilizar a calculadora você deve digitar o número ou\noperador desejado. C e E significam Clean e Erase.\nVai ser aceito apenas um número de cada vez.");
        System.out.println("              " + primeiroValor + " " + operator + " " + segundoValor);
        System.out.println("            " + "   + - x / ");
        System.out.println("            " + "   1 2 3 4");
        System.out.println("            " + "   5 6 7 8");
        System.out.println("            " + "   9 0 C E");
    }

    static void teclado(int primeiroValor, int segundoValor, String operador) {
        Scanner scanner = new Scanner(System.in);
        boolean confirm = false;
        Calculadora calculadora = new Calculadora();
       /*  int primeiroValor = 0;
        int segundoValor  = 0;
        String operador = ""; */
    
        do {
            boolean n1Check = false;
            boolean opCheck = false;
            boolean n2Check = false;
            do{
                System.out.println("First number please?");
                primeiroValor = scanner.nextInt();
                if (primeiroValor > 0) {
                    System.out.println("Well done");
                    n1Check = true;
                    painel(primeiroValor, operador, segundoValor);
                } 
                
            } while (!n1Check);
            do {
                System.out.println("Which operation (+, -, x, /)?");
                operador = scanner.next();
                if (operador.equals("+") || operador.equals("-") || operador.equals("x") || operador.equals("/")) {
                    System.out.println("Nice Operator");

                    opCheck = true;
                    painel(primeiroValor, operador, segundoValor);
                } else {
                    System.out.println("Invalid operator. Please enter a valid operator (+, -, x, /).");
                }
            } while (!opCheck);
            
            do{
                System.out.println("Second number please?");
                segundoValor = scanner.nextInt();
                if (segundoValor > 0) {
                    System.out.println("Well done");
                    n2Check = true;
                    painel(primeiroValor, operador, segundoValor);
                } 
                
            } while (!n2Check);
            confirm = true;
        } while (!confirm);
        primeiroValor = results(primeiroValor, segundoValor, operador);
        
        painel(primeiroValor, operador, segundoValor);
        
        /* Colocar aqui o resultado */
    }
       
    static int results(int primeiroValor, int segundoValor, String operador) {
        Calculadora calculadora = new Calculadora();
        switch (operador) {
        case "+":
            calculadora.add(primeiroValor, segundoValor)
            break;
        case "-":
            calculadora.minus(primeiroValor, segundoValor)
            
            break;
        case "/":
        calculadora.divide(primeiroValor, segundoValor)
        
            break;
        case "x":
        calculadora.multiply(primeiroValor, segundoValor)
        
            break;
        default:
            break;
       }
   }
    
}               

/* 

"Para utilizar a calculadora você deve digitar o número ou
operador desejado. C e E significam Clean e Erase. 
Vai ser aceito apenas um número de cada vez.""

     =
  + - x / 
  1 2 3 4
  5 6 7 8
  9 0 C E
   */