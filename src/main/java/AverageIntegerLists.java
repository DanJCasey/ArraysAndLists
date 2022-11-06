import java.util.ArrayList;

public class AverageIntegerLists {


    public int count(ArrayList<Integer> aa) {
        return aa.size();
    }

    public int sum(ArrayList<Integer> aa) {
        int newSum = 0;
        for(int i = 0; i < aa.size(); i++){
            newSum += aa.get(i);
        } return newSum;
    }

    public int average(ArrayList<Integer> aa) {
        int newSum = 0;
        if(aa.size() != 0){
            for(int i = 0; i < aa.size(); i++){
                newSum += aa.get(i);

            }
            return newSum/aa.size();
        }
        return 0;
    }
}
