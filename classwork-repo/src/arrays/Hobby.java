package arrays;

public class Hobby extends Thing {
	
	public Hobby(String description) {
		super(description);
	}

	public static Hobby randomHobby() {
		Hobby[] h = {
			new Hobby("playing video games"),
			new Hobby("dancing"),
			new Hobby("going for long walks")
		};
		
		return h[(int)(Math.random() * h.length)];
	}
}
