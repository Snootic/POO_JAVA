public class veiculo {
    // Maneiras de inicializar uma variavel
    public String cor;
    String modelo;
    public int velocidade = 0;

    public int acelerar(int vel_entrada1, int vel_entrada2){
        int v = 0;
        velocidade = vel_entrada1 +vel_entrada2;
        return velocidade;
    }
    public void reduzir(int vel_entrada){
        velocidade = velocidade-vel_entrada;
    }
    public void buzinar(){
        System.out.println("BIIBIBIBIBIBIBIBIIBIBI");
    }
}