package itsol.internship.model;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
public class News {
    private long newsId;
    private String newsCode;
    private String title;
    private String contentNews;
    private String imgCode;
    private boolean status;
    private Time createdDate;
    private Time updatedDate;
    private Time fromDate;
    private Time toDate;

    @Basic
    @GeneratedValue
    @Column(name = "NEWS_ID")
    public long getNewsId() {
        return newsId;
    }

    public void setNewsId(long newsId) {
        this.newsId = newsId;
    }

    @Id
    @Column(name = "NEWS_CODE")
    public String getNewsCode() {
        return newsCode;
    }

    public void setNewsCode(String newsCode) {
        this.newsCode = newsCode;
    }

    @Basic
    @Column(name = "TITLE")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "CONTENT_NEWS")
    public String getContentNews() {
        return contentNews;
    }

    public void setContentNews(String contentNews) {
        this.contentNews = contentNews;
    }

    @Basic
    @Column(name = "IMG_CODE")
    public String getImgCode() {
        return imgCode;
    }

    public void setImgCode(String imgCode) {
        this.imgCode = imgCode;
    }

    @Basic
    @Column(name = "STATUS")
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Basic
    @Column(name = "CREATED_DATE")
    public Time getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Time createdDate) {
        this.createdDate = createdDate;
    }

    @Basic
    @Column(name = "UPDATED_DATE")
    public Time getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Time updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Basic
    @Column(name = "FROM_DATE")
    public Time getFromDate() {
        return fromDate;
    }

    public void setFromDate(Time fromDate) {
        this.fromDate = fromDate;
    }

    @Basic
    @Column(name = "TO_DATE")
    public Time getToDate() {
        return toDate;
    }

    public void setToDate(Time toDate) {
        this.toDate = toDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return newsId == news.newsId &&
                status == news.status &&
                Objects.equals(newsCode, news.newsCode) &&
                Objects.equals(title, news.title) &&
                Objects.equals(contentNews, news.contentNews) &&
                Objects.equals(imgCode, news.imgCode) &&
                Objects.equals(createdDate, news.createdDate) &&
                Objects.equals(updatedDate, news.updatedDate) &&
                Objects.equals(fromDate, news.fromDate) &&
                Objects.equals(toDate, news.toDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(newsId, newsCode, title, contentNews, imgCode, status, createdDate, updatedDate, fromDate, toDate);
    }
}
