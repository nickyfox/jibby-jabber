package com.jibbyjabber.model.dto.message;

import com.jibbyjabber.model.dto.user.UserWithUsername;

import java.util.List;

public class ChatWithUsernamesReduced {
    long chatId;
    UserWithUsername user1;
    UserWithUsername user2;

    public ChatWithUsernamesReduced(long chatId, UserWithUsername user1, UserWithUsername user2) {
        this.chatId = chatId;
        this.user1 = user1;
        this.user2 = user2;
    }

    public ChatWithUsernamesReduced() {
    }

    public long getChatId() {
        return chatId;
    }

    public void setChatId(long chatId) {
        this.chatId = chatId;
    }

    public UserWithUsername getUser1() {
        return user1;
    }

    public void setUser1(UserWithUsername user1) {
        this.user1 = user1;
    }

    public UserWithUsername getUser2() {
        return user2;
    }

    public void setUser2(UserWithUsername user2) {
        this.user2 = user2;
    }

}
