package asgn04;

public class ElecAlwaysRep implements IElectoralBehavior{
	
	//State 1 will always be Republican
	
	private int demVotes;
	private int repVotes;
	
	@Override
	public int electoralDemReport(int[] data) {
		
		data[0] = 0; //state 1 will always be rep
		for(int i=0; i < data.length; i++){
			demVotes+=data[i];
		}
		return demVotes;
	}
	
	@Override
	public int electoralRepReport(int[] data) {
		
		data[0] = 20; //state 1 will always be rep
		for(int i=0; i < data.length; i++){
			repVotes+=data[i];
		}
		return repVotes;
	}
}
