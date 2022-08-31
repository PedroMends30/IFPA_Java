public class Metodos{
    public static void Square(double num){
        double quad = Math.pow(num,2);
        System.out.println(quad);
    }
    public static void Maior3(int A, int B, int C){
        int result = Math.max(Math.max(A,B),C);
        System.out.println("O maior valor digitado eh:");
        System.out.println(result);
    }
    public static void Sexo(char sexo){
        char Gender = Character.toUpperCase(sexo);
        switch (Gender){
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Desconhecido");       
        }
    }
}
