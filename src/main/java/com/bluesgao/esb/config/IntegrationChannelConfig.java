package com.bluesgao.esb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.channel.PublishSubscribeChannel;
import org.springframework.messaging.MessageChannel;

@Configuration
public class IntegrationChannelConfig {

    @Bean
    public MessageChannel directChannel() {
        return new DirectChannel();
    }

    @Bean
    public PublishSubscribeChannel psChannel() {
        return new PublishSubscribeChannel();
    }
}
