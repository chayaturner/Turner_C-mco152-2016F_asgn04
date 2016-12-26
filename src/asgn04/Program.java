package asgn04;

public class Program {

	public static void main(String[] args) {
		
		VotingData states = new VotingData();		
		PracticeDisplay practiceDisplay = new PracticeDisplay(states);
		HonestDisplay honestDisplay = new HonestDisplay(states);
		
		//Other displays which will send a separate message when the votes update:
		/*
		Display display = new Display(states);
		Display display = new Display(states);
		Display display = new Display(states);
		Display display = new Display(states);
		Display display = new Display(states);
		*/
		
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
		
		//set the votes
		states.setVotes(demVotes, repVotes, elecDemVotes, elecRepVotes);
		
		//Change the votes and set them again
		//displays will automatically resend their updated messages
	
		//STATE 1
		demVotes[0] = 40000;
		repVotes[0] = 10000;
		elecDemVotes[0] = 0;
		elecRepVotes[0] = 15;
		
		//STATE 2
		demVotes[1] = 20000;
		repVotes[1] = 1000000;
		elecDemVotes[1] = 10;
		elecRepVotes[1] = 0;
		states.setVotes(demVotes, repVotes, elecDemVotes, elecRepVotes);
	}

}
