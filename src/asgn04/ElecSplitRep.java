package asgn04;

public class ElecSplitRep implements IElectoralBehavior{

	//state with smallest dem lead splits the votes btwn dem and rep.
	private int demVotes;
	private int repVotes;

	@Override
	public int electoralDemReport(int[] data) {
		
		//0 means the state did not win dem. 
		//state with smallest non-0 value gets split.
		int min = 1;
		
		for(int i=0; i < data.length; i++){
			demVotes+=data[i];
			if(data[i] < min){
				min = data[i];
			}
		}
		
		if((min%2)!=0){
			demVotes+=min/2; //even, split in half
			repVotes+=min/2;
		} else {
			demVotes+=min/2;
			repVotes+=(min/2)+1; //odd, give extra to rep
		}
		
		
		return demVotes;
	}
	
	@Override
	public int electoralRepReport(int[] data) {
		for(int i=0; i < data.length; i++){
			repVotes+=data[i];
		}
		return repVotes;
	}
}
