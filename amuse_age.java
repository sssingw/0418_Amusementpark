package pr0415;


	import java.util.Calendar;
	import java.util.Date;


	public class amuse_age {
					

		public static int ageProcess (String reg_String) {		
			int year_process2 = 0;	
			int year_process3 = 0;
			String sub_regnum =reg_String.substring(0,2);
			String sub_regnum1 = sub_regnum.substring(0,1);
			
			if (sub_regnum1.equals("0")) {
				String year_process1 = "20" + sub_regnum;
				year_process2 = Integer.parseInt(year_process1);
				year_process3 = amuse_age.ageType(year_process2);
				
			} else {
				String year_process1 = "19" + sub_regnum;
				year_process2 = Integer.parseInt(year_process1);	
				year_process3 = amuse_age.ageType(year_process2);
			} 
				return year_process3;	   //타입을 반환
			}

		public static int ageType(int age_year) {		
			int age = 2021 - age_year + 1;
			int age_type = 0;
							
				if (19 <= age && age <= 64) {
					age_type = 1; 
				} else if (13 <= age && age <= 18) {			
					age_type = amuse_const.student;
				} else if (3 <= age && age <= 12) {
					age_type = amuse_const.child;
				} else if (65 <= age) {
					age_type = amuse_const.senior;
				} else if (age <= 2) {
					age_type = amuse_const.baby;
				}			
			return age_type;
		}
	}

