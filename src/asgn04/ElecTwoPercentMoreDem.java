package asgn04;

public class ElecTwoPercentMoreDem implements IElectoralBehavior{

	private int demVotes;
	private int repVotes;

	@Override
	public int electoralDemReport(int[] data) {
		for(int i=0; i < data.length; i++){
			demVotes+=data[i];
		}
		return demVotes;
	}
	
	@Override
	public int electoralRepReport(int[] data) {
		//gives 2% of all rep votes to dem
		for(int i=0; i < data.length; i++){
			repVotes+= (data[i] - (data[i]*0.02));
			demVotes+= data[i]*0.02;
		}
		return repVotes;
	}

}
