package asgn04;

import java.util.Observable;

//Observable returns the current standing of every state
//PUSH

public class VotingData extends Observable {
	
	
	
	// Object to use for pushing the information
	public class VoteStats
	{
		private int democraticVotes;
		private int republicanVotes;
		private int electoralVotes;
		
		public VoteStats (int demVotes, int repVotes, int elecVotes)
		{ this.democraticVotes = demVotes; this.republicanVotes = repVotes;
			this.electoralVotes = elecVotes; }
		
		public int getDemVotes () { return democraticVotes; }
		public int getRepVotes () { return republicanVotes; }
		public int getElecVotes () { return electoralVotes; }
		
	}
	
		private int democraticVotes;
		private int republicanVotes;
		private int electoralVotes;
	
	public VotingData () {}
	
	public void votesChanged () 
	{
		setChanged();
		notifyObservers(new VoteStats (democraticVotes, republicanVotes, electoralVotes));
	}
	
	public void setVotes (int demVotes, int repVotes, int elecVotes)
	{
		this.democraticVotes = demVotes;
		this.republicanVotes = repVotes;
		this.electoralVotes = elecVotes;
		votesChanged();
	}
	
}