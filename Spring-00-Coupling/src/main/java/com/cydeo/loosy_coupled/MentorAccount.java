package com.cydeo.loosy_coupled;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MentorAccount {

    Mentor mentor;

    public MentorAccount(Mentor mentor) {
        this.mentor = mentor;
    }


    public void manageAccount() {
        this.mentor.createAccount();
    }


}
