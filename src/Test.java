
public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Masina audi = new Masina ("Audi", "gri");
		Student original = new Student("Makai", "Alex", audi);
		
		System.out.println(original.toString());
		
		Student copy = (Student) original.clone();
		
		System.out.println(copy.toString());
		System.out.println();
		
		copy.getMasina().setCuloare("roz");
		copy.setNume("Marin");
		
		System.out.println(original.toString());
		System.out.println(copy.toString());
	}

}
