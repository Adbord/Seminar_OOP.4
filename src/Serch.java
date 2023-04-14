import java.util.ArrayList;
public class Serch {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> plans;

    public Serch(MyPlanner planner) {
        plans = planner.getPlanner();
    }

    public ArrayList<String> spend(MyPlanner m, Priority p) {
        for (Node i : plans) { //пройтись по узлам из дерева
            if ( i.p == p) { //достать атрибуты и сравнить
                result.add(i.m.getMission()); //добавить в результ список
            }
        }
        return result;
    }

}