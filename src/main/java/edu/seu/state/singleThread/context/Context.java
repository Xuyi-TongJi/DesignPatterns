package edu.seu.state.singleThread.context;

import edu.seu.state.singleThread.state.State;

public interface Context {
    void setState(String stateName);
    State getCurrentState();
}