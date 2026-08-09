
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        int arr[] = {0, 2, 5, 3, 7, 8, 4};
        return arr;
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        boolean flag = false;
        for(int birdCount : this.birdsPerDay){
            if(birdCount==0){
                flag = true;
                // return true;
            }
        }
        return flag;
        // return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int totalDays = this.birdsPerDay.length;
        int birdsSum = 0;
        for(int i=0;i<numberOfDays && i< totalDays;i++) {
            birdsSum+=this.birdsPerDay[i];
        }
        return birdsSum;
    }

    public int getBusyDays() {
        int totalDays = this.birdsPerDay.length;
        int birdsCount = 0;
        for(int i=0; i < totalDays;i++) {
            if(this.birdsPerDay[i]>=5) {
                birdsCount+=1;
            }
        }
        return birdsCount;
    }
}
