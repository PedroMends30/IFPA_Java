import javax.swing.JOptionPane;
public class Teste_Primos{
    public static boolean primo(int number){
        int divs=0;
        for(int i=1;i<=number;i++){
            if(number % i == 0){
                divs++;
            }
        }
        if(divs==2){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int trial;
        boolean tryer;
        trial = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para saber se é primo ou não"));
        tryer = primo(trial);
        if(tryer == true){
            JOptionPane.showMessageDialog(null,"O número digitado é primo");
        }else{
            JOptionPane.showMessageDialog(null,"O número digitado não é primo");
        }

    }
}
