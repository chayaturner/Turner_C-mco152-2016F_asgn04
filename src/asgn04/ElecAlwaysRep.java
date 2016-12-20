package asgn04;

public class ElecAlwaysRep implements IElectoralBehavior{
	
	private int electoralVote;
	
	@Override
	public int electoralReport(int elecVotes) {
		electoralVote = elecVotes;
		return electoralVote;
	}
}
