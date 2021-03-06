package com.company;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private int max;
    private int min;
    private int secretNumber;
    private boolean won = false;

    private List<Integer> stats;

    public Model() {
        this.min = GlobalConstants.MIN;
        this.max = GlobalConstants.MAX;
        secretNumber = IntGenerator.rand(min, max);
        this.stats = new ArrayList<>();
    }

    public boolean isInRange(int input) {
        return input > min && input < max;
    }

    public void addToStats(int guess) {
        stats.add(guess);
    }

    public List<Integer> getStats() {
        return stats;
    }

    public int getSecretNumber() {
        return secretNumber;
    }

    public boolean isWon() {
        return won;
    }

    public void setWon() {
        this.won = true;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }
}
