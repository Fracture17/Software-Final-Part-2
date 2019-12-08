public class Welder extends Employee {
    public Welder() {
        authorityLevel = WELDER;
    }

    @Override
    protected void write(String message) {
        String x = " all parts have been welded together";
        System.out.println(message + x);
    }
}
