package edu.seu.state.concurrent.context;

import edu.seu.state.concurrent.state.State;

public interface Context {

    State getCurrentState();
}
