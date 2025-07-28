import java.util.ArrayList;

public class GameMaster {
    public static void main(String[] args) {
        Hero h = new Hero("勇者",100,"剣");
        Wizard w = new Wizard("魔法使い",60,20);
        Thief t = new Thief("盗賊",70);
        ArrayList<Character> party = new ArrayList<>();
        party.add(h);
        party.add(w);
        party.add(t);

        Matango m = new Matango('A',45);
        Goblin g = new Goblin('A',50);
        Slime s = new Slime('A',40);
        ArrayList<Monster> monsters = new ArrayList<>();
        monsters.add(m);
        monsters.add(g);
        monsters.add(s);
        System.out.println("---味方パーティー---");
        for(Character c : party) {
            c.showStatus();
        }

        System.out.println("---敵グループ---");
        for(Monster z : monsters) {
            m.showStatus();
        }

        System.out.println();
        System.out.println("味方の総攻撃！");
        for(Character c : party) {
            for(Monster z : monsters) {
                c.attack(z);
            }
        }

        System.out.println();
        System.out.println("敵の総攻撃！");
        for(Monster z : monsters) {
            for(Character c : party) {
                z.attack(c);
            }
        }

        System.out.println();
        System.out.println("ダメージを受けた勇者が突然光りだした");
        SuperHero sh = new SuperHero(h);
        party.set(party.indexOf(h), sh);
        System.out.println("勇者はスーパーヒーローに進化した！");
        for(Monster z : monsters) {
            sh.attack(m);
        }

        System.out.println();
        System.out.println("---味方パーティー最終ステータス---");
        for(Character c : party) {
            c.showStatus();
            if(c.isAlive()) {
                System.out.println("生存状況: 生存");
            }else{
                System.out.println("生存状況: 死亡");
            }
        }
        System.out.println();
        System.out.println("---敵グループ最終ステータス");
        for(Monster z : monsters) {
            m.showStatus();
            if(z.isAlive()) {
                System.out.println("");}
        }
    }
}