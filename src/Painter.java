public class Painter extends Employee {
    public Painter() {
        authorityLevel = PAINTER;
    }

    @Override
    protected void write(String message) {
        String x = " car complete";
        System.out.println(message + x);
    }
}
