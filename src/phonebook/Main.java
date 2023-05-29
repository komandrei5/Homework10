package phonebook;

public class Main {


    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("John", "123456789");
        phonebook.add("Jane", "987654321");
        phonebook.add("Doe", "567890123");


        System.out.println(phonebook.find("John"));
        System.out.println(phonebook.findAll("Tom"));

    }
}
