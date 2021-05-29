package com.in28minutes.java.oops.cohesion.solution;


//This is a better way of approaching the problem. Different classes have their
//own responsibilities.

class InternetDownloader {
	public void downloadFromInternet() {
		System.out.println("Download From Internet");
	}
}

class DataParser {
	public void parseData(String content) {
		System.out.println("Parsing Data");
	}
}

class DatabaseStorer {
	public void storeIntoDatabase(String data) {
		System.out.println("Storing into Database");

	}
}

class DownloadAndStore {
	void doEverything() {
		InternetDownloader internetDownloader = new InternetDownloader();
		internetDownloader.downloadFromInternet();
		new DataParser().parseData("");
		new DatabaseStorer().storeIntoDatabase("");
	}
}

public class CohesionExampleSolution {
	public static void main(String args[]){
		DownloadAndStore downloadAndStore= new DownloadAndStore();
		downloadAndStore.doEverything();
	}
}
