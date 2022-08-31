import java.util.Scanner;
public class Principal{
    public static void main(String[] args){
        Scanner a = new Scanner (System.in);
        int exit;
        do{
            System.out.println("Digite qual classe executar");
            int classe = a.nextInt();
            switch (classe){
                case 1:
                    System.out.println("insira um numero para elevar ao quadrado");
                    double num = a.nextDouble();
                    Metodos.Square(num);
                    break;
                case 2:
                    int num0,num1,num2;
                    System.out.println("insira tres valores para retornar o maior");
                    num0 = a.nextInt();
                    num1 = a.nextInt();
                    num2 = a.nextInt();
                    Metodos.Maior3(num0,num1,num2);
                    break;
                case 3:
                    System.out.println("Digite f pra retornar feminino, e m pra retornar masculino");
                    char gender = a.next().charAt(0);
                    Metodos.Sexo(gender);
                    break;
            }
            System.out.println("Se deseja continuar, pressione 1, se nao digite outro numero");
            exit = a.nextInt();  
       } while(exit==1);
  }
}
   