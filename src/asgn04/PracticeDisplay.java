package asgn04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;

public class PracticeDisplay extends VoteDisplay implements Observer{

	private int[] popDemVotes;
	private int[] popRepVotes;
	private int[] elecDemVotes;
	private int[] elecRepVotes;
	
	private int pdv, prv, edv, erv;
	
	public PracticeDisplay(Observable observable){
		observable.addObserver(this);
	}
	
	public void update(Observable observable, Object stateObject)
	{
		if (stateObject instanceof VotingData.VoteStats)
		{
			VotingData.VoteStats votingStats = (VotingData.VoteStats) stateObject;
			this.popDemVotes = votingStats.getDemVotes();
			this.popRepVotes = votingStats.getRepVotes();
			this.elecDemVotes = votingStats.getElecDemVotes();
			this.elecRepVotes = votingStats.getElecRepVotes();
			display();
		}
	}
	
	public void display()
	{
		// some special algorithm for predicting the votes and displaying the results		
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();
		String currentTime = dateFormat.format(date);
		System.out.println("Current Election Statistics from Practice Display:");
		System.out.println("*All reports are purely observational and not legally binding in any way.* " + currentTime);
		
		
		for(int i = 0; i < popDemVotes.length; i++){
			pdv += popDemVotes[i];
			prv += popRepVotes[i];
			edv += elecDemVotes[i];
			erv += elecRepVotes[i];
			
		}
		
			System.out.println("\nPopular Democratic votes: " + pdv 
					+ "\nPopular Republican votes: " + prv
					+ "\nElectoral Democratic votes: " + edv
					+ "\nElectoral Republican votes: " + erv
					+ "\n");
			
			if(edv>erv){
				System.out.println("Democratic party is in the lead.\n");
			} else {
				System.out.println("Republican party is in the lead.\n");
			}
		
	}
}


	
/*
 * private Observable observable;

			
		//receives an observable which includes an array of each piece of data for each state
		public PracticeDisplay(VotingData states){ 
			
			//this.states = states.getStates();
			
			this.states = states;
			
			elecBehavior = new ElecHonest();
			popBehavior = new PopHonest();
			
			
			//for(int i = 0; i < this.states.length; i++){
				//observable = this.states[i]; 
				observable = this.states;
				observable.addObserver(this);
			//}
			
		}
		
		
		@Override
		public void update(Observable observable, Object statesObject)
		{
			if (statesObject instanceof VotingData.VoteStats)
			{
				VotingData.VoteStats voteStats = (VotingData.VoteStats) statesObject;
				popDemVotes = voteStats.getDemVotes();
				popRepVotes = voteStats.getRepVotes();
				elecDemVotes = voteStats.getElecDemVotes();
				elecRepVotes = voteStats.getElecRepVotes();
				
				display();
			}
		}
		
		 */
		
		/*@Override
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
		}*/
	