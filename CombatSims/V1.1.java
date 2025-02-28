class CombatSims1 {
    String unitName, unitType;
    int unitAttack, unitArmour, unitHP, unitBonusAttack, unitBonusArmour, unitAttackCount;
    int attackRate; // New field for attack rate in milliseconds

    // Method to initialize unit stats
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

    // Pause for a time gap
    public static void timeGap(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.out.println("Error during sleep: " + e.getMessage());
        }
    }

    // Method to attack another unit
    public void attack(CombatSims1 target) {
        System.out.println(this.unitName + " attacks " + target.unitName + "!");
        int damage = this.unitAttack - target.unitArmour;

        // Add bonus damage if applicable
        if (this.unitType.equals("Cavalry") && target.unitType.equals("Infantry")) {
            damage += Math.max(0, this.unitBonusAttack - target.unitBonusArmour);
        } else if (this.unitType.equals("Infantry") && target.unitType.equals("Cavalry")) {
            damage += Math.max(0, this.unitBonusAttack - target.unitBonusArmour);
        }

        // Check if damage is prevented by armor
        if (damage <= 0) {
            System.out.println("The attack was mostly absorbed by armor! " + target.unitName + " takes chip damage.");
            target.unitHP = Math.max(0, target.unitHP - 1); // Chip damage logic
        } else {
            target.unitHP = Math.max(0, target.unitHP - damage); // Regular damage
        }

        this.unitAttackCount++;
        System.out.println(target.unitName + " Health: " + target.unitHP);
    }

    public static void main(String[] args) {
        CombatSims1 knight = new CombatSims1();
        knight.setUnitStats("Knight", "Cavalry", 10, 2, 100, 4, 2, 1500); // Attack rate: 1500ms

        CombatSims1 swordsman = new CombatSims1();
        swordsman.setUnitStats("Swordsman", "Infantry", 9, 1, 60, 3, 1, 1000); // Attack rate: 1000ms

        // Simulate combat
        long knightNextAttack = System.currentTimeMillis() + knight.attackRate;
        long swordsmanNextAttack = System.currentTimeMillis() + swordsman.attackRate;

        while (knight.unitHP > 0 && swordsman.unitHP > 0) {
            long currentTime = System.currentTimeMillis();

            // Knight attacks when it's their time
            if (currentTime >= knightNextAttack) {
                knight.attack(swordsman);
                knightNextAttack = currentTime + knight.attackRate;

                if (swordsman.unitHP <= 0) {
                    System.out.println(swordsman.unitName + " is defeated after " + knight.unitAttackCount + " strikes!");
                    break;
                }
            }

            // Swordsman attacks when it's their time
            if (currentTime >= swordsmanNextAttack) {
                swordsman.attack(knight);
                swordsmanNextAttack = currentTime + swordsman.attackRate;

                if (knight.unitHP <= 0) {
                    System.out.println(knight.unitName + " is defeated after " + swordsman.unitAttackCount + " strikes!");
                    break;
                }
            }

            // Small pause to prevent high CPU usage
            CombatSims1.timeGap(50);
        }

        System.out.println("Combat ends!");
    }
}
