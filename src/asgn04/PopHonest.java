package asgn04;

public class PopHonest implements IPopularBehavior{
	
private int democraticVotes, republicanVotes;
	
	@Override
	public int popularDemocraticReport(int demVote) {
		democraticVotes = demVote;
		return democraticVotes;
	}
	
	public int popularRepublicanReport(int repVote){
		republicanVotes = repVote;
		return republicanVotes;
	}

}
