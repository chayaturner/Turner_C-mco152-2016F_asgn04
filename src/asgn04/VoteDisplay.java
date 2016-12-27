package asgn04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class VoteDisplay {

	protected String displayName;
	
	protected IPopularBehavior popBehavior;
	protected IElectoralBehavior elecBehavior;
	protected VotingData states;
	protected int[] popDemVotes;
	protected int[] popRepVotes;
	protected int[] elecDemVotes;
	protected int[] elecRepVotes;
		
	public int performPopDem(){
		return popBehavior.popularDemocraticReport(popDemVotes);
	}
	
	public int performPopRep(){
		return popBehavior.popularRepublicanReport(popRepVotes);
	}
	
	public int performDemElec(){
		return elecBehavior.electoralDemReport(elecDemVotes);
	}
	
	public int performRepElec(){
		return elecBehavior.electoralRepReport(elecRepVotes);
	}
	
	public void display()
	{
		// some special algorithm for predicting the votes and displaying the results		
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();
		String currentTime = dateFormat.format(date);
		System.out.println("Current Election Statistics from " + displayName + ":");
		System.out.println("*All reports are purely observational and not legally binding in any way.* " + currentTime);
		
		//print the reported results that have been manipulated by the behaviors
			System.out.println("\nPopular Democratic votes: " + performPopDem() 
					+ "\nPopular Republican votes: " + performPopRep()
					+ "\nElectoral Democratic votes: " + performDemElec()
					+ "\nElectoral Republican votes: " + performRepElec()
					+ "\n");
			
			//predicted lead is the party with the most electoral votes
			if(performDemElec() > performRepElec()){
				System.out.println("Democratic party is in the lead.\n");
			} else if (performRepElec() > performDemElec()){
				System.out.println("Republican party is in the lead.\n");
			} else {
				System.out.println("Tie between parties.");
			}
		
	}
	
	
	
}
