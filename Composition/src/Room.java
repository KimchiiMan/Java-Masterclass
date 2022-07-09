public class Room {
    private String name;
    private int roomArea;
    private House theHouse;
    private Residents theResidents;

    public Room(String name, int roomArea, House theHouse, Residents theResidents) {
        this.name = name;
        this.roomArea = roomArea;
        this.theHouse = theHouse;
        this.theResidents = theResidents;
    }

    public void getInformationAboutRoom() {
        System.out.println("The following is the information about the room:");
        System.out.println("The room has following area: " + getRoomArea() + " m2.");
        theHouse.theAddress();
        theResidents.getResidents();
    }

    public String getName() {
        return name;
    }

    public int getRoomArea() {
        return roomArea;
    }

    public House getTheHouse() {
        return theHouse;
    }

    public Residents getTheResidents() {
        return theResidents;
    }
}
