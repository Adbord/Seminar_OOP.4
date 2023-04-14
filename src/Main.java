import java.io.IOException;

public class Main extends MyPlanner {
    public static void main(String[] args) {

        Mission m1 = new Mission("Симакова", 4L, "Ввести количество стран");
        Mission m2 = new Mission("Шустов", 5L, "Найти страну с максимальной площадью");
        Mission m3 = new Mission("Борисов", 6L, "Вывести информацию о стране с максимальной площадью");
        Mission m4 = new Mission("Яремчук", 7L, "Упорядочить страны по названию.");

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);

        System.out.println(m1.getMission());
        System.out.println( m1);

        MyPlanner plan = new MyPlanner();
        plan.appendMissionHighShip(m1);
        plan.appendMissionMediumShip(m2);
        plan.appendMissionLowShip(m3);
        plan.appendMissionMediumShip(m4);

        System.out.println("Приоритет - высший: " + new Serch(plan).spend(plan,
                Priority.high));
        System.out.println("Приоритет - средний: " + new Serch(plan).spend(plan,
                Priority.medium));
        System.out.println("Приоритет - низший: " + new Serch(plan).spend(plan,
                Priority.low));

        try {
            plan.writeCsv();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try{
            plan.readCsv();
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}




