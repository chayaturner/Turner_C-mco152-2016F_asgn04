package asgn04;

public class Program {

	public static void main(String[] args) {
		VotingData votingData = new VotingData();
		CurrentElectionDisplay display1 = new CurrentElectionDisplay(votingData);
		
		votingData.setVotes(100000,  200000, 15);
		votingData.setVotes(30000,  20000, 5);
	}

}
