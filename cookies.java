package challenge;

public class cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numberOfCookies = 12;
int numberOfChildren = 7;
int remainingCookies = numberOfCookies % numberOfChildren;
if (remainingCookies >= 5) {
	System.out.println("Jackpot!");
} else if (remainingCookies >=2) {
	System.out.println("Woohoo!");
} else if (remainingCookies > 0) {
	System.out.println("Yes!");
}else {
	System.out.println("Sad Face");
}
	}

}