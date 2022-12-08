public class Lasagna {
    private static final int totalMinutes = 40;
    private static final int minutesPerLayer = 2;

    public static int expectedMinutesInOven() {
        return totalMinutes ;
    }

    public int remainingMinutesInOven(int minuteInCuptor) {
        return expectedMinutesInOven() - minuteInCuptor;
    }

    public static int preparationTimeInMinutes(int layers) {
        return minutesPerLayer * layers;
    }

    public int totalTimeInMinutes(int minute, int layers) {
        return Integer.parseInt(""+preparationTimeInMinutes(layers) + minute);
    }
}
