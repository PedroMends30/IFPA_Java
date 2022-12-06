public class Onibus extends Veiculo{
    private String tipoOnibus;
    public void setTipoOnibus(String tipoOnibus) {
        this.tipoOnibus = tipoOnibus;
    }
    public String getTipoOnibus() {
        return tipoOnibus;
    }
    @Override
    public void showVehicle(){
        System.out.println("Cor: "+getCor());
        System.out.println("Ano: "+getAno());
        System.out.println("Placa: "+getPlaca());
        System.out.println("Quantidade de passageiros: "+getQtdPassageiros());
        System.out.println("Tipo do onibus: "+getTipoOnibus());
    }
}
