package com.in28minutes.java.oops.cohesion.problem;
import com.in28minutes.java.oops.inheritance.Boy;

//Cohesion is a measure of how related the responsibilities of a class are.
//This class is downloading from internet, parsing data and storing data to database.
//The responsibilities of this class are not really related. This is not cohesive class.
class DownloadAndStore {
	void downloadFromInternet() {
		Boy boy = new Boy(2);
		
	}

	void parseData() {

	}

	void storeIntoDatabase() {

	}

	void doEverything() {
		downloadFromInternet();
		parseData();
		storeIntoDatabase();
	}
}

public class CohesionExampleProblem {

}
