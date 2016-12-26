package asgn04;

public class PopHonest implements IPopularBehavior{
	
	private int demVotes, repVotes;

	@Override
	public int popularDemocraticReport(int[] data) {
		int[] votesArray = data;
		for(int i=0; i < votesArray.length; i++){
			demVotes+=votesArray[i];
		}
		return demVotes;
	}

	@Override
	public int popularRepublicanReport(int[] data) {		
		int[] votesArray = data;
		for(int i=0; i < votesArray.length; i++){
			repVotes+=votesArray[i];
		}
		return repVotes;
	}

}
