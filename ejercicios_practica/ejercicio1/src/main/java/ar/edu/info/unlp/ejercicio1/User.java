package ar.edu.info.unlp.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class User {
	public String screenName;
	public List <Publication> publications;

	public User(String screenName){
		this.screenName = screenName;
		publications = new ArrayList<Publication>();
	}

	public String getScreenName(){
		return this.screenName;
	}

	public void setScreenName(String screenName){
		this.screenName = screenName;
	}

	//add a new publication in the list
	public void addPublication(Publication tweet){
		this.publications.add(tweet);
	}

	//create a new publication
	public Publication createPublication(String text){
		Publication publication = null;

		if (longValue(text)) {
			publication = new Twit(text);
			this.addPublication(publication);
		}
		return publication;
	}

	public Publication createReTweet(Twit originTweet){
		Publication reTweet = new ReTwit(originTweet);
		this.addPublication(reTweet);
		return reTweet;
	}

	//delete all publications from the user
	public void deletePublication(){
		this.publications.stream().forEach(publication -> publication.delete());
		this.publications.clear();
	}

	//show all the publications from a user
	public List<Publication> showAllPublications(){
		return new ArrayList<Publication>(this.publications);
	}

	public boolean longValue(String text){
		return ((text.length() >= 1) && (text.length()<=280));
	}
}
