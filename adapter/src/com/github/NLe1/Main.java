package com.github.NLe1;

public class Main {
    public static void main(String[] args) {
        NormalSocket normalSocket = new NormalSocket();
        SpecialSocket specialSocket = new SpecialSocket();

        //performing task on normal socket
        performTask(normalSocket);

        //creating adapter to perform task
        SpecialSocketAdapter adapter = new SpecialSocketAdapter(specialSocket);
        performTask(adapter);
    }

    public static void performTask(NormalSocket socket){
        socket.performTask();
    }
}
