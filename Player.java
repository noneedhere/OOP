/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dasar;

/**
 *
 * @author Asus
 */
public class Player {
    
    String name;
    int speedHero, hpHero, damageHero, armorHero; 
    int speedEnemy, hpEnemy, damageEnemy, armorEnemy;

    void runHero(){
        System.out.println(name +" is running...");
        System.out.println("Speed: "+ speedHero);
        System.out.println("Damage: "+ damageHero);
        System.out.println("Armor: "+ armorHero);
    }
    
    void runEnemy(){
        System.out.println(name +" is running...");
        System.out.println("Speed: "+ speedEnemy);
        System.out.println("Damage: "+ damageEnemy);
        System.out.println("Armor: "+ armorEnemy);
    }

    boolean isDead(){
        if(hpHero <= 0) return true;
        return false;
    }
    
    void attack(){
        System.out.println("======== You turn ! ========");
        System.out.println("");
        System.out.println("Hero attacking");
        System.out.println("Hero damage : "+damageHero);
    }
    
    void defense(){
        System.out.println("======= Enemy turn ! =======");
        System.out.println("");
        System.out.println("Enemy attacking");
    } 
    
}