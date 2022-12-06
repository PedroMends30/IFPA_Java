package Pessoa;

public class TestaPolimorfa {
    public static void main(String[] args) {
        Funcionario pedro = new Funcionario();
        pedro.setNome("Pedro Mendes");
        pedro.setSiape("15748895");
        pedro.showPessoa();
        Pfisica luis = new Pfisica();
        System.out.println();
        luis.setNome("Luis Otavio");
        luis.setCpf("044.883.452-77");
        luis.showPessoa();
        System.out.println();
        Pjuridica ictus = new Pjuridica();
        ictus.setNome("Ictus Engenharia");
        ictus.setCnpj("47.325.148/0000-05");
        ictus.showPessoa();
        System.out.println();

    }
}
