package mood;

import mood.Moody.Happy;
import mood.Moody.Sad;

public class Driver {
	public static void main(String[] args) {
		Psychiatrist psychiatrist = new Psychiatrist();
		Moody sadPerson = new Sad();
		Moody happyPerson = new Happy();
		psychiatrist.examine(sadPerson);
		System.out.println(sadPerson.getMood());
		System.out.println(" ");
		sadPerson.expressFeelings();
		psychiatrist.observe(sadPerson);
		psychiatrist.examine(happyPerson);
		System.out.println(happyPerson.getMood());
		System.out.println(" ");
		happyPerson.expressFeelings();
		psychiatrist.observe(happyPerson);
	}

}

public abstract class Moody {
	protected abstract String getMood();
	
	protected abstract void expressFeelings();
	
	public void queryMood() {
		
	}
	
static class Happy extends Moody{
	@Override
	protected String getMood() {
		return "I am feeling happy today.";
	}
	@Override
	protected void expressFeelings() {
		System.out.println("hehehe...hahaha..!!");
	}
	
	public String toString() {
		return "Subject laughs a lot";
	}
}

static class Sad extends Moody{
	@Override
	protected String getMood() {
		return "I am feeling sad today.";
	}
	@Override
	protected void expressFeelings() {
		System.out.println("'boohoo' 'sob' 'weep'");
	}
	
	public String toString() {
		return "Subject cries a lot";
	}
}
}

public class Psychiatrist {
	public void examine(Moody person) {
		System.out.println("How are you feeling today?");
	}
	
	public void observe(Moody person) {
		
		System.out.println("Observation: " +person.toString());
		System.out.println("");
	}
}

