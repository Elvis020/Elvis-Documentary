import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SaleEvent {
    private String id;
    private String streetAddress;
    private String city;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "SaleEvent: " + id +
                ", " + streetAddress+
                ", " + city;
    }

    public static void main(String[] args) {
        SaleEvent se = new SaleEvent();
        se.setId("200");
        se.setCity("Achimota Mile 7 Sonnidom");
        se.setStreetAddress("123 Main St.");
//        System.out.println(se.toString());

        Gson gs = new GsonBuilder().create();
        String js = gs.toJson(se);
        System.out.println(js);

    }
}
