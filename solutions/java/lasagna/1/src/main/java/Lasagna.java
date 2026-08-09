public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutes){
        return this.expectedMinutesInOven() - minutes;
    }

    public int preparationTimeInMinutes(int noOfLayers) {
        return noOfLayers * 2;
    }
    

    public int totalTimeInMinutes(int noOfLayers,int minutes) {
         return this.preparationTimeInMinutes(noOfLayers) + minutes;
    }
}
