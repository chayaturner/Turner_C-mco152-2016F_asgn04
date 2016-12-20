package asgn04;

public class ElecHonest implements IElectoralBehavior{

private int electoralDemocraticVote, electoralRepublicanVote;
	
	@Override
	public int electoralDemocraticReport(int demVotes) {
		electoralDemocraticVote = demVotes;
		return electoralDemocraticVote;
	}
	
	public int electoralRepublicanReport(int repVotes){
		electoralRepublicanVote = repVotes;
		return electoralRepublicanVote;
	}
}
