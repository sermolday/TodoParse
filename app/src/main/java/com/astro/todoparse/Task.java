package com.astro.todoparse;

import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseUser;

/**
 * Created by Sergio Mattioli on 08/04/2015.
 */
@ParseClassName("Task")
public class Task extends ParseObject {

    public Task(){
    }

    public boolean isCompleted(){
        return getBoolean("completed");
    }

    public void setCompleted(boolean complete){
        put("completed", complete);
    }

    public String getDescription(){
        return getString("description");
    }

    public void setDescription(String description){
        put("description", description);
    }

    public void setUser(ParseUser currentUser) {
        put("user", currentUser);
    }

}
