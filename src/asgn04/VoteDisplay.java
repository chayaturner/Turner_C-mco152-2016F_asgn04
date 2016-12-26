package asgn04;

public abstract class VoteDisplay {

	IPopularBehavior popBehavior;
	IElectoralBehavior elecBehavior;
	VotingData states;
	int[] popDemVotes, popRepVotes, elecDemVotes, elecRepVotes;
		
	public VotingData performPopDem(){
		return popBehavior.popularDemocraticReport();
	}
	
	public VotingData performPopRep(){
		return popBehavior.popularRepublicanReport();
	}
	
	public VotingData performDemElec(){
		return elecBehavior.electoralDemReport();
	}
	
	public VotingData performRepElec(){
		return elecBehavior.electoralRepReport();
	}
	
	
	
	
	
}
