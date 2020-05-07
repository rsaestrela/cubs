package me.estrela.service2;

import me.estrela.service2.api.Service2;
import org.springframework.stereotype.Component;

@Component
public class Service2Impl implements Service2 {

    @Override
    public String doSomeStuff(String param) {
        System.out.println("Doing some more stuff with " + param);
        return "";
    }

}
