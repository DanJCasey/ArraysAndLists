import java.util.ArrayList;

public class AverageDoubleLists {

    // write out these too
    public int count(ArrayList<Double> aa) {
        return aa.size();
    }

    public Double sum(ArrayList<Double> aa) {
        double newSum = 0;
        for (int i = 0; i < aa.size(); i++) {
            newSum += aa.get(i);
        }
        return newSum;
    }

    public Double average(ArrayList<Double> aa) {
        double sum = 0.0;
        if (aa.size() > 0) {
            return sum(aa) / aa.size();
        } else {
            return 0.0;
        }

    }
}

