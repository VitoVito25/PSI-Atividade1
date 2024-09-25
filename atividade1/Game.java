package atividade1;
public class Game {

    private int targetNumber;
    private int attemptNumber;
    private int attemptCount;
    private boolean finishedStatus;

    public void start(int targetNumber) {
        setTargetNumber(targetNumber);
        setAttemptNumber(0);
        setAttemptCount(0);
        setFinishedStatus(false);
    }

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

    public boolean isFinished() {
        return finishedStatus;
    }

    public void setFinishedStatus(boolean finishedStatus) {
        this.finishedStatus = finishedStatus;
    }
}