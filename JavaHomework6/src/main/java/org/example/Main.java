package org.example;

import org.example.barrier.Barrier;
import org.example.barrier.RunWay;
import org.example.barrier.Wall;
import org.example.entity.Cat;
import org.example.entity.Human;
import org.example.entity.Participant;
import org.example.entity.Robot;

public class Main {
    public static void main(String[] args) {

        Human human1 = new Human("Влад", 1000, 0.5);
        Human human2 = new Human("Макс", 2000, 2);
        Human human3 = new Human("Диана", 100, 1);
        Cat cat = new Cat("Матрос", 200, 1);
        Robot robot = new Robot("Аліса", 5000, 3);


        Wall wall= new Wall("лавка", 0.25);
        RunWay runWay = new RunWay("шоссе", 100);
        Wall wall2= new Wall("забор", 0.9);
        RunWay runWay2 = new RunWay("пляж", 200);

        Participant [] participants = {human1, human2, human3, cat, robot};
        Barrier [] barriers = {wall, runWay, wall2, runWay2};

        Action action = new Action();
        action.masAction(participants, barriers);
    }
}