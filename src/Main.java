import java.util.Vector;
import java.util.Scanner;

class Hero
{
    String HeroName;
    String HeroAbilityName;
    int HeroHP;
    int HeroDamage;
    int HeroMaxUlt;
    int HeroMinUlt = 0;
    Hero()
    {
        HeroName = "None";
        HeroAbilityName = "None";
        HeroHP = 0;
        HeroDamage = 0;
        HeroMaxUlt = 0;
    }
    Hero(String sHeroName, String sHeroAbilityName, int sHeroHP, int sHeroDamage, int sHeroMaxUlt)
    {
        HeroName = sHeroName;
        HeroAbilityName = sHeroAbilityName;
        HeroHP = sHeroHP;
        HeroDamage = sHeroDamage;
        HeroMaxUlt = sHeroMaxUlt;
    }
    void HeroInfo()
    {
        System.out.println("HeroName: " + HeroName);
        System.out.println("HeroAbilityName: " + HeroAbilityName);
        System.out.println("HeroHP: " + HeroHP);
        System.out.println("HeroDamage: " + HeroDamage);
        System.out.println("HeroMaxUlt: " + HeroMaxUlt);
        System.out.println("HeroMinUlt: " + HeroMinUlt);
    }
}

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Select your hero: ");
        Vector<Hero> AllHeroes = new Vector<>();
        int enter = in.nextInt();
    }
}