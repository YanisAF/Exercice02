package org.example.model;

public class Magazine extends LibraryItem{
   private int issueNumber;

    public Magazine(int id, String title, int publicationYear, int issueNumber) {
        super(id, title, publicationYear);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public String getDetails(){
        return "Title : "+title+
                "Numéro : "+issueNumber+
                "Année "+publicationYear;
    }
}