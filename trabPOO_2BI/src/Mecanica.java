import java.util.Random;

public class Mecanica {
    private int quemJogando;
    private int qualCasa;
    private boolean[][] proprietario = new boolean[4][20];
    private int[][] jogadorCasa = new int[4][20];
    public Mecanica(boolean proprietario[][], int qualCasa, int quemJogando){
        this.proprietario = proprietario;
        this.qualCasa = qualCasa;
        this.quemJogando = quemJogando;
    }
    public Mecanica(){
    }
    Random dado = new Random();
    int acumuladorDado;
    public void comprar(){
        proprietario[quemJogando][qualCasa] = true;
    }
    public void jogar(){
        dado.nextInt(6);
        jogadorCasa[quemJogando][0+=dado] =
    }
}
