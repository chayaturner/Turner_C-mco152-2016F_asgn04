package asgn04;

public class ElecTwoPercentMoreDem implements IElectoralBehavior{

	private int electoralVote;
	
	@Override
	public int electoralReport(int elecVotes) {
		
		return electoralVote;
	}
	

}
