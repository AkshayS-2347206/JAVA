import java.util.ArrayList;
import java.util.List;

class AthleteRecord<T> {
    private T athleteId;
    private String athleteName;
    private int age;

    public AthleteRecord(T athleteId, String athleteName, int age) {
        this.athleteId = athleteId;
        this.athleteName = athleteName;
        this.age = age;
    }

    public T getAthleteId() {
        return athleteId;
    }

    public String getAthleteName() {
        return athleteName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "AthleteRecord{" +
                "athleteId=" + athleteId +
                ", athleteName='" + athleteName + '\'' +
                ", age=" + age +
                '}';
    }
}

interface AthleteRecordManager<T> {
    void addAthleteRecord(AthleteRecord<T> athleteRecord);

    AthleteRecord<T> getAthleteRecord(T athleteId);

    void displayAllAthleteRecords();
}

class GenericAthleteRecordManager<T> implements AthleteRecordManager<T> {
    private List<AthleteRecord<T>> athleteRecords = new ArrayList<>();

    @Override
    public void addAthleteRecord(AthleteRecord<T> athleteRecord) {
        athleteRecords.add(athleteRecord);
    }

    @Override
    public AthleteRecord<T> getAthleteRecord(T athleteId) {
        for (AthleteRecord<T> record : athleteRecords) {
            if (record.getAthleteId().equals(athleteId)) {
                return record;
            }
        }
        return null;
    }

    @Override
    public void displayAllAthleteRecords() {
        for (AthleteRecord<T> record : athleteRecords) {
            System.out.println(record);
        }
    }
}

public class SportsApp {
    public static void main(String[] args) {

        AthleteRecordManager<Integer> athleteRecordManager = new GenericAthleteRecordManager<>();

        athleteRecordManager.addAthleteRecord(new AthleteRecord<>(1, "Rafael Nadal", 35));
        athleteRecordManager.addAthleteRecord(new AthleteRecord<>(2, "Serena Williams", 40));
        athleteRecordManager.addAthleteRecord(new AthleteRecord<>(3, "Lionel Messi", 34));
        athleteRecordManager.addAthleteRecord(new AthleteRecord<>(4, "Simone Biles", 24));
        athleteRecordManager.addAthleteRecord(new AthleteRecord<>(5, "Usain Bolt", 35));
        
        athleteRecordManager.displayAllAthleteRecords();

        AthleteRecord<Integer> athleteRecord = athleteRecordManager.getAthleteRecord(3);
        if (athleteRecord != null) {
            System.out.println("Found athlete: " + athleteRecord);
        } else {
            System.out.println("Athlete not found.");
        }
    }
}
