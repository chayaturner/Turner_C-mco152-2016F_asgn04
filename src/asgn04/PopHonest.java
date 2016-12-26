package asgn04;

public class PopHonest implements IPopularBehavior{
	
	private VotingData demVotes, repVotes;

	@Override
	public VotingData popularDemocraticReport() {
		return demVotes;
	}

	@Override
	public VotingData popularRepublicanReport() {
		return repVotes;
	}

}
