package challenge;

public class loyalty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String loyaltyMemberStatus = "Silver";
double loyaltyMemberDiscount = 0.0;
switch (loyaltyMemberStatus) {
	case "Silver":
		loyaltyMemberDiscount = .1;
	break;
case "Gold":
		loyaltyMemberDiscount = .15;
	break;
case "Platinum" :
		loyaltyMemberDiscount = .25;
	break;


}System.out.println(loyaltyMemberDiscount);
double billTotal = 600.00;
double adjustedTotal = billTotal - billTotal*loyaltyMemberDiscount;
System.out.println (adjustedTotal);
	
if (adjustedTotal >500) {
	if (loyaltyMemberStatus == "Silver") {
		loyaltyMemberStatus = "Gold";
	} else if (loyaltyMemberStatus == "Gold") {
		loyaltyMemberStatus = "Platinum";
	} System.out.println(loyaltyMemberStatus);
		
	}
}
}
