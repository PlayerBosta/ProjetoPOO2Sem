public class Jogador extends Mecanica{
    private int moedas;
    public void Impulsivo(){
        comprar();
    }
    public void Exigente(){
        if(Propriedade >= 50){
            comprar();
        }
    }
    public void Cauteloso(){
        if((moedas - precoPropriedade) >= 80){
            comprar();
        }
    }
    public void Aleatorio(){
        if((1-Math.random())>= 0.50){
            comprar();
        }
    }
}
