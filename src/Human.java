public class Human<K,V> implements iCargo {
    public final K id;
    public final V name;

    private Integer placeId;

    public Human(K id, V name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void takePlace(Integer placeId) {
        this.placeId = placeId;
    }

    @Override
    public Integer getPlaceId() {
        return placeId;
    }
}
