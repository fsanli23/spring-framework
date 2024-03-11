package com.cydeo.proxy;

import com.cydeo.model.Comment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CommentPsuhNotificationsProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending Sending Push notifications comment :" + comment.getText());
    }
}
