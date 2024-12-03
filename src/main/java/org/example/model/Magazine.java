package org.example.model;

public final class Magazine extends LibraryItem{
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
        return "Title : "+getTitle()+
                ", Numéro : "+issueNumber+
                ", Année : "+getPublicationYear();
    }
}
