package asgn04;

//ignore the state with the most republican votes
public class PopIgnoreMostRep implements IPopularBehavior{

private int demVotes, repVotes;


	@Override
	public int popularDemocraticReport(int[] data) {
		//returns correct amount of dem votes
		for(int i=0; i < data.length; i++){
			demVotes+=data[i];
		}
		
		return demVotes;
	}

	@Override
	public int popularRepublicanReport(int[] data) {		
		//calculate total amount of popular rep votes
		for(int i = 0; i < data.length; i++){
			repVotes += data[i];
		}
		
		//find the state with the highest amount of rep votes
		//and deduct it from the total
		int mostReps = data[0];
		
		for(int i = 1; i < data.length; i++){
			if(data[i] > mostReps){
				mostReps = data[i];
			}
		}
	
		repVotes -= mostReps;
		
		return repVotes;
	}

}
