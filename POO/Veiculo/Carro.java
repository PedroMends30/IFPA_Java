public class Carro extends Veiculo{
    private String tipoCarro;
    public String getTipoCarro() {
        return tipoCarro;
    }
    public void setTipoCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }
    @Override
    public void showVehicle() {
        System.out.println("Cor: "+getCor());
        System.out.println("Ano: "+getAno());
        System.out.println("Placa: "+getPlaca());
        System.out.println("Quantidade de passageiros: "+getQtdPassageiros());
        System.out.println("Tipo do Carro: "+getTipoCarro());
    }
}
