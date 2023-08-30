public class veiculo {
    // Maneiras de inicializar uma variavel
    public String cor;
    String modelo;
    public int velocidade = 0;

    public void acelerar(int vel_entrada){
        int v = 0;
        velocidade = velocidade +vel_entrada;
    }
    public void reduzir(int vel_entrada){
        velocidade = velocidade-vel_entrada;
    }
    public void buzinar(){
        System.out.println("BIBIBIBIBIBIBIBIBIBIBIBIBIBIBIBIBIIBIBI");
    }
}