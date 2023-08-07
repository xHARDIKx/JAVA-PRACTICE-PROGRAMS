public class INS {
	public static void main(String[] args) {

    	Instance instance1 = new Instance();
    	Instance instance2 = new Instance();
    	Instance instance3 = new Instance();
    	Instance instance4 = new Instance();

    	System.out.println("Number of instances created: " + Instance.getCount());
	}
}

 class Instance {
	private static int count;

	public Instance() {
    	count++;
	}

	public static int getCount() {
    	return count;
	}
}
