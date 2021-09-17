import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<BuddyInfo> BuddyCollection = new ArrayList<>();

    public void addBuddy(BuddyInfo buddy){
        BuddyCollection.add(buddy);
    }
    public void removeBuddy(BuddyInfo buddy){
        BuddyCollection.remove(buddy);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}
