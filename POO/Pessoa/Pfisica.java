package Pessoa;

public class Pfisica extends Pessoa{
    private String cpf;
    public Pfisica(){

    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }
    @Override
    public void showPessoa() {
        System.out.println("Nome: "+getNome());
        System.out.println("Registro geral: "+getCpf());
    }
}
