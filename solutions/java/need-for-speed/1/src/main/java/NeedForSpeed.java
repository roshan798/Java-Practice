class NeedForSpeed {
    private int speed;
    private int battery = 100;
    private int batteryDrain;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    public int distanceDriven() {
        return speed * ((100 - battery)/batteryDrain);
    }

    public void drive() {
        if(battery>=batteryDrain)
            battery -= batteryDrain;
    }
    public boolean canDrive(int distance) {
        return ((battery/batteryDrain) * speed) >= distance;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return car.canDrive(this.distance);
    }
}
