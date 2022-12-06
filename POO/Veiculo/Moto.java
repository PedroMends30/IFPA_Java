public class Moto extends Veiculo{
    private int qntCilindradas;
    public Moto(){
        
    }
    public int getQntCilindradas() {
        return qntCilindradas;
    }
    public void setQntCilindradas(int qntCilindradas) {
        this.qntCilindradas = qntCilindradas;
    }
    @Override
    public void showVehicle() {
        System.out.println("Cor: "+getCor());
        System.out.println("Ano: "+getAno());
        System.out.println("Placa: "+getPlaca());
        System.out.println("Quantidade de passageiros: "+getQtdPassageiros());
        System.out.println("Quantidade de cilindradas: "+getQntCilindradas());
    }
}
