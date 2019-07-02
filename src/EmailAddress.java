public class EmailAddress{

    private String emailAddress;
    private String altEmailAddress;

    public EmailAddress(){}



    public EmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
        }

    public EmailAddress(String emailAddress, String altEmailAddress){
            this.emailAddress = emailAddress;
            this.altEmailAddress = altEmailAddress;
        }





        //MAY USE
//    public void initializerEmail(){
//        EmailAddress email = new EmailAddress(){};
//    }
//    public void initializerAltEmail(){
//        EmailAddress altEmail = new EmailAddress(){};
//
//    }





    /********************************getters/setters*******************************************/
    public String getAltEmailAddress() {
        return altEmailAddress;
    }

    public void setAltEmailAddress(String altEmailAddress) {
        this.altEmailAddress = altEmailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
