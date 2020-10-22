package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.SnapChatPublisher;

public class ZGeneration extends User{
    public ZGeneration(String name) {
        super(name);
        this.socialPublisher = new SnapChatPublisher();
    }
}
