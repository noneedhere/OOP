/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dasar;
/**
 *
 * @author Asus
 */
public class Game {
    public static void main(String[] args){

        // membuat objek player
        Player hero = new Player();
        Player enemy = new Player();

        // mengisi atribut player
        hero.name = "hero";
        hero.speedHero = 78;
        hero.hpHero = 100;
        hero.armorHero = 15;
        hero.damageHero = 47;
        
        enemy.name = "enemy";
        enemy.speedEnemy = 75;
        enemy.hpEnemy = 100;
        enemy.armorEnemy = 13;
        enemy.damageEnemy = 44 ;

        // menjalankan method
        hero.runHero();
        System.out.println("");
        enemy.runEnemy();

        System.out.println("");
        
        System.out.println("-------{Fighting time}------- ");
        System.out.println("");
        
        hero.attack();
        enemy.hpEnemy = enemy.hpEnemy-(hero.damageHero - enemy.armorEnemy);
        System.out.println("Enemy defense : "+enemy.armorEnemy);
        System.out.println("Hp Enemy : "+enemy.hpEnemy);
        System.out.println("");
        
        hero.defense();
        System.out.println("Enemy damage : "+enemy.damageEnemy);
        hero.hpHero = hero.hpHero-(enemy.damageEnemy - hero.armorHero);
        System.out.println("Hero defense : "+hero.armorHero);
        System.out.println("Hp Hero : "+hero.hpHero);
        System.out.println("");
        
        if(hero.isDead()){
            System.out.println("Game Over!");
        }

    }
}
