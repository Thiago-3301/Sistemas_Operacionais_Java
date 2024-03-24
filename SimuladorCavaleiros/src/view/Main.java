package view;
import controller.ThreadCavaleiros;

public class Main {
	
	public static void main(String[] args) {
		
			ThreadCavaleiros cavaleiro1 = new ThreadCavaleiros(1);
			ThreadCavaleiros cavaleiro2 = new ThreadCavaleiros(2);
			ThreadCavaleiros cavaleiro3 = new ThreadCavaleiros(3);
			ThreadCavaleiros cavaleiro4 = new ThreadCavaleiros(4);
			
			cavaleiro1.start();
	        cavaleiro2.start();
	        cavaleiro3.start();
	        cavaleiro4.start();
		
	}

}
