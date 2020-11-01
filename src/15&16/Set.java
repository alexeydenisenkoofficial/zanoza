import java.util.ArrayList;

public class Set {
    private final ArrayList<Integer> N = new ArrayList<>();
    private final ArrayList<String> A = new ArrayList<>();
    private final ArrayList<Set> nextS = new ArrayList<>();

    public void adding(Integer num, String act, Set nextSt) {
        N.add(num);
        A.add(act);
        nextS.add(nextSt);
    }

    public ArrayList<Integer> getN() {
        return N;
    }

    public ArrayList<String> getA() {
        return A;
    }

    public ArrayList<Set> getnextS() {
        return nextS;
    }
}
