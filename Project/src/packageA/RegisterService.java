package packageA;

public class RegisterService {
	
//***** to be implemented
	
	public Register checkAvailability(Register reg) throws Exception {
		boolean flag = false;
		
		for(Trainers t: UserInterface.trainers) {
			if(reg.getCategory()==t.getCategory()&&t.getCountoftrainees()<10) {
				reg.setMessage("registration done with id " + reg.getCategory().substring(0,2)+"-"+ (t.getCountoftrainees()+1));
				flag = true;
				System.out.println(reg.getMessage());
				break;
			}
		}
		
		if(flag==false) {
			reg.setMessage("Registration cannot be done for the cateogry");;
			
			
			
			
			
			throw new Exception (reg.getMessage());
		}
		traineeslist(reg);
		return reg;
	}
	
	public void traineeslist(Register reg) {
		
		UserInterface.traineeslist.add(reg);
	}

}
