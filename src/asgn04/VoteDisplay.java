package asgn04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Observable;

public abstract class VoteDisplay {

	IPopularBehavior popBehavior;
	IElectoralBehavior elecBehavior;
	//VotingData[] states;
	VotingData states;
	int[] popDemVotes, popRepVotes, elecDemVotes, elecRepVotes;
		
	public void display()
	{		
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();
		String currentTime = dateFormat.format(date);
				
		popDemVotes = performPopDem().getDemVotes();
		popRepVotes = performPopRep().getRepVotes();
		elecDemVotes = performDemElec().getElectoralDemVotes();
		elecRepVotes = performRepElec().getElectoralRepVotes();
		
		
		for(int i = 0; i < popDemVotes.length; i++){
			System.out.println("*All reports are purely observational and not legally binding in any way.* " + currentTime);
			System.out.println("Current Election Statistics:\n "
					+ "Popular Democratic votes: " + popDemVotes[i] 
					+ "\nPopular Republican votes: " + popRepVotes[i]
					+ "\nElectoral Democratic votes: " + elecDemVotes[i]
					+ "\nElectoral Republican votes: " + elecDemVotes[i]
					+ "\n");
		}
	}
	
	public VotingData performPopDem(){
		return popBehavior.popularDemocraticReport();
	}
	
	public VotingData performPopRep(){
		return popBehavior.popularRepublicanReport();
	}
	
	public VotingData performDemElec(){
		return elecBehavior.electoralDemReport();
	}
	
	public VotingData performRepElec(){
		return elecBehavior.electoralRepReport();
	}
	
	
	
	
	
}
