package models;

import java.util.ArrayList;

public class RevisionHistory {
    private Page page;

    //contents and times will be directly linked by index, such that contents[i] was written at times[i] time
    private ArrayList<String> contents;
    private ArrayList<String> times;

    public RevisionHistory(Page newPage) {
        this.page = newPage;
        contents = new ArrayList<String>();
        times = new ArrayList<String>();
    }

    public void makeChange(String content, String time) { //when a new revision is added, add both the content and time at the same time
        this.contents.add(content);
        this.times.add(time);
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public ArrayList<String> getContents() {
        return contents;
    }

    public void setContents(ArrayList<String> contents) {
        this.contents = contents;
    }

    public ArrayList<String> getTimes() {
        return times;
    }

    public void setTimes(ArrayList<String> times) {
        this.times = times;
    }
}
