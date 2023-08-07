public class no_of_inst {
    private static int instanceCount = 0;
    private String name;

    public no_of_inst(String name) {
        this.name = name;
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public static void main(String[] args) {
        no_of_inst obj1 = new no_of_inst("Instance 1");
        no_of_inst obj2 = new no_of_inst("Instance 2");
        no_of_inst obj3 = new no_of_inst("Instance 3");

        System.out.println("Number of instances created: " + no_of_inst.getInstanceCount());
    }
}
