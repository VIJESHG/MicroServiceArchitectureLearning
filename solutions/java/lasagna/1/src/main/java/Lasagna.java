public class Lasagna {
    int ovenMinutes = 40;
    int layerMins = 2;
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return ovenMinutes;
    }
    
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int mins){
        return ovenMinutes - mins;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        return layerMins * layers;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int mins){
        return mins + preparationTimeInMinutes(layers);
    }
}
