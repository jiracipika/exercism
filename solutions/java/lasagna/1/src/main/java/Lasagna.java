public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
   public static int expectedMinutesInOven(){
    int expectedMinutesInOven = 40;
    return expectedMinutesInOven;
    }
    
    // TODO: define the 'remainingMinutesInOven()' method
    public static int remainingMinutesInOven(int minutesInOven){
        return expectedMinutesInOven() - minutesInOven; 
    }
    
    // TODO: define the 'preparationTimeInMinutes()' method
    public static int preparationTimeInMinutes(int lasagnaLayers){ 
        return 2*lasagnaLayers;
    }
    
    // TODO: define the 'totalTimeInMinutes()' method
    public static int totalTimeInMinutes(int lasagnaLayers, int minutesInOven){
        return preparationTimeInMinutes(lasagnaLayers) + minutesInOven;
    }
}
