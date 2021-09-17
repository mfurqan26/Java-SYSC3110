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
        BuddyInfo buddy =  new BuddyInfo("Tom","Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
