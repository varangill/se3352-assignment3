package models;

public class Comment {
    private String commentNumber;
    private String content;
    private String date;
    private Student author;
    private Page page; //what page the comment is on

    public Comment(String num, String date, Student author, Page page) {
        this.commentNumber = num;
        this.date = date;
        this.author = author;
        this.page = page;
        content = "";
    }

    //getters and setters
    public String getCommentNumber() {
        return commentNumber;
    }

    public void setCommentNumber(String commentNumber) {
        this.commentNumber = commentNumber;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Student getAuthor() {
        return author;
    }

    public void setAuthor(Student author) {
        this.author = author;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
}
