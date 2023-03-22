package com.nbs.config;

// returns instance of FrameworkConfig

public final class ConfigFactory { 

    private ConfigFactory(){}; 

    public static FrameworkConfig getConfig(){

        return org.aeonbits.owner.ConfigFactory.create(FrameworkConfig.class);
    }
}
