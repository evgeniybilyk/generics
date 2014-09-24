import java.util.HashMap;

public class Bus<T> {
    private HashMap<T, String> listCargo;

    public Bus() {
        listCargo = new HashMap<T, String>();
    }

    public void carry(T t, String destination) {
        listCargo.put(t, destination);
    }

    public void countTakenPlaces() {
        System.out.println("Count taken places: " + listCargo.size());
    }
}
