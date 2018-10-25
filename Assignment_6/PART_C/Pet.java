package pets;

public class Pet {
	private String PetName;
	private String OwnerName;
	private String Color;
	private String Sex;
	public static final int MALE = 1, FEMALE = 2, SPAYED = 3, NEUTERED = 4;
	protected int SexID;
	
	public Pet(String PetName, String OwnerName, String Color) {
		this.PetName = PetName;
		this.OwnerName = OwnerName;
		this.Color = Color;
	}
	
	public String getPetName() {
		return PetName;
	}
	
	public String getOwnerName() {
		return OwnerName;
	}
	
	public String getColor() {
		return Color;
	}
	
	public void setSex(int SexID) {
		switch(SexID) {
		case MALE:
			Sex = "MALE";
			break;
		case FEMALE:
			Sex = "FEMALE";
			break;
		case SPAYED:
			Sex = "SPAYED";
			break;
		case NEUTERED:
			Sex = "NEUTERED";
			break;
		}
	}
		
	public String getSex() {
		return Sex;
	}
	
	@Override
	public String toString() {
		return this.PetName + " owned by " +this.OwnerName + "\nColor: " +this.Color + "\nSex: " +getSex(); 
	}
	
}
