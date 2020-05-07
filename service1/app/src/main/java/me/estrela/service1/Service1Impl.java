package me.estrela.service1;

import me.estrela.service1.api.Service1;
import me.estrela.service2.api.Service2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service1Impl implements Service1 {

    @Autowired
    private Service2 service2;

    @Override
    public void doStuff(String param) {
        System.out.println(service2.doSomeStuff(param));
    }

}
