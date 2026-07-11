package net.dragonblockinfinity.system;

public class KiRelease {
    public static int kiPercentage = 0;
    public static int kiPercentageMax = 100;

    public static void increaseKiByOne() {
        if (kiPercentage < kiPercentageMax) {
            kiPercentage++;
        }
    }
}