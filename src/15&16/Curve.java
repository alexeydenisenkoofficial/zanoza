
public class Сurve {
    private Set set1 = new Set();
    private Set set2 = new Set();
    private Set set3 = new Set();
    private Set set4 = new Set();
    private Set set5 = new Set();
    private Set firstState = set1;

    public void work(int a) {
        for (int i = 0; i < firstState.getN().size(); i++) {
            if (firstState.getN().get(i) == a) {
                System.out.println(firstState.getA().get(a));
                firstState = firstState.getnextS().get(a);
                break;
            }
        }
    }


    public Сurve() {
        set1.adding(0, "create_project", set2);
        set1.adding(1, "add_library", set5);
        set2.adding(0, "test", set3);
        set2.adding(1, "drop_db", set4);
        set3.adding(0, "drop_db", set4);
        set3.adding(1, "add_library", set5);
        set4.adding(0, "restart", set3);
        set4.adding(1, "deploy", set5);
        set5.adding(0, "deploy", set1);
        set5.adding(1, "restart", set3);
    }
}
