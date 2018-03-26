package com.example.james.powerstripapp;

/**
 * Created by James on 3/26/2018.
 */

public interface Command<T> {
    void execute(T data);
}