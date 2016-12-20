package asgn04;

public abstract class VoteDisplay {

	IPopularBehavior popBehavior;
	IElectoralBehavior elecBehavior;
	
	public abstract void display();
	
	public void performPop(){
		popBehavior.popularReport();
	}
	
	public void performElec(){
		elecBehavior.electoralReport();
	}
	
}
