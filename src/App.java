public class App {
    public static void main(String[] args) throws Exception {
        veiculo car = new veiculo();
        car.velocidade = 100;
        car.cor = "azul";
        car.modelo = "monza";
        car.buzinar();

        System.out.println("A velocidade é " + car.velocidade);
    }
}
