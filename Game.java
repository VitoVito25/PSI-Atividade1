public class Game {

    private int targetNumber;
    private int attemptNumber;
    private int attemptCount;
    private boolean finishedStatus;

    public Game(int targetNumber) {
        this.targetNumber = targetNumber;
        this.attemptNumber = 0;
        this.attemptCount = 0;
        this.finishedStatus = false; 
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

    public void tryAttempt(int attemptNumber) {
        this.attemptNumber = attemptNumber;
        this.attemptCount = this.attemptCount + 1;
        if(this.attemptNumber == this.targetNumber) {
            this.finishedStatus = true;
        } else {
            if(attemptNumber > targetNumber) {
                System.out.println("O numero sorteado esta abaixo do que você indicou.");
            } else {
                System.out.println("O numero sorteado esta acima do que você indicou.");
            }
        }
    }

}