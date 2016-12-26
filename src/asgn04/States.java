package asgn04;

import java.util.Observable;

public class States extends Observable{

	//an array of states that can be used from the 
	//main program to hold data for different states
	//Also used to send all states to the observers for manipulation
	//which will use the states with the behaviors
	
	public VotingData[] states;
	public int index;
	
	public States(){
		states = new VotingData[5];
		index = 0;
	}
	
	public void addState(VotingData state){
		states[index] = state;
		index++;
	}
	
	public VotingData[] getStates(){
		return states;
	}
}
