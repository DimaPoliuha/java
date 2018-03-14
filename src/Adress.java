public class Adress {

    private String index;
    private String city;
    private String street;
    private String houseNumber;
    private String fletNumber;

    public Adress(String index, String city, String street, String houseNumber, String fletNumber){
        this.index = index;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.fletNumber = fletNumber;
    }

    public String getIndex() {
        return index;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getFletNumber() {
        return fletNumber;
    }
}
