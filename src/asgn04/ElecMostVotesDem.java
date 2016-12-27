package asgn04;

public class ElecMostVotesDem implements IElectoralBehavior{

	private int demVotes;
	private int repVotes;

	//the highest amount of electoral votes 
	//one of these states gets is 30.
	//the state with 30 will be automatically Dem.

	@Override
	public int electoralDemReport(int[] data) {
		for(int i=0; i < data.length; i++){
			demVotes+=data[i];
		}
		return demVotes;
	}
	
	@Override
	public int electoralRepReport(int[] data) {
		for(int i=0; i < data.length; i++){
			if(data[i] == 30){
				demVotes+= 30; //give the state with 30 elec votes to Dem.
			} else {
				repVotes+=data[i];
			}
			
		}
		return repVotes;
	}
	
}
