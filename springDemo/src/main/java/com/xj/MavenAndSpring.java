package com.xj;

public class MavenAndSpring {
    private String content;
    public String getContent(){
        return content;
    }
    public void setContent(String content){
        this.content = content;
    }
    public void hello(){
        System.out.println("hello !! "+content);
    }
}
