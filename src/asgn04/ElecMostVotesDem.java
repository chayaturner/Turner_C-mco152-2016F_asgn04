package asgn04;

public class ElecMostVotesDem implements IElectoralBehavior{

	private int electoralDemocraticVote, electoralRepublicanVote;
	
	@Override
	public int electoralDemocraticReport(int demVotes) {
		
		return electoralDemocraticVote;
	}
	
	public int electoralRepublicanReport(int repVotes){
		
		return electoralRepublicanVote;
	}
}
