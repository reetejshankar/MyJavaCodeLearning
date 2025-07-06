package AdvanceJava.Concurrency;

import java.util.concurrent.Executor;

class Caller implements Executor {

    @Override
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
