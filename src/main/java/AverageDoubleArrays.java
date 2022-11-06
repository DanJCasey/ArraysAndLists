public class AverageDoubleArrays {


// Complete these methods

    public int count(double[] aa) {
        return aa.length;
    }

    public double sum(double[] aa) {
        double newSum = 0;
        for (int i = 0; i < aa.length; i++) {
            newSum += aa[i];
        }


        return newSum;
    }

    public double average(double[] aa) {
        double newSum = 0;
        if (aa.length != 0) {
            for (int i = 0; i < aa.length; i++) {
                newSum += aa[i];
            }
            return newSum / aa.length;

        }
        return 0;
    }

}
