public class AverageIntArrays {

// Complete these methods

    public int count(int[] aa) {
        return aa.length;
    }

    public int sum(int[] aa) {
        int newSum = 0;
        for(int i = 0; i < aa.length; i++){
            newSum += aa[i];
        }
        return newSum;
    }

    public int average(int[] aa) {
        int newSum = 0;
        if (aa.length != 0) {
            for (int i = 0; i < aa.length; i++) {
                newSum = aa[i];
            }
            return newSum / aa.length;
        }
        return 0;
    }


}
