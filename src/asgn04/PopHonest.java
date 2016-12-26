package asgn04;

public class PopHonest implements IPopularBehavior{
	
	private int demVotes, repVotes;

	@Override
	public int popularDemocraticReport(int[] data) {
		for(int i=0; i < data.length; i++){
			demVotes+=data[i];
		}
		return demVotes;
	}

	@Override
	public int popularRepublicanReport(int[] data) {		
		for(int i=0; i < data.length; i++){
			repVotes+=data[i];
		}
		return repVotes;
	}

}
