import java.util.Objects;

public class House {

    private int houseNo;
    private String shape;
    private int countOfrooms;
    private int doorNumber;

    public House(int houseNo, String shape, int countOfrooms, int doorNumber) {
        this.houseNo = houseNo;
        this.shape = shape;
        this.countOfrooms = countOfrooms;
        this.doorNumber = doorNumber;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getCountOfrooms() {
        return countOfrooms;
    }

    public void setCountOfrooms(int countOfrooms) {
        this.countOfrooms = countOfrooms;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseNo=" + houseNo +
                ", shape='" + shape + '\'' +
                ", countOfrooms=" + countOfrooms +
                ", doorNumber=" + doorNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return houseNo == house.houseNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(houseNo);
    }
}
