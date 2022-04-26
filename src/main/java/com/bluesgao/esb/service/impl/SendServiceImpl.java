package com.bluesgao.esb.service.impl;

import com.bluesgao.esb.dto.Message;
import com.bluesgao.esb.service.SendService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SendServiceImpl implements SendService {

    @Autowired
    @Qualifier("directChannel")
    private MessageChannel directChannel;

    @Autowired
    @Qualifier("psChannel")
    private SubscribableChannel psChannel;

    @Override
    public void send() {
        log.info("in send method");
        Message msg = new Message();
        msg.setHeader("header");
        msg.setBody("body");
        directChannel.send(MessageBuilder.withPayload(msg).build());
    }

    @Override
    public void publish() {
        log.info("in publish method");
        Message msg = new Message();
        msg.setHeader("publish header");
        msg.setBody("publish body");
        psChannel.send(MessageBuilder.withPayload(msg).build());
    }
}
