import java.util.Scanner;
public class TestaVeiculos {
    public static void main(String[] args) {
        Moto bros = new Moto();
        bros.setAno(2015);
        bros.setCor("vermelha");
        bros.setPlaca("ABC-123");
        bros.setQntCilindradas(180);
        bros.setQtdPassageiros(3);
        bros.showVehicle();
    }
}
