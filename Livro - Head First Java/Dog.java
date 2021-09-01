class Dog{
	private int size;
	private String breed;
	private String name;
	
	public int getSize(){
		return size;
	}
	public void setSize(int a){
		size = a;
	}
	public String getBreed(){
		return breed;
	}
	public void setBreed(String b){
		breed = b;
	}
	public String getName(){
		return name;
	}
	public void setName(String c){
		name = c;
	}

	void bark(){
		if(size<60){
			System.out.println("Ruff! Ruff!");
		}else if(size >= 60 && size <= 80){
			System.out.println("HOOF! HOOF!");
		}else{
			System.out.println("Au! Au!");
		}
	}
}

