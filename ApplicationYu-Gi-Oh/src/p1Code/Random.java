package p1Code;
public class Random{
    public static void main(String args[]){
        Hasard Hazardous = new Hasard();
        String coin2;
        int coin;
        int dice;

        for (int i=0; i<2; i++){
            coin = Hazardous.CoinFlip();
            if (coin==1){
                coin2="pile";
            }else{
                coin2="face";
            }
            System.out.println("Lancer de pièces : "+coin2);
            dice = Hazardous.LancerDe();
            System.out.println("Lancer de dé : "+dice);

        }
    }
}