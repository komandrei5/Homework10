package phonebook;

public class Main {


    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("John", "123456789");
        phonebook.add("Jane", "987654321");
        phonebook.add("Tom", "567890123");
        phonebook.add("Tom", "567826690123");


        System.out.println(phonebook.find("John"));
        System.out.println(phonebook.findAll("Tomas"));
        System.out.println(phonebook.findAll("Tom"));

    }
}
