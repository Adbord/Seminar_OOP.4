import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;


public class MyPlanner {
    private ArrayList<Node> planner = new ArrayList<>();
    public ArrayList <Node> getPlanner() {
        return planner;
    }

    public void appendMissionHighShip(Mission m) {
        planner.add(new Node(m, Priority.high));
    }
    public void appendMissionMediumShip(Mission m) {
        planner.add(new Node(m, Priority.medium));
    }
    public void appendMissionLowShip(Mission m) {
        planner.add(new Node(m, Priority.low));
    }
    public void writeCsv() throws IOException {
        OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("planer.csv", true), "utf-8");
        String convertedToString = String.valueOf(getPlanner());
        writer.append(convertedToString);
        writer.append("\n");
        writer.close();
    }
    public void readCsv() throws IOException{
        FileInputStream fileInputStream = new FileInputStream("planer.csv");
        int i;
        while((i=fileInputStream.read())!= -1){
            System.out.print((char)i);
        }fileInputStream.close();}
}