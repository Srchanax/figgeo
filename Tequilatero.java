package FigPlanas;
import java.util.Scanner;
public class Tequilatero {
    Scanner sc = new Scanner(System.in);
    public double areaTE;
    public double altura;
    public double lado;
    public Tequilatero() {
        areaTE = 0;
        altura = 0;
        lado = 0;
}
    public void calcquilátero() {
        System.out.println("Digite a altura do triângulo");
        altura = sc.nextDouble();
        System.out.println("Digite o lado do triângulo");
        lado = sc.nextDouble();
        areaTE = ((lado * lado) *Math.sqrt(3)) /2;
        System.out.println("A área do triângulo equilátero é: "+areaTE);
    }
}
