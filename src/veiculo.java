public class veiculo {
    // Maneiras de inicializar uma variavel
    public String cor;
    String modelo;
    public int velocidade = 0;

    public void acelerar(){
        velocidade = velocidade +1;
    }
    public void reduzir(){
        velocidade = velocidade-1;
    }
    public void buzinar(){
        System.out.println("BIBIBIBIBIBIBIBIBIBIBIBIBIBIBIBIBIIBIBI");
    }
}