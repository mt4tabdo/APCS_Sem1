public class StepTracker {

    private int minSteps;
    private int totalSteps;
    private int numDays;
    private int activeDays;

    public StepTracker(int min){
        minSteps = min;
        totalSteps = 0;
        numDays = 0;
        activeDays = 0;
    }

    public void addDailySteps(int steps){
        numDays++;
        totalSteps += steps;
        if (steps >= minSteps) {
            activeDays++;
        }
    }

    public int activeDays(){
        return activeDays;
    }

    public double averageSteps(){
        if (numDays == 0) {
            return 0.0;
        }
        else
            return (double) totalSteps / numDays;
    }
}