package LibraryManagementSystem.Entities;

import java.util.Date;

public class Book {
    private Integer UIN;
    private Date issueDate;
    private Boolean isIssued;
    private Integer rackId;
    private BookDetails detail;
    private Member assignee;

    public Book(Integer UIN, Date issueDate, Boolean isIssued, Integer rackId, BookDetails detail) {
        this.UIN = UIN;
        this.detail = detail;
        this.issueDate = issueDate;
        this.isIssued = isIssued;
        this.rackId = rackId;
    }

    Boolean hasSameTitle(String title) {
        return this.detail.hasSameTitle(title);
    }

    public void issue(Member member) {
        this.isIssued = true;
        this.issueDate = new Date();
        this.assignee = member;
    }
}
