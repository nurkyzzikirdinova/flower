import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Flower flower1 = new Flower();
flower1.flowerName= "Daisy";
flower1.freshness= 'A';
flower1.price= 43.50;

Flower flower2 = new Flower();
flower2.flowerName= "Lilac";
flower2.freshness= 'B';
flower2.price= 13.59;

Flower flower3 = new Flower();
flower3.flowerName= "Rose";
flower3.freshness= 'C';
flower3.price= 23.57;

Flower flower4 = new Flower();
flower4.flowerName= "Lily";
flower4.freshness= 'C';
flower4.price= 12.50;


Flower [] flowers  = {flower1, flower2, flower3, flower4};
        System.out.println("Бардык гүлдөр: "+"\n1."+
                flower1.flowerName+"\n2."+
                flower2.flowerName+"\n3."+
                flower3.flowerName+"\n4."+
                flower4.flowerName+"\n"

        );


      double mostExpensive = Flower.getMostExpensive(flowers);
      System.out.println("Эн кымбат гул: " + mostExpensive+"$"+"\n");


char [] flowersFresh = new char []{flower1.freshness, flower2.freshness, flower3.freshness , flower4.freshness};
char flFresh= flowersFresh[0];
        for (char i = 0; i < flowersFresh.length; i++) {
            if(flowersFresh[i]>flFresh){
                flFresh= flowersFresh[i];
            }
            System.out.println(flFresh);

        }

   }
}





