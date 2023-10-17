import java.util.Scanner;
class Main {
  public static void main(String[] args) {
 Scanner reed = new Scanner(System.in);
    int quadrado;

    System.out.print("Digite um numero: ");
    quadrado = reed.nextInt();
    
    

    for(int i = 0; i <= quadrado; i++){
      for(int j = 0; j <= (quadrado - i); j++){
        System.out.print("* ");
      }
      System.out.print("\n");
  }
    System.out.print("\n");
    
    for(int i = 0; i <= quadrado; i++){
        for(int j = 0; j <=  i; j++){
          System.out.print("* ");
        }
        System.out.print("\n");
    }
    System.out.print("\n");
    
    for(int i = 0; i <= quadrado; i++){
        for(int j = 0; j <=quadrado; j++){
          System.out.print("* ");
        }
        System.out.print("\n");
    }
    for(int i = 0; i <= quadrado; i++){
        for(int j = 0; j >= (quadrado + i); j++){
          System.out.print("* ");
        }
        System.out.print("\n");
    }
}
}