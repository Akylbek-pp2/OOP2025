package practice_2;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Beka", 777);
        s.incrementYear();
        System.out.println(s.getName() + " " + s.getId() + " " + s.getYear() + "\n");

        StarTriangle triangle = new StarTriangle(3);
        System.out.print(triangle.toString() + "\n");

        Time t = new Time(23, 5, 6);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandard()  + "\n");

        Time t2 = new Time(4, 24, 33);
        t.add(t2);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());
    }
}
