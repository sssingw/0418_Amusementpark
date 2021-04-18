package pr0415;

public class amuse_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
				int inputticket = amuse_input.Input_ticket_type();
								
				String inputregnum = amuse_input.Input_regist_num();							
				int age_type1 = amuse_age.ageProcess(inputregnum);

				int inputcount = amuse_input.Input_count();
				
				int inputpriornum = amuse_input.Input_prior_type();
			
			
				int pay_price = 0;
				if (inputticket == amuse_const.day) {
					pay_price = amuse_onePrice.Day_priceProcess(age_type1, inputpriornum, inputcount);
					System.out.println(pay_price);
					
				} else if (inputticket == amuse_const.night) {
					pay_price = amuse_onePrice.Night_priceProcess(age_type1, inputpriornum, inputcount);
					System.out.println(pay_price);
				}
			
				
	
}
}
			
			
		
			
		