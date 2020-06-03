package com.github.NLe1;

public class SpecialSocketAdapter extends NormalSocket{
    private SpecialSocket socket;
    public SpecialSocketAdapter(SpecialSocket socket) {
        this.socket = socket;
    }

    //adapt normal task from NormalSocket instance to perform special task from SpecialSocket instance
    @Override
    public void performTask() {
        socket.performSpecialTask();
    }
}
