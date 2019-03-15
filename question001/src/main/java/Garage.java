import java.util.Objects;

public class Garage extends House{

    private  String id;
    private String Rname;
    private String RoomColor;



    public Garage(int houseNo, String shape, int countOfrooms, int doorNumber,String id, String rname, String roomColor) {
        super(houseNo,shape,countOfrooms,doorNumber);
        this.id = id;
        this.Rname = rname;
        this.RoomColor = roomColor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRname() {
        return Rname;
    }

    public void setRname(String rname) {
        Rname = rname;
    }

    public String getRoomColor() {
        return RoomColor;
    }

    public void setRoomColor(String roomColor) {
        RoomColor = roomColor;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "id='" + id + '\'' +
                ", Rname='" + Rname + '\'' +
                ", RoomColor='" + RoomColor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Garage garage = (Garage) o;
        return id.equals(garage.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
