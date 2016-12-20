package asgn04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class VoteDisplay {

	IPopularBehavior popBehavior;
	IElectoralBehavior elecBehavior;
	int popDemVotes, popRepVotes, elecDemVotes, elecRepVotes;
		
	public void display()
	{		
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();
		String currentTime = dateFormat.format(date);
		
		System.out.println("*All reports are purely observational and not legally binding in any way.* " + currentTime);
		System.out.println("Current Election Statistics:\t "
				+ "Popular Democratic vote: " + performPopDem() 
				+ "Popular Republican vote: " + performPopRep()
				+ "Electoral Democratic vote: " + performElecDem()
				+ "Electoral Republican vote: " + performElecRep()
				+ ".");
	}
	
	public int performPopDem(){
		return popBehavior.popularDemocraticReport(popDemVotes);
	}
	
	public int performPopRep(){
		return popBehavior.popularRepublicanReport(popRepVotes);
	}
	
	public int performElecDem(){
		return elecBehavior.electoralDemocraticReport(elecDemVotes);
	}
	
	public int performElecRep(){
		return elecBehavior.electoralRepublicanReport(elecRepVotes);
	}
	
}
