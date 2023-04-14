import java.time.LocalDate;
import java.time.LocalTime;

public class Mission {
    private static int id;
    private int nextId;
    private String date;
    private String time;
    private String deadline;
    private String name;
    private String mission;

    static {
        id = 1;
    }
    /**
     * Конструктор собирает объект из данных: ФИО автора, Кол-во дней для выполнения задачи
     * @param name ФИО автора
     * @param daysForPlus Кол-во дней для выполнения задачи
     * @param mission Задача
     */
    public Mission(String name, Long daysForPlus, String mission) {
        this.nextId = id++;
        this.date = LocalDate.now().toString();
        this.time = LocalTime.now().toString().substring(0, LocalTime.now().toString().indexOf('.'));
        this.deadline = LocalDate.now().plusDays(daysForPlus).toString();
        this.name = name;
        this.mission = mission;
    }

    public int getNextId() {
        return this.nextId;
    }

    public String getDate() {
        return this.date;
    }

    public String getTime() {
        return this.time;
    }

    public Integer getId() {
        return id;
    }

    public String getDeadline() {
        return this.deadline;
    }

    public String getName() {
        return name;
    }

    public String getMission() {
        return mission;
    }

    @Override
    public String toString() {
        return nextId + " " + date + " " + time + " " + deadline + " " + name + " " + mission;
    }
}