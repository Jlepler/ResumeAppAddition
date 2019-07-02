import java.util.*;

public class ResumeApp {


    public static void main(String[] args) {

        Scanner keyIn = new Scanner(System.in);
        String answerBeg;
        String answer;
        Boolean contResumeApp;
        Boolean contAddResume;


        System.out.println("Welcome.");


        /*********Test*******/
        //ADDING NAME
        Name myName = new Name();
        myName.setName(keyIn.nextLine());

        Resume myResume = new Resume(myName.getName(),null,null,null,null,null,null,null,null,null,null,null,null,null);

        System.out.println(myResume.toString());

        System.out.println("Add your name: ");
        //ADD REFERENCES
        System.out.println("Do you have any references? If so, please add a reference");
        answer = keyIn.nextLine();
        //Change this code to allow one variable of UserResponse to reuse
        UserResponse Knit = new UserResponse();
        if (Knit.answerTFPromptTwo(answer) == 1){ ;
            myName.setReferenceNames(keyIn.nextLine());
        }
        EmailAddress myEmail = new EmailAddress(){};
//        myEmail.setEmailAddress();



        /********Test*******/

        do
            {
            System.out.println("Would you like to add a new resume, or browse/update an existing resume?");
            answer = keyIn.nextLine();
            //This to use UserResponse class method
            UserResponse j = new UserResponse();

            if (j.answerTFPromptOne(answer) == 1){

            }

            if (contAddResume = true){}
                do{




                }while (contAddResume);






        } while (contResumeApp = true);

    }


    public void initializerName(){
        Name name = new Name(){};
    }
}
