package com.kodilla.patterns.strategy.social.publishers;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class SnapChatPublisher implements SocialPublisher {
    @Override
    public String share(String text) {
        return text + "\n Snapchat from iphone.";
    }
}
