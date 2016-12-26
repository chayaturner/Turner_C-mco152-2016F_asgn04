package asgn04;

public class Program {

	public static void main(String[] args) {
		
		/*VotingData[] statesArray = new VotingData[5];
		
		VotingData state1 = new VotingData();
		VotingData state2 = new VotingData();
		VotingData state3 = new VotingData();
		VotingData state4 = new VotingData();
		VotingData state5 = new VotingData();
		
		statesArray[0] = state1;
		statesArray[1] = state2;
		statesArray[2] = state3;
		statesArray[3] = state4; 
		statesArray[4] = state5;
		
		
		//display election results using the 5 observers 
		state1.setVotes(100000,  200000, 5, 0);
		state2.setVotes(100000,  200000, 10, 0);
		state3.setVotes(100000,  200000, 0, 15);		
		state4.setVotes(100000,  200000, 0, 20);
		state5.setVotes(100000,  200000, 25, 0);
		
		FavorRepublicanDisplay repDisplay = new FavorRepublicanDisplay(statesArray);
		FavorDemocraticDisplay demDisplay = new FavorDemocraticDisplay(statesArray);
		DemocraticPopRepublicanElecDisplay demPopRepElecDisplay = new DemocraticPopRepublicanElecDisplay(statesArray);
		HonestElecFavorDemocraticPopDisplay honestElecFavorDemPopDisplay = new HonestElecFavorDemocraticPopDisplay(statesArray);
		*/
	
		VotingData states = new VotingData();
		
		int[] demVotes = new int[2];
		int[] repVotes = new int[2];
		int[] elecDemVotes = new int[2];
		int[] elecRepVotes = new int[2];
		
		//STATE 1
		demVotes[0] = 10000;
		repVotes[0] = 20000;
		elecDemVotes[0] = 0;
		elecRepVotes[0] = 15;
		
		//STATE 2
		demVotes[1] = 5000;
		repVotes[1] = 6000;
		elecDemVotes[1] = 20;
		elecRepVotes[1] = 0;
		
		states.setVotes(demVotes, repVotes, elecDemVotes, elecRepVotes);
		PracticeDisplay honestDisplay = new PracticeDisplay(states);
		
		
		/*States states = new States();
		VotingData practiceState1 = new VotingData();
		VotingData practiceState2 = new VotingData();
		practiceState1.setVotes(1000, 2000, 5, 0); //this notifies the observers and calls their update method
		practiceState2.setVotes(3000, 4000, 0, 10);
		
		states.addState(practiceState1);
		states.addState(practiceState2);
		
		//send these states to the Observer which will manipulate data through the 
		//specific behaviors and update them. 
		//which will display them with the VoteDisplay class's display method. 
		//
		
		
		PracticeDisplay practiceDisplay = new PracticeDisplay(states);
		*/
	}

}
