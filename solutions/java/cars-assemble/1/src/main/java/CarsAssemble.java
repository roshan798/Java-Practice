public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double total = 221 * speed;
        if(speed >= 1 && speed <=4) return total;
        else if(speed >= 5 && speed <=8) return 0.9 * total;
        else if(speed == 9) return 0.8 * total;
        return 0.77 * total;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)(this.productionRatePerHour(speed)/ 60) ;
    }
}
