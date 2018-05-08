package com.pineda89;

/**
 * Created by pineda89 on 3/5/18.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}