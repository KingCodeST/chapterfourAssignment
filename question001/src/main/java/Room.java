import java.util.Objects;

public class Room extends House {

    private  int id;
    private String Rname;
    private String roomColor;


    public Room(int houseNo, String shape, int countOfrooms, int doorNumber,int ids,String Rnameo, String roomColors) {
        super(houseNo,shape,countOfrooms,doorNumber);

        this.id =ids;
        this.Rname = Rnameo;
        this.roomColor =roomColors;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRname() {
        return Rname;
    }

    public void setRname(String rname) {
        Rname = rname;
    }

    public String getRoomColor() {
        return roomColor;
    }

    public void setRoomColor(String roomColor) {
        this.roomColor = roomColor;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", Rname='" + Rname + '\'' +
                ", roomColor='" + roomColor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return id == room.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
