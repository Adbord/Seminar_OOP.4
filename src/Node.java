/**
 * Узловой класс, связка между человеком p1, человеком p2 и отношением м-ду ними
 */
public class Node {

    public Node(Mission m, Priority p) {
        this.m = m;
        this.p = p;
    }


    Mission m;
    Priority p;


    @Override
    public String toString() {
        return String.format("<%s  %s>", m, p);
    }

}