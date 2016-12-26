package asgn04;

public class PopFivePercentLessDem implements IPopularBehavior{

	private int demVotes, repVotes;
	
	@Override
	public int popularDemocraticReport(int[] data) {
		//returns dem with 5% fewer votes in all states
		for(int i=0; i < data.length; i++){
			repVotes+=data[i]-(data[i]*(0.05));
		}

		return demVotes;
	}
	
	public int popularRepublicanReport(int[] data){
		for(int i=0; i < data.length; i++){
			repVotes+=data[i];
		}
		
		return repVotes;
	}
	

}
