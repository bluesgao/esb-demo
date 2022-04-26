package com.bluesgao.esb.controller;

import com.bluesgao.esb.service.SendService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TestController {
    @Autowired
    SendService sendService;

    @GetMapping("/p2p")
    public void p2p() {
        log.info("p2p");
        sendService.send();
    }

    @GetMapping("/ps")
    public void ps() {
        log.info("ps");
        sendService.publish();
    }
}
