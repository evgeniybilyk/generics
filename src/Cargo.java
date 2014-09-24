public class Cargo<K,V> implements iCargo {
    public final K id_cargo;
    public final V name;

    private Integer placeId;

    public Cargo(K id_cargo, V name) {
        this.id_cargo = id_cargo;
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
