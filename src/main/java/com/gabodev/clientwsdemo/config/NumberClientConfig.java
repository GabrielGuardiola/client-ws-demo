package com.gabodev.clientwsdemo.config;

import com.gabodev.clientwsdemo.numberClient.NumberClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
@Configuration
public class NumberClientConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.gabodev.clientwsdemo.ws.client");
        return marshaller;
    }

    @Bean
    public NumberClient numberClient(Jaxb2Marshaller marshaller) {
        NumberClient client = new NumberClient();
        client.setDefaultUri("https://www.dataaccess.com/webservicesserver/NumberConversion.wso");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
