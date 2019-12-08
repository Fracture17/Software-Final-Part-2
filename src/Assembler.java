public class Assembler extends Employee {
    public Assembler() {
        authorityLevel = ASSEMBLER;
    }

    @Override
    protected void write(String message) {
        String x = " all parts have been put together";
        System.out.println(message + x);
    }
}
