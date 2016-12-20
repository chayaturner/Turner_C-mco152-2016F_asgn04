package asgn04;

public class ElecMostVotesDem implements IElectoralBehavior{

	private int electoralVote;
	
	@Override
	public int electoralReport(int elecVotes) {
		
		return electoralVote;
	}
	
}
