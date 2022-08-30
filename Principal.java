import java.util.Scanner;
public class Principal{
    public static void main(String[] args){
        Scanner read = new Scanner (System.in);
        System.out.println("Digite qual classe executar");
        int classe = read.nextInt();
        switch (classe){
             case 1:
                 System.out.println("insira um numero para elevar ao quadrado");
                 double num = read.nextDouble();
                 Metodos.Square(num);
                 break;
             case 2:
                 int num1,num2,num3;
                 
                 break;
             case 3:
                 
                 break;
        }
    }
}