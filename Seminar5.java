import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;


public class Seminar5 {
    
    private static HashMap<String, ArrayList> contacts = new HashMap<>();

    public static void addContact(String name, String phoneNumber) {
        if (contacts.containsKey(name)) {
            ArrayList phoneNumbers = contacts.get(name);
            phoneNumbers.add(phoneNumber);
            contacts.put(name, phoneNumbers);
        } else {
            ArrayList phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumbers);
            contacts.put(name, phoneNumbers);
        }
    }

    public static void printContacts() {
        ArrayList<Map.Entry<String, ArrayList>> list = new ArrayList<>(contacts.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, ArrayList>>() {
            @Override
            public int compare(Map.Entry<String, ArrayList> o1, Map.Entry<String, ArrayList> o2) {
                return o2.getValue().size() - o1.getValue().size();
            }

        });

        for (Map.Entry<String, ArrayList> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue());

        }
    }

    public static void main(String[] args) {
        addContact("GFHGF", "13144");
        addContact("jhj", "9887");
        addContact("hjg", "90898");
        addContact("GFHGF", "7867");
        addContact("GFHGF", "098");
        printContacts();

    }

}