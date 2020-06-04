package ru.netology.manager;

import ru.netology.domain.CommentManager;
import ru.netology.domain.LikeManager;
import ru.netology.domain.Post;
import ru.netology.domain.RepostManager;

public class ManagerPost {
    Post post = new Post();


    public String LikeGenerateBlock() {
        LikeManager likeManager = new LikeManager();
        likeManager.generateBlock();
        // add logic
        return null;
    }

    public String CommentGenerateBlock() {
        CommentManager commentManager = new CommentManager();
        commentManager.generateBlock();
        // add logic
        return null;
    }

    public String RepostGenerateBlock() {
        RepostManager repostManager = new RepostManager();
        repostManager.generateBlock();
        // add logic
        return null;
    }

}
