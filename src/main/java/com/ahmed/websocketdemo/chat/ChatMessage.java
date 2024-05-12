package com.ahmed.websocketdemo.chat;

import lombok.Builder;

@Builder
public record ChatMessage(
        String content,
        String sender,
        MessageType type
) {
}
