package com.stariq;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    private static List<Player> players = new ArrayList<Player>();
    private static List<Monster> monsters = new ArrayList<Monster>();
    private static Player player;
    private static Monster monster;

    public Game() {
        initialise();
        start();
    }

    public static void initialise(){
        System.out.println("\n***THE INDESTRUCTIBLE GAME***\n");
        System.out.print("Please type your name to begin: ");
        String name = scanner.nextLine();
        addPlayer(name);
        addMonster();
    }

    public static void start() {

        createFighters();
        printFighters();
        printAction();

        boolean isPlaying = true;
        while (isPlaying && player.isAlive() && monster.isAlive()) {

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    player.doWeakAttack(monster);
                    monster.doWeakAttack(player);

                    System.out.println(player.getName() + " gave WEAK damage of " + player.getWeakAttack());
                    System.out.println(monster.getName() + " responded with WEAK damage of " + monster.getWeakAttack());

                    printFighters();

                    break;
                case 2:
                    if (player.doStrongAttack(monster)) {
                        monster.doStrongAttack(player);

                        System.out.println(player.getName() + " gave STRONG damage of " + player.getStrongAttack());
                        System.out.println(monster.getName() + " responded with STRONG damage of " + monster.getStrongAttack());

                        printFighters();

                    } else {
                        System.out.println("CONDITION: Weak Attacks need to be used twice before Strong Attacks can be used");
                    }

                    break;
                case 3:
                    System.out.println("NEXT");

                    createFighters();
                    printFighters();

                    break;
                case 4:
                    System.out.println("EXIT");
                    isPlaying = false;
                    break;
                default:
                    System.out.println("Please pick from the options given");
                    break;
            }
            printAction();
        }
        defeatedFighter();
    }

    public static void defeatedFighter(){
        if (!player.isAlive()) {
            System.out.println("\nYou lost: " + monster.getName() + " defeated " + player.getName());
        }
        if (!monster.isAlive()) {
            System.out.println("\nYou won: " + player.getName() + " defeated " + monster.getName());
        }
    }

    public static void createFighters(){

        player = players.get(random.nextInt(players.size()));
        monster = monsters.get(random.nextInt(monsters.size()));

        System.out.println("\n******\n");
        System.out.println(player.getName() + " vs " + monster.getName());
    }

    public static void printFighters(){

        System.out.println(player.toString());
        System.out.println(monster.toString());
    }

    public static void printAction(){

        System.out.println("\nChoose your action: ");
        System.out.println("\t1: Weak Attack");
        System.out.println("\t2: Strong Attack");
        System.out.println("\t3: Next Monster");
        System.out.println("\t4: Exit Game");
    }

    public static void addPlayer(String name){

        Player player1 = new Player(name,100,random.nextInt(10));
        Player player2 = new Player(name,120,random.nextInt(25));
        Player player3 = new Player(name,130, random.nextInt(15));
        Player player4 = new Player(name,115,random.nextInt(20));
        Player player5 = new Player(name, 135,random.nextInt(30));

        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);
    }

    public static void addMonster(){

        Monster vampire = new Monster("Vampire", 120, random.nextInt(10));
        Monster werewolf = new Monster("Werewolf", 100, random.nextInt(30));
        Monster ghoul = new Monster("Ghoul", 200, random.nextInt(10));
        Monster zombie = new Monster("Zombie", 180, random.nextInt(5));
        Monster reaper = new Monster("Reaper", 80, random.nextInt(50));

        monsters.add(vampire);
        monsters.add(werewolf);
        monsters.add(ghoul);
        monsters.add(zombie);
        monsters.add(reaper);
    }
}
