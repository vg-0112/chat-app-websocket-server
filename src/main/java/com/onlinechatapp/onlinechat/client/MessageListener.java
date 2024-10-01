package com.onlinechatapp.onlinechat.client;

import com.onlinechatapp.onlinechat.Message;
import java.util.ArrayList;

public interface MessageListener {
    void onMessageRecieve(Message message);
    void onActiveUsersUpdated(ArrayList<String> users);
}
