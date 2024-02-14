public class Flower {
    String flowerName;
    char freshness;
    double price;

    public double getPrice(){
        return price;
    }
    public static double getMostExpensive(Flower[] flowers){
        double max = 0.0d;
        for(Flower flower : flowers){
            if(flower.getPrice()>max){
                max= flower.getPrice();
            }
        }
        return max;
    }




}




