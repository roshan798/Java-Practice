public class JedliksToyCar {
    private int battery;
    public JedliksToyCar(){
        this.battery = 100;
    }
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }
    public String distanceDisplay() {
        int totalDistance = (100 - this.battery) * 20;
        return "Driven " + totalDistance + " meters";
    }

    public String batteryDisplay() {
        if(this.battery == 0) return "Battery empty";
        return "Battery at " + this.battery + "%";
    }

    public void drive() {
        if(this.battery>0)
            this.battery--;
    }
}
