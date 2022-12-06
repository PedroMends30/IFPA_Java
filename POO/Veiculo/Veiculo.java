public abstract class Veiculo{
    private String cor;
    private int ano;
    private String placa;
    private int qtdPassageiros;
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }
    public String getCor() {
        return cor;
    }
    public int getAno() {
        return ano;
    }
    public String getPlaca() {
        return placa;
    }
    public int getQtdPassageiros() {
        return qtdPassageiros;
    }
    public void showVehicle(){       
    }
}