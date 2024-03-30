package ar.edu.info.unlp.ejercicio1;

public class ReTwit implements Publication{
	private Twit originTweet;

    public ReTwit(Twit originTweet){
        this.originTweet = originTweet;

    }

    public Twit getOriginTweet(){
        return this.originTweet;
    }

    public void setOriginTweet(Twit originTweet){
        this.originTweet = originTweet;
    }

    public String getText() {
        return this.getOriginTweet().getText();        
    }

    public void delete() {
        this.originTweet = null;
    }
}
