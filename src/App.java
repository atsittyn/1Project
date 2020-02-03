
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		double itemPrice = 20.75;
		double moneyWallet = 40.25;
		int numberFriends = 120;
		int nicoleAge =40;
		int friendsPerYear = 0;
		String firstName = "Nicole";
		String lastName = "Atsitty";
		String middleName = "Frances";
		String fullName = firstName + " " + middleName + " " + lastName;
		
		System.out.println("The price of the item is: $" + itemPrice);
		System.out.println("The amount of money in my wallet is: $" + moneyWallet);
		System.out.println("The number of friends I have is: " + numberFriends);
		System.out.println("My age is: " + nicoleAge + " " + "years old");
		System.out.println("My first name is: " + firstName);
		System.out.println("My last name is: " + lastName);
		System.out.println("My middle name is: " + middleName);

		//4a New amount of Money in wallet after buying item
		moneyWallet = moneyWallet - itemPrice;
		System.out.println("Bought an item and now the new amount of money in my wallet is: $" + moneyWallet);
		
		//4b Number of friends you’ve made each year based on your age variable and your number of friends variable
		friendsPerYear =  numberFriends / nicoleAge;
		System.out.println("My number of friends I've made each year based on my age and number of friends is: " + friendsPerYear);
		
		//4c Full name based on first name, middle initial, and last name
		System.out.println("My full name is: " + fullName);
		
		
	}

}
