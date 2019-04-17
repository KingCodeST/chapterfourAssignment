import java.util.Objects;

public class Garage {

    private  String id;
    private String Rname;
    private String RoomColor;
    private House hs;

    public Garage(String id, String rname, String roomColor,House theHs) {
        this.id = id;
        this.Rname = rname;
        this.RoomColor = roomColor;
        this.hs =theHs;

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
                ", hs=" + hs +
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
