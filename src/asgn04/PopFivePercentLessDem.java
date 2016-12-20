package asgn04;

public class PopFivePercentLessDem implements IPopularBehavior{

	private int democraticVotes, republicanVotes;
	
	@Override
	public int popularDemocraticReport(int demVote) {
		democraticVotes = demVote - (int)(demVote * 0.05);
		return democraticVotes;
	}
	
	public int popularRepublicanReport(int repVote){
		republicanVotes = repVote;
		return republicanVotes;
	}
	

}
