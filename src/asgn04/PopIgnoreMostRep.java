package asgn04;

public class PopIgnoreMostRep implements IPopularBehavior{

private int democraticVotes, republicanVotes;
	
	@Override
	public int popularDemocraticReport(int demVote) {
		democraticVotes = demVote;
		return democraticVotes;
	}
	
	public int popularRepublicanReport(int repVote){
		//ignore the state with the most republican votes
		republicanVotes = 0;
		return republicanVotes;
	}

}
