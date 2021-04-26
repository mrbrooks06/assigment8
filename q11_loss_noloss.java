package assigments8;

public class q11_loss_noloss {

	public static void main(String[] args) {
	
		c_profits(200,300);
		

	}

	public static void c_profits(int buyPrice,int sellPrice) {
		
		if(buyPrice<sellPrice) {System.out.println("profit"); }
		
		else if(buyPrice>sellPrice) {System.out.println("loss");}
		else if(buyPrice==sellPrice) {System.out.println("no loss");}
		
		
		
	}
	
}
