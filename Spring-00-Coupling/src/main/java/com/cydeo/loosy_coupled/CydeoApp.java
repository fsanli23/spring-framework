package com.cydeo.loosy_coupled;

public class CydeoApp {

    public static void main(String[] args) {


        FullTimeMentor fulltimer = new FullTimeMentor();

        MentorAccount mentor = new MentorAccount(fulltimer);

        PartTimeMentor partTimer = new PartTimeMentor();
        MentorAccount mentor2 = new MentorAccount(partTimer);

        mentor.manageAccount();
        mentor2.manageAccount();


    }


}
