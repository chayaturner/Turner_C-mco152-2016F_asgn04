package asgn04;

public class ElecAlwaysRep implements IElectoralBehavior{
	
	private int electoralDemVotes;
	private int electoralRepVotes;
	private VotingData[] states;
	private VotingData[] manipulatedStates;
		
	//This class reports back with an array of states with voting data that
	//has been manipulated based on a specific pop/elec strategy 
	//This behavior makes state1 always get the republican vote from the electoral college

		public ElecAlwaysRep(States states){
			this.states = states.getStates();
		}
		
		@Override
		public VotingData[] electoralDemReport() {
		
			//if the state is state1, it automatically gets 0 dem electoral votes
			//Otherwise, it reports the correct amount.
			for(int i = 0; i < states.length; i++){
				if(i == 0){
					manipulatedStates[i].setElectoralDemVotes(0);
				} else {
					electoralDemVotes = states[i].getElectoralDemVotes();
				manipulatedStates[i].setElectoralDemVotes(electoralDemVotes);
				}
			}
			
			return manipulatedStates;
		}
		
		@Override
		public VotingData[] electoralRepReport() {
			//if the state is state1, republicans automatically gets all the 
			//votes from the electoral college
			for(int i = 0; i < states.length; i++){
				if(i == 0){
					manipulatedStates[i].setElectoralRepVotes(5);
				} else {
					electoralRepVotes = states[i].getElectoralRepVotes();
				manipulatedStates[i].setElectoralRepVotes(electoralRepVotes);
				}
			return manipulatedStates;
		}
		
		}
}
