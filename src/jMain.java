public class jMain {
    public static void main(String[] args) {
        Student<Integer, String> st1 = new Student<Integer, String>(2658, "Петров");
        Student<Integer, String> st2 = new Student<Integer, String>(15487, "Сидоров");

        Teacher<Integer, String> tch1 = new Teacher<Integer, String>(48756, "Василиса Петровна");
        Teacher<Integer, String> tch2 = new Teacher<Integer, String>(77897, "Василиса Петровна");

        Bus<iCargo> bus = new Bus<iCargo>();
        bus.carry(st1,"в школу");
        bus.carry(st2,"в школу");
        bus.carry(tch1,"в школу");
        bus.carry(tch2,"в школу");

        bus.countTakenPlaces();
    }
}
