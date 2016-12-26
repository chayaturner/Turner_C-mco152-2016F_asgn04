package asgn04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;

public class HonestDisplay extends VoteDisplay implements Observer{

	private int[] popDemVotes;
	private int[] popRepVotes;
	private int[] elecDemVotes;
	private int[] elecRepVotes;
	
	public HonestDisplay(Observable observable){
		elecBehavior = new ElecHonest();
		popBehavior = new PopHonest();
		
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable observable, Object stateObject)
	{
		if (stateObject instanceof VotingData.VoteStats)
		{
			VotingData.VoteStats voteStats = (VotingData.VoteStats) stateObject;
			
			popDemVotes = voteStats.getDemVotes();
			popRepVotes = voteStats.getRepVotes();
			elecDemVotes = voteStats.getElecDemVotes();
			elecRepVotes = voteStats.getElecRepVotes();
			
			display();
		}
	}
	
	public void display()
	{
		// some special algorithm for predicting the votes and displaying the results		
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();
		String currentTime = dateFormat.format(date);
		System.out.println("Current Election Statistics from Honest Display:");
		System.out.println("*All reports are purely observational and not legally binding in any way.* " + currentTime);
		
		//print the reported results that have been manipulated by the behaviors
			System.out.println("\nPopular Democratic votes: " + popBehavior.popularDemocraticReport(popDemVotes) 
					+ "\nPopular Republican votes: " + popBehavior.popularRepublicanReport(popRepVotes)
					+ "\nElectoral Democratic votes: " + elecBehavior.electoralDemReport(elecDemVotes)
					+ "\nElectoral Republican votes: " + elecBehavior.electoralRepReport(elecRepVotes)
					+ "\n");
			
			//predicted lead is the party with the most electoral votes
			if(elecBehavior.electoralDemReport(elecDemVotes) > elecBehavior.electoralRepReport(elecRepVotes)){
				System.out.println("Democratic party is in the lead.\n");
			} else {
				System.out.println("Republican party is in the lead.\n");
			}
		
	}
}
