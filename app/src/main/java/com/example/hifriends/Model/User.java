package com.example.hifriends.Model;

public class User {

    private String id;
    private String username;
    private String fullname;
    private String imageurl;
    private String bio;

    public User(String id, String username, String fullname, String imageurl, String bio){
        this.id = id;
        this.username = username;
        this.fullname = fullname;
        this.imageurl = imageurl;
        this.bio = bio;
    }

    public User(){
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getFullname(){
        return fullname;
    }

    public void setFullname(String fullname){
        this.fullname = fullname;
    }

    public String getImageurl(){
        return "https://firebasestorage.googleapis.com/v0/b/hifriends-eaf92.appspot.com/o/placeholder.png?alt=media&token=65ec224b-fafe-4bb4-a4e3-566671f9cf2e";
    }

    public void setImageurl(String imageurl){
        this.imageurl = imageurl;
    }

    public String getBio(){
        return bio;
    }

    public void setBio(String bio){
        this.bio = bio;
    }

}
