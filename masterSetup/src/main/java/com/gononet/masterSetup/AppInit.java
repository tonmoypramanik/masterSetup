package com.gononet.masterSetup;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 *
 * @author sarker
 */

@PropertySource(value = "classpath:application.properties")
@Component
public class AppInit implements ApplicationRunner{
    
    @Override
    public void run(ApplicationArguments aa) {
    }
    
}
