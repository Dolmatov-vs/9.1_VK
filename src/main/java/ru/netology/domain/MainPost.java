package ru.netology.domain;

public class MainPost {
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
