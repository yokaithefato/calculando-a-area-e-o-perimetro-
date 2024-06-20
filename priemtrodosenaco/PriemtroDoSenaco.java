
package priemtrodosenaco;

  import java.util.Scanner;

public class PriemtroDoSenaco {

 
    public static void main(String[] args) {
  Scanner sc = new Scanner (System.in);
  
  System.out.println("insira a altura do retangulo");
  double b = sc.nextDouble();
  System.out.println("informe a largura (LA ELE)");
  double a = sc.nextDouble();
  
  double A = a*b;
  double P = 2*(b+a );
  
  System.out.println("o perimetro do retangulo e " +P );
  
  System.out.println("a area do retangolo e " + A);
  
  
  
  
    }
    
}
