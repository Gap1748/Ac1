import java.util.Scanner;
public class Ac {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    double ac1 = 0, ac2 = 0, af = 0, ag = 0, notaDeAprovacao = 0, mediaFinal = 0;
    
    System.out.println("Vamos calcular sua média!");
    System.out.println("Qual foi a sua nota na Ac1?");
    ac1 = sc.nextDouble();
    System.out.println("Qual foi a sua nota na Ac2?");
    ac2 = sc.nextDouble();
    System.out.println("Qual foi a sua nota na Avaliação geral?");
    ag = sc.nextDouble();
    System.out.println("Qual foi a sua nota na Avaliação final?");
    af = sc.nextDouble();
    System.out.println("Qual é a nota minima para a aprovação?");
    notaDeAprovacao = sc.nextDouble();
    mediaFinal = ((ac1 * 0.15) + (ac2 * 0.3) + (af * 0.45) + (ag * 0.1));
    System.out.println("Ac 1= " + ac1);
    System.out.println("Ac2 = " + ac2);
    System.out.println("Af = " + af);
    System.out.println("Ag = " + ag);
    System.out.println("media = " + mediaFinal + ", nota minima = " + notaDeAprovacao);

    
    }
}