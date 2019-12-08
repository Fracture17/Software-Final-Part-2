public class Collector extends Employee {
    public Collector() {
        authorityLevel = PART_COLLECTOR;
    }

    @Override
    protected void write(String message) {
        String x = " all parts have been gathered";
        System.out.println(message + x);
    }
}
