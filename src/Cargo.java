public class Cargo<K,V> {
    private K id_cargo;
    private V name;

    public K getId_cargo() {
        return id_cargo;
    }

    public void setId_cargo(K id_cargo) {
        this.id_cargo = id_cargo;
    }

    public V getName() {
        return name;
    }

    public void setName(V name) {
        this.name = name;
    }
}
