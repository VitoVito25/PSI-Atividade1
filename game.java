public class game {

    private int targetNumber;
    private int attemptNumber;
    private int attemptCount;
    private boolean finisheStatus;
    
    public int getTargetNumber() {
        return targetNumber;
    }

    public void setTargetNumber(int targetNumber) {
        this.targetNumber = targetNumber;
    }

    public int getAttemptNumber() {
        return attemptNumber;
    }

    public void setAttemptNumber(int attemptNumber) {
        this.attemptNumber = attemptNumber;
    }

    public int getAttemptCount() {
        return attemptCount;
    }

    public void setAttemptCount(int attemptCount) {
        this.attemptCount = attemptCount;
    }

    public boolean getFinishe() {
        return finisheStatus;
    }

    public void setFinisheStatus(boolean finishedStatus) {
        this.finisheStatus = finishedStatus;
    }

}