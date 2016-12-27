package asgn04;

import java.util.Observable;
import java.util.Observer;

public class FavorRepublicanDisplay extends VoteDisplay implements Observer{

	public FavorRepublicanDisplay(Observable observable){
		displayName = "Favor Republican Display";
		elecBehavior = new ElecAlwaysRep();
		//elecBehavior = new ElecSplitRep();
		popBehavior = new PopFivePercentLessDem();
		
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable observable, Object stateObject1)
	{
		if (stateObject1 instanceof VotingData.VoteStats)
		{
			VotingData.VoteStats voteStats = (VotingData.VoteStats) stateObject1;
			popDemVotes = voteStats.getDemVotes();
			popRepVotes = voteStats.getRepVotes();
			elecDemVotes = voteStats.getElecDemVotes();
			elecRepVotes = voteStats.getElecRepVotes();
			
			display();
		}
	}
}