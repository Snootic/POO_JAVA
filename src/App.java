public class App {
    public static void main(String[] args) throws Exception {
        veiculo car = new veiculo();
        car.velocidade = 100;
        car.cor = "azul";
        car.modelo = "monza";
        car.buzinar();

        int velocidade = car.acelerar(100, 150);
        System.out.println("A velocidade é " + velocidade);
    }
}
