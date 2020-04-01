
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		//Food foodObject= new Food();
		//Food biriyaniObject = new Biriyani();
		//Food kababObject= new Kabab();
		//foodObject.eatFood();
		//biriyaniObject.eatFood();
		//kababObject.eatFood();
		
		Food foodObject[] = new Food[3];
		
		foodObject[0]= new Biriyani();
		foodObject[1]= new Kabab();
		foodObject[2]= new Food();

		for(int x=0; x<3;x++) {
			
			foodObject[x].eatFood();
			foodObject[x].payBill();
		}
	}

}
