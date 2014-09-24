public class jMain {
    public static void main(String[] args) {
        Student<Integer, String> st1 = new Student<Integer, String>(2658, "Петров");
        Student<Integer, String> st2 = new Student<Integer, String>(15487, "Сидоров");

        Teacher<Integer, String> tch1 = new Teacher<Integer, String>(48756, "Василиса Петровна");
        Teacher<Integer, String> tch2 = new Teacher<Integer, String>(77897, "Василиса Петровна");

        Box<Integer, String> box1 = new Box<Integer, String>(265894,"Коробка 1");
        Bag<Integer, String> bag1 = new Bag<Integer, String>(23654, "Сумка с вещами");

        Bus<iCargo> bus = new Bus<iCargo>();
        bus.carry(st1,"в школу");
        bus.carry(st2,"в школу");
        bus.carry(tch1,"в школу");
        bus.carry(tch2,"в школу");
        bus.carry(box1,"в аэропорт");
        bus.carry(bag1,"в аэропорт");

        bus.countTakenPlaces();
    }
}
