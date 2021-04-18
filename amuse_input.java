package pr0415;


	import java.util.Scanner;

	public class amuse_input {
			
		
		public static int Input_ticket_type () {				                    //권종을 입력받는 메서드
			System.out.println("권종을 선택하세요");
			System.out.printf("%d. %s\n", amuse_const.day, "주간권");
			System.out.printf("%d. %s\n", amuse_const.night, "야간권");		
			Scanner sc = new Scanner (System.in);
			int input_type_num = sc.nextInt();
			
			while (true) {
				if ((input_type_num == amuse_const.day) || (input_type_num == amuse_const.night)) {					
					break;
				} else {					
					System.out.println("입력오류!다시 입력해주세요");
					break;
				}		
			} return input_type_num;
		}
		
		
		public static String Input_regist_num () {							//주민번호를 입력받는 메서드(문자열반환)
			System.out.println("주민번호를 입력하세요");
			Scanner sc = new Scanner (System.in);	
			String input_reg_string = sc.next();
					
			while(true) {
				if (input_reg_string.length() >14) {
					System.out.println("입력오류! 다시 입력해주세요");
					break;
				} else {					
				}
				break;
			} 
			return input_reg_string;
		}
	
		
		public static int Input_count() {												//수량을 입력받는 메서드
			Scanner sc = new Scanner (System.in);
			System.out.println("몇 개를 주문하시겠습니까?  (최대 10개)");
			int input_request_num = sc.nextInt();
			
			while (true) {
				if (input_request_num >=  11 || input_request_num <= 0) {
					System.out.println("다시 입력해주세요");
					break;
				} else {					
			}
				break;
			}
			return input_request_num;
		}
		
		
		public static int Input_prior_type () {												//우대사항을 입력받는 메서드
			Scanner sc = new Scanner (System.in);
			System.out.printf("%s\n %d. %s\n %d. %s\n %d. %s\n %d. %s\n %d. %s\n",
					"우대사항을 선택하세요", amuse_const.none, "없음 (나이 우대는 자동처리)", amuse_const.disabled , "장애인",
							amuse_const.national, "국가유공자", amuse_const.children, "다자녀", amuse_const.pregnant, "임산부");
			int input_prior_num = sc.nextInt();
			
			while(true) {
				if ((input_prior_num < amuse_const.none) || (input_prior_num < amuse_const.pregnant)) {
					System.out.println("다시 입력해주세요");
					break;
				} else {					
				}
				break;
			}
			return input_prior_num;
		}
	}
		


