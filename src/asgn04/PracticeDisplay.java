package asgn04;

import java.util.Observable;
import java.util.Observer;

public class PracticeDisplay extends VoteDisplay implements Observer{

	//private VotingData[] states; //put this in VoteDisplay
	private Observable observable;
			
		public PracticeDisplay(VotingData states){ //receives array of observables instead of 1 observable.
			
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
			if (statesObject instanceof VotingData)
			{
				VotingData.VoteStats voteStats = (VotingData.VoteStats) statesObject;
				popDemVotes = voteStats.getDemVotes();
				popRepVotes = voteStats.getRepVotes();
				elecDemVotes = voteStats.getElecDemVotes();
				elecRepVotes = voteStats.getElecRepVotes();
				
				display();
			}
		}
		
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
	}