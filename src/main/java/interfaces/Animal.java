package interfaces;

public abstract class Animal implements Showable{
	
	public int Id;
	
	public Animal(int id) {
		this.Id = id;
	}
	
	public void sleep () {
		System.out.println("I am sleeping");
	}
	
	
	
	
	
		public void ShowInfo() {
			System.out.println("id is "+this.Id);
		}
	

	public void Height() {
		
		
	}

	
	
	
	

}
