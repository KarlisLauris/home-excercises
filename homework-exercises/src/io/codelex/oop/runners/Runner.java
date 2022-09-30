package io.codelex.oop.runners;

public enum Runner {
    BEGINNER(200, 300),
    INTERMEDIATE(150, 200),
    ADVANCED(50, 150);

    private final int minTime;
    private final int maxTime;

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public static Runner getFitnessLevel(int time) {
        for (Runner runner : Runner.values()) {
            if (time >= runner.minTime && time <= runner.maxTime) {
                return runner;
            }
        }
        return null;
    }
}
