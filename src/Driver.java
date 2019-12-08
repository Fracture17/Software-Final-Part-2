public class Driver {
    public static void main(String[] args) {
        //Creates Employee objects to construct the car
        Employee collector = new Collector();
        Employee assembler = new Assembler();
        Employee welder = new Welder();
        Employee painter = new Painter();

        //Set up the Chain of Responsibility
        collector.setNextEmployee(assembler);
        assembler.setNextEmployee(welder);
        welder.setNextEmployee(painter);

        //Call the Employees to construct the car
        //The call is passed down the chain in the proper order
        collector.doWork(Employee.PART_COLLECTOR, "Processing...");
    }
}
