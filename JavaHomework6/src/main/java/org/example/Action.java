package org.example;

import org.example.barrier.Barrier;
import org.example.barrier.RunWay;
import org.example.barrier.Wall;
import org.example.entity.Participant;

public class Action {

    public void masAction(Participant[] participants, Barrier[] barriers){
        String resultOfOvercome;
        for (Participant participant : participants) {

            boolean barriersEnd = true;

            for (Barrier barrier : barriers) {

                resultOfOvercome = action(participant, barrier);

                if (resultOfOvercome.contains("не подолала")) {
                    break;
                }
            }
            if (barriersEnd) {
                System.out.println("\n*** Action end ***\n");
            }
        }
    }

    public String action(Participant participants, Barrier barrier){

        String result = null;

        if(barrier instanceof Wall) {
            System.out.println(participants.getInfo()+" "+ participants.jump());
            if (((Wall) barrier).getHeight() < participants.getJumpHeight()){
                result = participants.getInfo()+" "+ barrier.overcome();
            } else {
                result = participants.getInfo()+" "+barrier.notOvercome();
            }
            System.out.println(result);
        }

        if(barrier instanceof RunWay) {
            System.out.println(participants.getInfo()+" "+ participants.run());
            if (((RunWay) barrier).getDistance() < participants.getEndurance()){
                result = participants.getInfo()+" "+ barrier.overcome();
            } else {
                result = participants.getInfo()+" "+barrier.notOvercome();
            }
            System.out.println(result);
        }
        return result;
    }
}
