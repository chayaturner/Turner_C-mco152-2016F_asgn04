package asgn04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;

public class CurrentElectionDisplay implements Observer, IDisplay {

	private int popDemVote;
	private int popRepVote;
	private int elecDemVote;
	private int elecRepVote;
	
	public CurrentElectionDisplay(Observable observable)
	{
		observable.addObserver(this);
	}
	
	public void update(Observable observable, Object stateObject)
	{
		if (stateObject instanceof VotingData.VoteStats)
		{
			VotingData.VoteStats voteStats = (VotingData.VoteStats) stateObject;
			this.popularVote = voteStats.getDemVotes() + voteStats.getRepVotes();
			this.electoralVote = voteStats.getElecVotes();
			display();
		}
	}
	
	public void display()
	{
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();
		String currentTime = dateFormat.format(date);
		
		System.out.println("*All reports are purely observational and not legally binding in any way.* " + currentTime);
		System.out.println("Current Election Statistics:\t "
				+ "Popular vote: " + popularVote + 
				", Electoral vote: " + electoralVote + ".");
	}
}