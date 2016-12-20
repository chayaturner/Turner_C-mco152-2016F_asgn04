package asgn04;

public class PopHonest implements IPopularBehavior{
	
private int democraticVotes, republicanVotes;
	
	@Override
	public int popularDemocraticReport(int demVote) {
		
		return democraticVotes;
	}
	
	public int popularRepublicanReport(int repVote){
		 return republicanVotes;
	}

}
