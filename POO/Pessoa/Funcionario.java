package Pessoa;

public class Funcionario extends Pessoa{
    private String siape;
    public Funcionario(){

    }
    public String getSiape() {
        return siape;
    }
    public void setSiape(String siape) {
        this.siape = siape;
    }
    @Override
    public void showPessoa() {
        System.out.println("Nome: "+getNome());
        System.out.println("Siape: "+getSiape());
    }
}
