package com.bluesgao.esb.service;

import com.bluesgao.esb.dto.Message;

public interface ReceiveService {
    void a(Message message);

    void b(Message message);

    void process(Message message);
}
