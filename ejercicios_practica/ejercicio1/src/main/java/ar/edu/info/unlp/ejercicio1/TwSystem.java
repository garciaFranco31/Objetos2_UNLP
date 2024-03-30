package ar.edu.info.unlp.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class TwSystem {
	private List<User> users;

    public TwSystem(){
        this.users = new ArrayList<User>();
    }

    public List<User> getUsers(){
        return new ArrayList<User>(this.users);
    }

    public User getUser(String screenName){
        return this.users.stream().filter(user -> user.getScreenName().equals(screenName)).findFirst().orElse(null);
    }

    public void addUser(User user){
        this.users.add(user);
    }

    public User createUser(String screenName){
        User user = null;

        if (nameDoesNotExist(screenName) == null){
            user = new User(screenName);
            this.addUser(user);
        }

        return user;
    }

    private User nameDoesNotExist(String screenName){
        return this.users.stream().filter(user -> user.getScreenName().equals(screenName)).findFirst().orElse(null);
    }

    public Publication postTweet(User user, String text){
        return user.createPublication(text);
    }

    public Publication postReTweet(User user, Twit originTweet){
        return user.createReTweet(originTweet);
    }

    public void deleteUser(User user){
        user.deletePublication();
        this.users.remove(user);
    }
}
