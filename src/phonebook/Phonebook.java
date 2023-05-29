package phonebook;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private static List<Record> records;

    public Phonebook() {
        records = new ArrayList<>();
    }

    public void add(String name, String phone) {
        Record record = new Record(name, phone);
        records.add(record);
    }

    public static Record find(String name) {
        for (Record record : records) {
            if (record.getName().equals(name)) {
                return record;
            }
        }
        return null;
    }

    public List<Record> findAll(String name) {
        List<Record> foundRecords = new ArrayList<>();
        for (Record record : records) {
            if (record.getName().equals(name)) {
                foundRecords.add(record);
            }
        }
        if (foundRecords.isEmpty()) {
            return null;
        }
        return foundRecords;
    }
}
