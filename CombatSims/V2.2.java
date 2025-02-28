import java.util.*;
class CombatSims2X 
{
    String unitName, unitType;
    int unitAttack, unitArmour, unitHP, unitBonusAttack, unitBonusArmour, unitAttackCount, attackRate; 

    public void setUnitStats(String name, String type, int attack, int armour, int hp, int bonusAttack, int bonusArmour, int rate) 
    {
        this.unitName = name;
        this.unitType = type;
        this.unitAttack = attack;
        this.unitArmour = armour;
        this.unitHP = hp;
        this.unitBonusAttack = bonusAttack;
        this.unitBonusArmour = bonusArmour;
        this.unitAttackCount = 0;
        this.attackRate = rate;
    }

    public void unitChoice(Scanner sc) 
    {
        System.out.println("Choose a Unit");
        System.out.println("1. Knight");
        System.out.println("2. Pikeman");
        System.out.println("3. Swordsman");
        System.out.println("4. Light Cavalry");
        System.out.println("5. Camel Rider");
        System.out.print("Enter your choice: ");
    
        int choice = 0;
        while (true) {
            try {
                choice = sc.nextInt();
                System.out.println(" ");
                if (choice < 1 || choice > 5) {
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                sc.next(); 
            }
        }

        switch (choice) {
            case 1:
                setUnitStats("Knight", "Cavalry", 10, 2, 100, 0, 0, 1800);
                break;
            case 2:
                setUnitStats("Pikeman", "Infantry", 4, 0, 55, 22, 0, 3000);
                break;
            case 3:
                setUnitStats("Swordsman", "Infantry", 9, 1, 60, 0, 0, 2000);
                break;
            case 4:
                setUnitStats("Light Cavalry", "Cavalry", 7, 0, 60, 0, 0, 2000);
                break;
            case 5:
                setUnitStats("Camel Rider", "Camel", 6, 0, 100, 9, 4, 2000);
                break;
        }
    }


    public static void timeGap(int milliseconds) 
    {
        try 
        {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) 
        {
            System.out.println("Error during sleep: " + e.getMessage());
        }
    }

    public void attack(CombatSims2X target) 
    {
        System.out.println(this.unitName + " attacks " + target.unitName + "!");
        int damage = Math.max(this.unitAttack - target.unitArmour, 1); 

        if ((this.unitType.equals("Cavalry") && target.unitType.equals("Infantry")) ||
            (this.unitType.equals("Infantry") && target.unitType.equals("Cavalry")) ||
            (this.unitType.equals("Camel") && target.unitType.equals("Cavalry")) ||
            (this.unitType.equals("Infantry") && target.unitType.equals("Camel"))) 
        {
            damage += Math.max(this.unitBonusAttack - target.unitBonusArmour, 0);
        }

        target.unitHP -= damage;
        target.unitHP = Math.max(target.unitHP, 0); 
        this.unitAttackCount++;
        System.out.println(target.unitName + " Health: " + target.unitHP);
    }
    
        public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); 
        CombatSims2X unit1 = new CombatSims2X();
        unit1.unitChoice(sc);

        CombatSims2X unit2 = new CombatSims2X();
        unit2.unitChoice(sc);

        sc.close(); 

        System.out.println("COMBAT SIMULATION HAS BEGUN");
        System.out.println(" ");

        long unit1NextAttack = System.currentTimeMillis() + unit1.attackRate;
        long unit2NextAttack = System.currentTimeMillis() + unit2.attackRate;

        while (unit1.unitHP > 0 && unit2.unitHP > 0) 
        {
            long currentTime = System.currentTimeMillis();

            if (currentTime >= unit1NextAttack) 
            {
                unit1.attack(unit2);
                System.out.println(" ");
                unit1NextAttack = currentTime + unit1.attackRate;

                if (unit2.unitHP <= 0) 
                {
                    System.out.println(unit2.unitName + " is defeated after " + unit1.unitAttackCount + " strikes!");
                    System.out.println(unit1.unitName+" Health: "+unit1.unitHP);
                    break;
                }
            }

            if (currentTime >= unit2NextAttack) 
            {
                unit2.attack(unit1);
                System.out.println(" ");
                unit2NextAttack = currentTime + unit2.attackRate;

                if (unit1.unitHP <= 0) 
                {
                    System.out.println(unit1.unitName + " is defeated after " + unit2.unitAttackCount + " strikes!");
                    System.out.println(unit2.unitName+" Health: "+unit2.unitHP);
                    break;
                } 
            }
            CombatSims2X.timeGap(50);
        }
        System.out.println(" ");
        System.out.println("COMBAT SIMULATION HAS ENDED");
    }
}