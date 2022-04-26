package com.bluesgao.esb.service.impl;

import com.bluesgao.esb.dto.Message;
import com.bluesgao.esb.service.ReceiveService;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ReceiveServiceImpl implements ReceiveService {

    @Override
    @ServiceActivator(inputChannel = "directChannel")
    public void process(Message message) {
        log.info("process called [{}]", message);
    }

    @Override
    @ServiceActivator(inputChannel = "psChannel")
    public void b(Message message) {
        log.info("b called [{}]", message);
    }

    @Override
    @ServiceActivator(inputChannel = "psChannel")
    public void a(Message message) {
        log.info("a called [{}]", message);
    }
}
