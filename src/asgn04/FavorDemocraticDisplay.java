package asgn04;

import java.util.Observable;
import java.util.Observer;

public class FavorDemocraticDisplay extends VoteDisplay implements Observer{
	
	public FavorDemocraticDisplay(Observable observable){
		elecBehavior = new ElecMostVotesDem();
		//elecBehavior = new ElecTwoPercentMoreDem();
		popBehavior = new PopIgnoreMostRep();
		
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable observable, Object stateObject)
	{
		if (stateObject instanceof VotingData.VoteStats)
		{
			VotingData.VoteStats voteStats = (VotingData.VoteStats) stateObject;
			popDemVotes = voteStats.getPopDemVotes();
			popRepVotes = voteStats.getPopRepVotes();
			elecDemVotes = voteStats.getElecDemVotes();
			elecRepVotes = voteStats.getElecRepVotes();
			
			display();
		}
	}

}
