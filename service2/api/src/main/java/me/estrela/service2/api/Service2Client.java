package me.estrela.service2.api;

public class Service2Client implements Service2 {

    @Override
    public String doSomeStuff(String param) {
        return "result " + param;
    }

}
