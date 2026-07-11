package net.dragonblockinfinity.system;

public abstract class KiUltils {
    public float maxKi;
    public float currentKi;
    public float kiRegenerationRate;
    public float kiRegenerationDelay;
    public float consumptionKiRate;
    public float consumptionKiDelay;

    public void regenerateKi() {
        if (currentKi < maxKi) {
            currentKi += kiRegenerationRate;
            if (currentKi > maxKi) {
                currentKi = maxKi;
            }
        }
    }

    public void consumeKi() {
        if (currentKi > 0) {
            currentKi -= consumptionKiRate;
            if (currentKi < 0) {
                currentKi = 0;
            }
        }
    }

    public void setMaxKi(float maxKi) {
        this.maxKi = maxKi;
    }

    public void setCurrentKi(float currentKi) {
        this.currentKi = currentKi;
    }

    public void setKiRegenerationRate(float kiRegenerationRate) {
        this.kiRegenerationRate = kiRegenerationRate;
    }

    public void setKiRegenerationDelay(float kiRegenerationDelay) {
        this.kiRegenerationDelay = kiRegenerationDelay;
    }

    public void setConsumptionKiRate(float consumptionKiRate) {
        this.consumptionKiRate = consumptionKiRate;
    }

    public void setConsumptionKiDelay(float consumptionKiDelay) {
        this.consumptionKiDelay = consumptionKiDelay;
    }

    public void setConsumptionKiRateForCurrentUse(float consumptionRate) {
        this.consumptionKiRate = consumptionRate;
    }
}

