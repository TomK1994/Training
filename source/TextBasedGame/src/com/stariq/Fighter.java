package com.stariq;

import java.util.Random;

// Superclass to Player and Monster
public class Fighter {

    private String name;
    private int health;
    private boolean isAlive;
    private int weakAttack;
    private int strongAttack;
    private int weakCounter;

    public Fighter(String name, int health, int weakAttack) {
        this.name = name;
        this.health = health;
        this.weakAttack = weakAttack + 5;
        this.strongAttack = this.weakAttack + new Random().nextInt(20);
        if(health > 0){
            isAlive = true;
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public int getWeakAttack() {
        return weakAttack;
    }

    public int getStrongAttack(){
        return strongAttack;
    }

    // Works out the damage a fighter would take under attack.
    // Sets the health to 0 if it becomes negative.
    private void damage(int attack){
        int newHealth = health - attack;
        health = Math.max(newHealth, 0);
        if(health == 0){
            isAlive = false;
        }
    }

    // Works out the damage caused by a weak attack.
    // Increases the counter each time it is used.
    public void doWeakAttack(Fighter fighter){
        fighter.damage(weakAttack);
        weakCounter++;
    }

    // Works out the damage caused by a strong attack.
    // Can only execute if weak attack has been used at least twice.
    // Sets the counter to 0 as regeneration process for the attack.
    public boolean doStrongAttack(Fighter fighter){
        boolean isValid = weakCounter > 1;
        if(isValid) {
            fighter.damage(strongAttack);
            weakCounter = 0;
        }
        return isValid;
    }

    // Outputs details about the fighter.
    @Override
    public String toString() {
        return getName().toUpperCase() + ":\n" +
                "\tHealth: " + getHealth() +
                "\tWeak Attack: " + getWeakAttack() +
                "\tStrong Attack: " + getStrongAttack();
    }
}
