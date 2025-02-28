class CombatSims2 {
    String unitName, unitType;
    int unitAttack, unitArmour, unitHP, unitBonusAttack, unitBonusArmour, unitAttackCount, attackRate; 
    public void setUnitStats(String name, String type, int attack, int armour, int hp, int bonusAttack, int bonusArmour, int rate) {
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

    public static void timeGap(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.out.println("Error during sleep: " + e.getMessage());
        }
    }

    public void attack(CombatSims2 target)
    {
        System.out.println(this.unitName + " attacks " + target.unitName + "!");
        int damage = this.unitAttack - target.unitArmour;
        if (damage <= 0)
        {
            damage = 1;
        }
        if (this.unitType.equals("Cavalry") && target.unitType.equals("Infantry")) 
        {
            damage+= this.unitBonusAttack - target.unitBonusArmour;
        } 
        else if (this.unitType.equals("Infantry") && target.unitType.equals("Cavalry")) 
        {
            damage+= this.unitBonusAttack - target.unitBonusArmour;
        }
        target.unitHP = target.unitHP - damage;
        this.unitAttackCount++;
        System.out.println(target.unitName + " Health: " + target.unitHP);
    }
    public static void main (String args[])
    {
        CombatSims1 unit1 = new CombatSims1();
        unit1.setUnitStats("Knight", "Cavalry", 10, 2, 100, 2, 2, 1400);

        CombatSims1 unit2 = new CombatSims1();
        unit2.setUnitStats("Swordsman", "Infantry", 9, 1, 65, 7, 0, 950);

        long unit1NextAttack = System.currentTimeMillis() + unit1.attackRate;
        long unit2NextAttack = System.currentTimeMillis() + unit2.attackRate;

        while (unit1.unitHP > 0 && unit2.unitHP > 0) {
            long currentTime = System.currentTimeMillis();

            if (currentTime >= unit1NextAttack) 
            {
                unit1.attack(unit2);
                System.out.println(" ");
                unit1NextAttack = currentTime + unit1.attackRate;

                if (unit2.unitHP <= 0) {
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

                if (unit1.unitHP <= 0) {
                    System.out.println(unit1.unitName + " is defeated after " + unit2.unitAttackCount + " strikes!");
                    System.out.println(unit2.unitName+" Health: "+unit2.unitHP);
                    break;
                } 
            }
            CombatSims1.timeGap(50);
        }
        System.out.println(" ");
        System.out.println("Combat ends!");
    }
}