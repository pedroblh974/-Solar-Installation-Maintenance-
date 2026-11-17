private class ReturnCheck {
    private String id;
    private String inteventionId;
    private String checkDate;
    private String checher;
    private String result;
    private boolean newReadingId;
    private String comment;

    public ReturnCheck(String name, String id, String inteventionId, String checkDate, String checher, String result, boolean newReadingId, String comment) {
        this.id = id;
        this.inteventionId = inteventionId;
        this.checkDate = checkDate;
        this.checher = checher;
        this.result = result;
        this.newReadingId = newReadingId;
        this.comment = comment;
    }
    public void getid() {
        return id;
    }
    public void getinteventionId() {
        return inteventionId;
    }
    public void getcheckDate() {
        return checkDate;
    }
    public void getchecher() {
        return checher;
    }
    public void getresult() {
        return result;
    }
    public void getnewReadingId() {
        return newReadingId;
    }

    public void getcomment() {
        return comment;
    }
    
}
