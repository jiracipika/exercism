public class Lasagna {
   public static int expectedMinutesInOven(){
    int expectedMinutesInOven = 40;
    return expectedMinutesInOven;
    }
    public static int remainingMinutesInOven(int minutesInOven){
        return expectedMinutesInOven() - minutesInOven; 
    }
    public static int preparationTimeInMinutes(int lasagnaLayers){ 
        return 2*lasagnaLayers;
    }
    public static int totalTimeInMinutes(int lasagnaLayers, int minutesInOven){
        return preparationTimeInMinutes(lasagnaLayers) + minutesInOven;
    }
}
