public class App {
    public static void main(String[] args) throws Exception {
        veiculo car = new veiculo();
        car.velocidade = 100;
        car.cor = "azul";
        car.modelo = "monza";
        car.buzinar();

        int velocidade = car.acelerar(100, 150);
        System.out.println("A velocidade é " + velocidade);

        corpoHumano corpo1 = new corpoHumano();
        corpo1.massa = 80;
        corpo1.volume = 10;
        
        corpo1.densidade = corpo1.massa/corpo1.volume;
        System.out.println("A densidade do corpo é: "+corpo1.densidade)
    }
}
