public class Painel {
    static void painel(float primeiroValor, String operator, float segundoValor) {
        System.out.println( "Para utilizar a calculadora você deve digitar o número ou\noperador desejado. C e E significam Clean e Erase.\nVai ser aceito apenas um número de cada vez.");
        System.out.println("              "+ primeiroValor + " " + operator + " " + segundoValor);
        System.out.println("            " + "   + - x / ");
        System.out.println("            " + "   1 2 3 4");   
        System.out.println("            " + "   5 6 7 8");
        System.out.println("            " + "   9 0 C E"); 
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