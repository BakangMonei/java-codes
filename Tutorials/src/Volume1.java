public class Volume1 {
    public static void main(String[] args){
        int cansPerPack = 6;
        final double Can_Volume = 0.355;
        double totalVolume = cansPerPack;

        System.out.println(" A 6-Pack of 12-Ounce contains " + totalVolume + " liters");

        final double BottleVolume = 2;

        totalVolume = totalVolume + BottleVolume;

        System.out.println(" A 6-Pack of 12-Ounce contains " + totalVolume + " liters");

    }
}
