package asgn04;

import java.util.Observable;

//Observable returns the current standing of every state
//PUSH

public class VotingData extends Observable {
	
	// Object to use for pushing the information
	public class VoteStats
	{
		private int[] democraticVotes;
		private int[] republicanVotes;
		private int[] electoralDemVotes;
		private int[] electoralRepVotes;
		
		public VoteStats (int[] demVotes, int[] repVotes, int[] elecDemVotes, int[] elecRepVotes)
		{ this.democraticVotes = demVotes; this.republicanVotes = repVotes;
			this.electoralDemVotes = elecDemVotes; this.electoralRepVotes = elecRepVotes;}
		
		public int[] getDemVotes () { return democraticVotes; }
		public int[] getRepVotes () { return republicanVotes; }
		public int[] getElecDemVotes () { return electoralDemVotes; }
		public int[] getElecRepVotes() {return electoralRepVotes; }
		
	}
	
		private int[] democraticVotes;
		private int[] republicanVotes;
		private int[] electoralDemVotes;
		private int[] electoralRepVotes;
	
	public VotingData () {}
	
	public void votesChanged () 
	{
		setChanged();
		notifyObservers(new VoteStats (democraticVotes, republicanVotes, electoralDemVotes, electoralRepVotes));
	}
	
	public void setVotes (int[] demVotes, int[] repVotes, int[] elecDemVotes, int[] elecRepVotes)
	{
		this.democraticVotes = demVotes;
		this.republicanVotes = repVotes;
		this.electoralDemVotes = elecDemVotes;
		this.electoralRepVotes = elecRepVotes;
		votesChanged();
	}
	
	public int[] getDemVotes(){
		return democraticVotes;
	}
	
	public int[] getRepVotes(){
		return republicanVotes;
	}
	
	public int[] getElectoralDemVotes(){
		return electoralDemVotes;
	}
	
	public int[] getElectoralRepVotes(){
		return electoralRepVotes;
	}
	
	public void setDemVotes(int[] votes){
		democraticVotes = votes;
	}
	
	public void setRepVotes(int[] votes){
		republicanVotes = votes;
	}

	public void setElectoralDemVotes(int[] votes) {
			electoralDemVotes = votes;
	}
	
	public void setElectoralRepVotes(int[] votes){
		electoralRepVotes = votes;
	}
	
}