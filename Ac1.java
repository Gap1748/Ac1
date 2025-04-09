import java.util.Scanner;
public class Ac1 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    double ac1 = 0, ac2 = 0, af = 0, ag = 0, notaMinima = 0, media = 0, as = 0, n = 0;
    
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
    notaMinima = sc.nextDouble();
    System.out.println("Fez uma avaliação substutiva?se sim qual a nota?se não tiver feito responda 0.");
    as = sc.nextDouble();
    if (as > 0) {
        System.out.println("no lugar de qual nota a As deve ser aplicada?se for no lugar da Ac1 digite 1 , no lugar da Ac2 digite 2 e no lugar da Af digite 3.");
        n = sc.nextDouble();
        if (n == 1) {
        media = ((as * 0.15) + (ac2 * 0.3) + (af * 0.45) + (ag * 0.1));
    System.out.println("Ac 1= " + as);
    System.out.println("Ac2 = " + ac2);
    System.out.println("Af = " + af);
    System.out.println("Ag = " + ag);
    System.out.println("media = " + media + ", nota minima = " + notaMinima);
        } else {
            if (n == 2) {
        media = ((ac1 * 0.15) + (as * 0.3) + (af * 0.45) + (ag * 0.1));
    System.out.println("Ac 1= " + ac1);
    System.out.println("Ac2 = " + as);
    System.out.println("Af = " + af);
    System.out.println("Ag = " + ag);
    System.out.println("media = " + media + ", nota minima = " + notaMinima);
            } else {
        media = ((ac1 * 0.15) + (ac2 * 0.3) + (as * 0.45) + (ag * 0.1));
    System.out.println("Ac 1= " + ac1);
    System.out.println("Ac2 = " + ac2);
    System.out.println("Af = " + as);
    System.out.println("Ag = " + ag);
    System.out.println("media = " + media + ", nota minima = " + notaMinima);
            }
        }
    } else {
        media = ((ac1 * 0.15) + (ac2 * 0.3) + (af * 0.45) + (ag * 0.1));
    System.out.println("Ac 1= " + ac1);
    System.out.println("Ac2 = " + ac2);
    System.out.println("Af = " + af);
    System.out.println("Ag = " + ag);
    System.out.println("media = " + media + ", nota minima = " + notaMinima);

    }
    
    }
}