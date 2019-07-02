public class Name extends Resume{

    private String name;
    private String referenceNames;
    private String miscFirstName;
    private String miscLastName;


        public void Name(){








    }

    public Name(){};

    public Name(String name){
        this.name = name;
    }

    public Name(String name, String referenceNames, String miscFirstName, String miscLastName) {
        this.name = name;
        this.referenceNames = referenceNames;
        this.miscFirstName = miscFirstName;
        this.miscLastName = miscLastName;
    }

    private void NameInput(String name, String reference, String miscFirstName, String miscLastName){

    }





    public String NameToUC(){
        return name.toUpperCase();
    }

    public String NameToLC(){
        return name.toLowerCase();
    }



    @Override
    public String toString(){
        return name;
    }



//    public void initializerName(){
//        Name name = new Name(){};
//    }






    /********************************getters/setters********************************************/



//
//    public String getName() {
//        return name;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReferenceNames() {
        return referenceNames;
    }

    public void setReferenceNames(String referenceNames) {
        this.referenceNames = referenceNames;
    }

    public String getMiscFirstName() {
        return miscFirstName;
    }

    public void setMiscFirstName(String miscFirstName) {
        this.miscFirstName = miscFirstName;
    }

    public String getMiscLastName() {
        return miscLastName;
    }

    public void setMiscLastName(String miscLastName) {
        this.miscLastName = miscLastName;
    }
}
