package asgn04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class VoteDisplay {

	IPopularBehavior popBehavior;
	IElectoralBehavior elecBehavior;
	int popularVote, electoralVote;
		
	public void display()
	{		
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();
		String currentTime = dateFormat.format(date);
		
		System.out.println("*All reports are purely observational and not legally binding in any way.* " + currentTime);
		System.out.println("Current Election Statistics:\t "
				+ "Popular vote: " + popularVote + 
				", Electoral vote: " + electoralVote + ".");
	}
	
	public void performPop(){
		popBehavior.popularReport();
	}
	
	public void performElec(){
		elecBehavior.electoralReport();
	}
	
}
