//Name: Muhammad Furqan, 101162068

public class BuddyInfo {

    private String name;
    private String address;
    private String phone_number;

    public BuddyInfo(String name, String address, String phone_number) {
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
    }

    public BuddyInfo(){
        this("","","");
    }

    public BuddyInfo(String name){
        this(name,"","");
    }


    public BuddyInfo(String name, String address){
        this(name, address,"");
    }

    public String getName() {
        return name;
    }

    public static void main(String arg[]){

        //System.out.println("Hello world!");

        BuddyInfo Buddy = new BuddyInfo("Homer");
        System.out.println("Hello " + Buddy.getName());

    }
}
