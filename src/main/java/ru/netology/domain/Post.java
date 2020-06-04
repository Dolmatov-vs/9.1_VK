package ru.netology.domain;

public class Post {
    private int postId;
    private int ownerId;
    private int dateAndTime;
    private String text;
    private String domain;
    private String query;
    private int ownersOnly;
    private int count;
    private int offset;

    private String comment;
    private int commentatorId;
    private int commentCount;

    private String countRepost;
    private int userRepost;


    private int countlike;
    private int userLike;
    private boolean trueLike;

    public int getPostId() {

        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;

    }

    public int getOwnerId() {

        return ownerId;
    }

    public void setOwnerId(int ownerId) {

        this.ownerId = ownerId;
    }

    public int getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(int dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getCommentatorId() {
        return commentatorId;
    }

    public void setCommentatorId(int commentatorId) {
        this.commentatorId = commentatorId;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public String getCountRepost() {
        return countRepost;
    }

    public void setCountRepost(String countRepost) {
        this.countRepost = countRepost;
    }

    public int getUserRepost() {
        return userRepost;
    }

    public void setUserRepost(int userRepost) {
        this.userRepost = userRepost;
    }

    public int getCountlike() {
        return countlike;
    }

    public void setCountlike(int countlike) {
        this.countlike = countlike;
    }

    public int getUserLike() {
        return userLike;
    }

    public void setUserLike(int userLike) {
        this.userLike = userLike;
    }

    public boolean isTrueLike() {
        return trueLike;
    }

    public void setTrueLike(boolean trueLike) {
        this.trueLike = trueLike;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public int getOwnersOnly() {
        return ownersOnly;
    }

    public void setOwnersOnly(int ownersOnly) {
        this.ownersOnly = ownersOnly;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}