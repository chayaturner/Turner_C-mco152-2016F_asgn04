package asgn04;

public class ElecHonest implements IElectoralBehavior{

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
		for(int i=0; i < data.length; i++){
			repVotes+=data[i];
		}
		return repVotes;
	}
	
}
