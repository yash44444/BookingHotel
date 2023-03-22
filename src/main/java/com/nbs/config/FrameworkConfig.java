package com.nbs.config;

import org.aeonbits.owner.Config;

@Config.Sources(value="file:${user.dir}/src/test/resources/config/config.properties")
public interface FrameworkConfig extends Config {

    String url();
    String browser();
    String destination();
    String firstName();
    String lastName();
    String email();
    String address(); 
    String city();
    String phone();
    long timeout();

}
