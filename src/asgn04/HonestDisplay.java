package asgn04;

import java.util.Observable;
import java.util.Observer;

public class HonestDisplay extends VoteDisplay implements Observer{

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

}
