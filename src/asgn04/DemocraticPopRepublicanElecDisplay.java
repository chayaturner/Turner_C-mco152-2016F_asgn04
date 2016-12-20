package asgn04;

import java.util.Observable;
import java.util.Observer;

public class DemocraticPopRepublicanElecDisplay extends VoteDisplay implements Observer{

	public DemocraticPopRepublicanElecDisplay(Observable observable){
		elecBehavior = new ElecAlwaysRep();
		//elecBehavior = new ElecSplitRep();
		popBehavior = new  PopIgnoreMostRep();
		
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable observable, Object stateObject)
	{
		if (stateObject instanceof VotingData.VoteStats)
		{
			VotingData.VoteStats voteStats = (VotingData.VoteStats) stateObject;
			popularVote = voteStats.getDemVotes() + voteStats.getRepVotes();
			electoralVote = voteStats.getElecVotes();
			display();
		}
	}

}
