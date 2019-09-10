package p1Code;
public class Hasard{
    private int D6;
    private double coin;

    public Hasard(){
        D6=1;
        coin=0;
    }

    public int LancerDe(){
        D6=1 + (int)(Math.random() * ((6 - 1) + 1));
        return this.D6;
    }

    public String CoinFlip(){
        coin=Math.random();
        if (coin < 0.5){
            coin=1;
        }else{
            coin=2;
        }
        if (coin==1) 
        	return "Pile";
        else
        	return "Face";
    }
}