package dog_class;

public class TestDogDrive {

	public static void main(String[] args) {
		Dog bestFriend = new Dog();
		bestFriend.name = "Doug";
		bestFriend.breed = "Golden Retriever";
		bestFriend.size = 20;
		
		bestFriend.whoAmI();
		bestFriend.bark();
		
		Dog theEnemy = new Dog();
		theEnemy.name = "Alpha";
		theEnemy.breed = "Doberman-Pincher";
		theEnemy.size = 60;
		
		theEnemy.whoAmI();
		theEnemy.bark();

	}

}
