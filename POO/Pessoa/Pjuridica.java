package Pessoa;

public class Pjuridica extends Pessoa{
    private String cnpj;
    public Pjuridica(){
        
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    @Override
    public void showPessoa() {
        System.out.println("Nome: "+getNome());
        System.out.println("CNPJ: "+getCnpj());
    }
}
