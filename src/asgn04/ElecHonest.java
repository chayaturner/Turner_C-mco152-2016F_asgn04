package asgn04;

public class ElecHonest implements IElectoralBehavior{

private int demVotes;
private int repVotes;
//private VotingData[] states;
//private VotingData[] manipulatedStates;
	
//This class reports back with an array of states with voting data that
//has been manipulated based on a specific pop/elec strategy 
//This behavior reports back the honest amount of votes. 

	/*
	 public ElecHonest(){
		
	}
	
	@Override
	public VotingData[] electoralDemReport() {
	
		for(int i = 0; i < states.length; i++){
			electoralDemVotes = states[i].getElectoralDemVotes();
			manipulatedStates[i].setElectoralDemVotes(electoralDemVotes);
		}
		
		return manipulatedStates;
	}
	
	@Override
	public VotingData[] electoralRepReport() {
		for(int i = 0; i < states.length; i++){
			electoralRepVotes = states[i].getElectoralRepVotes();
			manipulatedStates[i].setElectoralRepVotes(electoralRepVotes);
		}
		return manipulatedStates;
	}
	*/
	
	@Override
	public int electoralDemReport(int[] data) {
		int[] votesArray = data;
		for(int i=0; i < votesArray.length; i++){
			demVotes+=votesArray[i];
		}
		return demVotes;
	}
	
	@Override
	public int electoralRepReport(int[] data) {
		int[] votesArray = data;
		for(int i=0; i < votesArray.length; i++){
			repVotes+=votesArray[i];
		}
		return repVotes;
	}
	
}
