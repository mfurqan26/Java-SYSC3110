public class BuddyInfo {

    private String name;
    private String address;
    private Integer phone_number;

    public BuddyInfo(String name, String address, Integer phone_number) {
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
    }

    public BuddyInfo(){
        this("","",null);
    }

    public BuddyInfo(String name){
        this(name,"",null);
    }


    public BuddyInfo(String name, String address){
        this(name, address,null);
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
