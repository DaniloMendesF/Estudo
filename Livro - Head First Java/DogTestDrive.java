class DogTestDrive{
	public static void main (String[] args){
	Dog a = new Dog();
	Dog d = new Dog();
	Dog b = new Dog();
	d.setSize(70);
	a.setSize(20);
	b.setSize(100);
	a.bark();
	d.bark();
	b.bark();
	}
}
