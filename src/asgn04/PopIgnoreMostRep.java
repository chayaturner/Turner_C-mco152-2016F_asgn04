package asgn04;

public class PopIgnoreMostRep implements IPopularBehavior{

private int demVotes, repVotes;
	
	@Override
	public int popularDemocraticReport() {
		return demVotes;
	}
	
	public int popularRepublicanReport(){
		//ignore the state with the most republican votes
		return repVotes;
	}

}
