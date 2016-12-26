package asgn04;

public class ElecMostVotesDem implements IElectoralBehavior{

	private int electoralDemVote;
	private int electoralRepVote;
	
	@Override
	public int electoralDemReport(int elecDemVotes) {
		electoralDemVote = elecDemVotes;
		return electoralDemVote;
	}

	@Override
	public int electoralRepReport(int elecRepVotes) {
		electoralRepVote = elecRepVotes;
		return electoralRepVote;
	}
	
	
}
