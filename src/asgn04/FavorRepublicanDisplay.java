package asgn04;

import java.util.Observable;
import java.util.Observer;

public class FavorRepublicanDisplay extends VoteDisplay implements Observer{

	public FavorRepublicanDisplay(Observable observable){
		elecBehavior = new ElecAlwaysRep();
		//elecBehavior = new ElecSplitRep();
		popBehavior = new PopFivePercentLessDem();
		
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
			elecVotes = voteStats.getElecVotes();
			
			display();
		}
	}
}