package asgn04;

import java.util.Observable;

//Observable returns the current standing of every state
//PUSH

public class VotingData extends Observable {
	
	// Object to use for pushing the information
	public class VoteStats
	{
		private int popularDemocraticVotes;
		private int popularRepublicanVotes;
		private int electoralDemocraticVotes;
		private int electoralRepublicanVotes;
		
		public VoteStats (int popDemVotes, int popRepVotes, int elecDemVotes, int elecRepVotes)
		{ this.popularDemocraticVotes = popDemVotes; this.popularRepublicanVotes = popRepVotes;
			this.electoralDemocraticVotes = elecDemVotes; 
				this.electoralRepublicanVotes = elecRepVotes; }
		
		public int getPopDemVotes () { return popularDemocraticVotes; }
		public int getPopRepVotes () { return popularRepublicanVotes; }
		public int getElecDemVotes () { return electoralDemocraticVotes; }
		public int getElecRepVotes() { return electoralRepublicanVotes; }
		
	}
	
		private int popularDemocraticVotes;
		private int popularRepublicanVotes;
		private int electoralDemocraticVotes;
		private int electoralRepublicanVotes;
	
	public VotingData () {}
	
	public void votesChanged () 
	{
		setChanged();
		notifyObservers(new VoteStats (popularDemocraticVotes, popularRepublicanVotes, electoralDemocraticVotes, electoralRepublicanVotes));
	}
	
	public void setVotes (int popDemVotes, int popRepVotes, int elecDemVotes, int elecRepVotes)
	{
		this.popularDemocraticVotes = popDemVotes;
		this.popularRepublicanVotes = popRepVotes;
		this.electoralDemocraticVotes = elecDemVotes;
		this.electoralRepublicanVotes = elecRepVotes;
		votesChanged();
	}
	
}