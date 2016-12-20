package asgn04;

public class Program {

	public static void main(String[] args) {
		
		VotingData[] states = new VotingData[5];
		
		VotingData state1 = new VotingData();
		VotingData state2 = new VotingData();
		VotingData state3 = new VotingData();
		VotingData state4 = new VotingData();
		VotingData state5 = new VotingData();
		
		states[0] = state1;
		states[1] = state2;
		states[2] = state3;
		states[3] = state4; 
		states[4] = state5;
		
		
		//display election results using the 5 observers 
		state1.setVotes(100000,  200000, 5);
		state2.setVotes(100000,  200000, 10);
		state3.setVotes(100000,  200000, 15);		
		state4.setVotes(100000,  200000, 20);
		state5.setVotes(100000,  200000, 25);
		
		FavorRepublicanDisplay repDisplay = new FavorRepublicanDisplay(states);
		FavorDemocraticDisplay demDisplay = new FavorDemocraticDisplay(states);
		DemocraticPopRepublicanElecDisplay demPopRepElecDisplay = new DemocraticPopRepublicanElecDisplay(states);
		HonestElecFavorDemocraticPopDisplay honestElecFavorDemPopDisplay = new HonestElecFavorDemocraticPopDisplay(states);
		HonestDisplay honestDisplay = new HonestDisplay(states);
	}

}
