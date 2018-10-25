package pets;


public class AnimalHospital {

	public static void main(String[] args)  {
		Pet cat = new Cat("Tom", "David", "Black", "Long");
		cat.setSex(1);
		System.out.println(cat);
		Pet dog = new Dog("Tazer", "Ankur", "Fawn", "Big");
		dog.setSex(2);
		System.out.println(dog);;
	}

}
