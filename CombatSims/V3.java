import java.util.*;
class CombatSims3 
{
    String unitName, unitType;
    int unitAttack, unitArmour, unitHP, infantryArmour, cavalryArmour, camelArmour, infantryAttack, cavalryAttack, camelAttack,unitAttackCount, attackSpeed; 

    public void setUnitStats(String name, String type, int attack, int armour, int hp, int infArmour, int cavArmour, int camArmour, int infAttack, int cavAttack, int camAttack, int speed) 
    {
        this.unitName = name;
        this.unitType = type;
        this.unitAttack = attack;
        this.unitArmour = armour;
        this.unitHP = hp;
        this.infantryArmour = infArmour;
        this.cavalryArmour = cavArmour;
        this.camelArmour = camArmour;
        this.infantryAttack = infAttack;
        this.cavalryAttack = cavAttack;
        this.camelAttack = camAttack;
        this.unitAttackCount = 0;
        this.attackSpeed = speed;
    }

    public void P1_unitChoice(Scanner sc) 
    {
        System.out.println("Player 1");
        System.out.println("Choose a Unit Line");
        System.out.println("1. Knight Line");
        System.out.println("2. Spear Line");
        System.out.println("3. Swordsman Line");
        System.out.println("4. Scout Line");
        System.out.println("5. Camel Line");
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
            System.out.println("Select Unit Upgrades");
            System.out.println("1. No upgrades");
            System.out.println("2. Feudal Age Upgrades");
            System.out.println("3. Castle Age Upgrades");
            System.out.println("4. Fully Upgraded Cavalier");
            System.out.println("5. Fully Upgraded Paladin");
            System.out.print("Enter your choice: ");

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
            switch (choice) 
            {
                case 1:
                    setUnitStats("P1 Knight", "Cavalry", 10, 2, 100, 1000, 0, 1000, 0, 0, 0, 1800);
                    break;
                case 2:
                    setUnitStats("P1 Knight", "Cavalry", 11, 3, 120, 1000, 0, 1000, 0, 0, 0, 1800);
                    break;
                case 3:
                    setUnitStats("P1 Knight", "Cavalry", 12, 4, 120, 1000, 0, 1000, 0, 0, 0, 1800);
                    break;
                case 4:
                    setUnitStats("P1 Cavalier", "Cavalry", 16, 5, 140, 1000, 0, 1000, 0, 0, 0, 1800);
                    break;
                case 5:
                    setUnitStats("P1 Paladin", "Cavalry", 18, 5, 180, 1000, 0, 1000, 0, 0, 0, 1900);
                    break;
            }
            break;
            case 2:
            System.out.println("Select Unit Upgrades");
            System.out.println("1. No upgrades");
            System.out.println("2. Feudal Age Upgrades");
            System.out.println("3. Castle Age Upgrades + Pikeman");
            System.out.println("4. Fully Upgraded Pikeman");
            System.out.println("5. Fully Upgraded Halberdier ");
            System.out.print("Enter your choice: ");

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
            switch (choice) 
            {
                case 1:
                    setUnitStats("P1 Spearman", "Infantry", 3, 0, 45, 0, 1000, 1000, 0, 15, 12, 3000);
                    break;
                case 2:
                    setUnitStats("P1 Spearman", "Infantry", 4, 1, 45, 0, 1000, 1000, 0, 15, 12, 3000);
                    break;
                case 3:
                    setUnitStats("P1 Pikeman", "Infantry", 6, 2, 55, 0, 1000, 1000, 0, 22, 18, 3000);
                    break;
                case 4:
                    setUnitStats("P1 Pikeman", "Infantry", 8, 3, 55, 0, 1000, 1000, 0, 22, 18, 3000);
                    break;
                case 5:
                    setUnitStats("P1 Halberdier", "Infantry", 10, 3, 60, 0, 1000, 1000, 0, 32, 26, 3000);
                    break;
            }
                break;
            case 3:
                System.out.println("Select Unit Upgrades");
                System.out.println("1. No upgrades");
                System.out.println("2. Feudal Age Upgrades + Man-At-Arms");
                System.out.println("3. Castle Age Upgrades + LongSwords");
                System.out.println("4. Fully Upgraded Two Handed Swordsman");
                System.out.println("5. Fully Upgraded Champion ");
                System.out.print("Enter your choice: ");

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
                switch (choice) 
                {
                    case 1:
                        setUnitStats("P1 Militia", "Infantry", 4, 0, 40, 0, 1000, 1000, 0, 0, 0, 2000);
                        break;
                    case 2:
                        setUnitStats("P1 Man-At-Arms", "Infantry", 7, 1, 45, 0, 1000, 1000, 0, 0, 0, 2000);
                        break;
                    case 3:
                        setUnitStats("P1 Longswordman", "Infantry", 11, 3, 60, 0, 1000, 1000, 0, 0, 0, 2000);
                        break;
                    case 4:
                        setUnitStats("P1 Two Handed Swordsman", "Infantry", 16, 4, 60, 0, 1000, 1000, 0, 0, 0, 2000);
                        break;
                    case 5:
                        setUnitStats("P1 Champion", "Infantry", 17, 4, 70, 0, 1000, 1000, 0, 0, 0, 2000);
                        break;
                }
                break;
            case 4:
            System.out.println("Select Unit Upgrades");
            System.out.println("1. No upgrades");
            System.out.println("2. Feudal Age Upgrades");
            System.out.println("3. Castle Age Upgrades + Light Cavalry");
            System.out.println("4. Fully Upgraded Light Cavalry");
            System.out.println("5. Fully Upgraded Hussar");
            System.out.print("Enter your choice: ");

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
            switch (choice) 
            {
                case 1:
                    setUnitStats("P1 Scout Cavalry", "Cavalry", 3, 0, 45, 1000, 0, 1000, 0, 0, 0, 2000);
                    break;
                case 2:
                    setUnitStats("P1 Scout Cavalry", "Cavalry", 6, 1, 65, 1000, 0, 1000, 0, 0, 0, 2000);
                    break;
                case 3:
                    setUnitStats("P1 Light Cavalry", "Cavalry", 9, 2, 80, 1000, 0, 1000, 0, 0, 0, 2000);
                    break;
                case 4:
                    setUnitStats("P1 Light Cavalry", "Cavalry", 11, 3, 80, 1000, 0, 1000, 0, 0, 0, 2000);
                    break;
                case 5:
                    setUnitStats("P1 Hussar", "Cavalry", 11, 3, 95, 1000, 0, 1000, 0, 0, 0, 1900);
                    break;
            }
                break;
            case 5:
            System.out.println("Select Unit Upgrades");
            System.out.println("1. No upgrades");
            System.out.println("2. Feudal Age Upgrades");
            System.out.println("3. Castle Age Upgrades");
            System.out.println("4. Fully Upgraded Camel Rider");
            System.out.println("5. Fully Upgraded Heavy Camel Rider");
            System.out.print("Enter your choice: ");

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
            switch (choice) 
            {
                case 1:
                    setUnitStats("P1 Camel Rider", "Camel", 6, 0, 100, 1000, 1000, 0, 0, 9, 5, 2000);
                    break;
                case 2:
                    setUnitStats("P1 Camel Rider", "Camel", 7, 1, 120, 1000, 1000, 0, 0, 9, 5, 2000);
                    break;
                case 3:
                    setUnitStats("P1 Camel Rider", "Camel", 8, 2, 120, 1000, 1000, 0, 0, 9, 5, 2000);
                    break;
                case 4:
                    setUnitStats("P1 Camel Rider", "Camel", 10, 3, 120, 1000, 1000, 0, 0, 9, 5, 2000);
                    break;
                case 5:
                    setUnitStats("P1 Heavy Camel Rider", "Camel", 11, 3, 140, 1000, 1000, 0, 0, 18, 9, 2000);
                    break;
            }
                break;
        }
    }

    public void P2_unitChoice(Scanner sc) 
    {
        {
            System.out.println("Player 2");
            System.out.println("Choose a Unit Line");
            System.out.println("1. Knight Line");
            System.out.println("2. Spear Line");
            System.out.println("3. Swordsman Line");
            System.out.println("4. Scout Line");
            System.out.println("5. Camel Line");
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
                System.out.println("Select Unit Upgrades");
                System.out.println("1. No upgrades");
                System.out.println("2. Feudal Age Upgrades");
                System.out.println("3. Castle Age Upgrades");
                System.out.println("4. Fully Upgraded Cavalier");
                System.out.println("5. Fully Upgraded Paladin");
                System.out.print("Enter your choice: ");
    
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
                switch (choice) 
                {
                    case 1:
                        setUnitStats("P2 Knight", "Cavalry", 10, 2, 100, 1000, 0, 1000, 0, 0, 0, 1800);
                        break;
                    case 2:
                        setUnitStats("P2 Knight", "Cavalry", 11, 3, 120, 1000, 0, 1000, 0, 0, 0, 1800);
                        break;
                    case 3:
                        setUnitStats("P2 Knight", "Cavalry", 12, 4, 120, 1000, 0, 1000, 0, 0, 0, 1800);
                        break;
                    case 4:
                        setUnitStats("P2 Cavalier", "Cavalry", 16, 5, 140, 1000, 0, 1000, 0, 0, 0, 1800);
                        break;
                    case 5:
                        setUnitStats("P2 Paladin", "Cavalry", 18, 5, 180, 1000, 0, 1000, 0, 0, 0, 1900);
                        break;
                }
                break;
                case 2:
                System.out.println("Select Unit Upgrades");
                System.out.println("1. No upgrades");
                System.out.println("2. Feudal Age Upgrades");
                System.out.println("3. Castle Age Upgrades + Pikeman");
                System.out.println("4. Fully Upgraded Pikeman");
                System.out.println("5. Fully Upgraded Halberdier");
                System.out.print("Enter your choice: ");
    
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
                switch (choice) 
                {
                    case 1:
                        setUnitStats("P2 Spearman", "Infantry", 3, 0, 45, 0, 1000, 1000, 0, 15, 12, 3000);
                        break;
                    case 2:
                        setUnitStats("P2 Spearman", "Infantry", 4, 1, 45, 0, 1000, 1000, 0, 15, 12, 3000);
                        break;
                    case 3:
                        setUnitStats("P2 Pikeman", "Infantry", 6, 2, 55, 0, 1000, 1000, 0, 22, 18, 3000);
                        break;
                    case 4:
                        setUnitStats("P2 Pikeman", "Infantry", 8, 3, 55, 0, 1000, 1000, 0, 22, 18, 3000);
                        break;
                    case 5:
                        setUnitStats("P2 Halberdier", "Infantry", 10, 3, 60, 0, 1000, 1000, 0, 32, 26, 3000);
                        break;
                }
                    break;
                case 3:
                    System.out.println("Select Unit Upgrades");
                    System.out.println("1. No upgrades");
                    System.out.println("2. Feudal Age Upgrades + Man-At-Arms");
                    System.out.println("3. Castle Age Upgrades + LongSwords");
                    System.out.println("4. Fully Upgraded Two Handed Swordsman");
                    System.out.println("5. Fully Upgraded Champion ");
                    System.out.print("Enter your choice: ");
    
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
                    switch (choice) 
                    {
                        case 1:
                            setUnitStats("P2 Militia", "Infantry", 4, 0, 40, 0, 1000, 1000, 0, 0, 0, 2000);
                            break;
                        case 2:
                            setUnitStats("P2 Man-At-Arms", "Infantry", 7, 1, 45, 0, 1000, 1000, 0, 0, 0, 2000);
                            break;
                        case 3:
                            setUnitStats("P2 Longswordman", "Infantry", 11, 3, 60, 0, 1000, 1000, 0, 0, 0, 2000);
                            break;
                        case 4:
                            setUnitStats("P2 Two Handed Swordsman", "Infantry", 16, 4, 60, 0, 1000, 1000, 0, 0, 0, 2000);
                            break;
                        case 5:
                            setUnitStats("P2 Champion", "Infantry", 17, 4, 70, 0, 1000, 1000, 0, 0, 0, 2000);
                            break;
                    }
                    break;
                case 4:
                System.out.println("Select Unit Upgrades");
                System.out.println("1. No upgrades");
                System.out.println("2. Feudal Age Upgrades");
                System.out.println("3. Castle Age Upgrades + Light Cavalry");
                System.out.println("4. Fully Upgraded Light Cavalry");
                System.out.println("5. Fully Upgraded Hussar");
                System.out.print("Enter your choice: ");
    
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
                switch (choice) 
                {
                    case 1:
                        setUnitStats("P2 Scout Cavalry", "Cavalry", 3, 0, 45, 1000, 0, 1000, 0, 0, 0, 2000);
                        break;
                    case 2:
                        setUnitStats("P2 Scout Cavalry", "Cavalry", 6, 1, 65, 1000, 0, 1000, 0, 0, 0, 2000);
                        break;
                    case 3:
                        setUnitStats("P2 Light Cavalry", "Cavalry", 9, 2, 80, 1000, 0, 1000, 0, 0, 0, 2000);
                        break;
                    case 4:
                        setUnitStats("P2 Light Cavalry", "Cavalry", 11, 3, 80, 1000, 0, 1000, 0, 0, 0, 2000);
                        break;
                    case 5:
                        setUnitStats("P2 Hussar", "Cavalry", 11, 3, 95, 1000, 0, 1000, 0, 0, 0, 1900);
                        break;
                }
                    break;
                case 5:
                System.out.println("Select Unit Upgrades");
                System.out.println("1. No upgrades");
                System.out.println("2. Feudal Age Upgrades");
                System.out.println("3. Castle Age Upgrades");
                System.out.println("4. Fully Upgraded Camel Rider");
                System.out.println("5. Fully Upgraded Heavy Camel Rider");
                System.out.print("Enter your choice: ");
    
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
                switch (choice) 
                {
                    case 1:
                        setUnitStats("P2 Camel Rider", "Camel", 6, 0, 100, 1000, 1000, 0, 0, 9, 5, 2000);
                        break;
                    case 2:
                        setUnitStats("P2 Camel Rider", "Camel", 7, 1, 120, 1000, 1000, 0, 0, 9, 5, 2000);
                        break;
                    case 3:
                        setUnitStats("P2 Camel Rider", "Camel", 8, 2, 120, 1000, 1000, 0, 0, 9, 5, 2000);
                        break;
                    case 4:
                        setUnitStats("P2 Camel Rider", "Camel", 10, 3, 120, 1000, 1000, 0, 0, 9, 5, 2000);
                        break;
                    case 5:
                        setUnitStats("P2 Heavy Camel Rider", "Camel", 11, 3, 140, 1000, 1000, 0, 0, 18, 9, 2000);
                        break;
                }
                    break;
            }
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

    public void attack(CombatSims3 target) 
    {
        System.out.println(this.unitName + " attacks " + target.unitName + "!");
        int damage = Math.max(this.unitAttack - target.unitArmour, 1); 
        if(damage<=0)
        {
            damage=1;
        }

        if (this.unitType.equals("Cavalry") && target.unitType.equals("Infantry"))
        {
            damage += Math.max(this.infantryAttack - target.infantryArmour, 0);
        }
        else if (this.unitType.equals("Infantry") && target.unitType.equals("Cavalry"))
        {
            damage += Math.max(this.cavalryAttack - target.cavalryArmour, 0);
        }
        else if (this.unitType.equals("Camel") && target.unitType.equals("Cavalry"))
        {
            damage += Math.max(this.cavalryAttack - target.cavalryArmour, 0);
        }
        else if (this.unitType.equals("Infantry") && target.unitType.equals("Camel")) 
        {
            damage += Math.max(this.camelAttack - target.camelArmour, 0);
        }
        else if (this.unitType.equals("Camel") && target.unitType.equals("Camel")) 
        {
            damage += Math.max(this.camelAttack - target.camelArmour, 0);
        }
        
        target.unitHP -= damage;
        target.unitHP = Math.max(target.unitHP, 0); 
        this.unitAttackCount++;
        System.out.println(target.unitName + " Health: " + target.unitHP);
    }
    
        public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); 
        CombatSims3 unit1 = new CombatSims3();
        unit1.P1_unitChoice(sc);

        CombatSims3 unit2 = new CombatSims3();
        unit2.P2_unitChoice(sc);

        sc.close(); 

        System.out.println("COMBAT SIMULATION HAS BEGUN");
        System.out.println(" ");

        long unit1NextAttack = System.currentTimeMillis() + unit1.attackSpeed;
        long unit2NextAttack = System.currentTimeMillis() + unit2.attackSpeed;

        while (unit1.unitHP > 0 && unit2.unitHP > 0) 
        {
            long currentTime = System.currentTimeMillis();

            if (currentTime >= unit1NextAttack) 
            {
                unit1.attack(unit2);
                System.out.println(" ");
                unit1NextAttack = currentTime + unit1.attackSpeed;

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
                unit2NextAttack = currentTime + unit2.attackSpeed;

                if (unit1.unitHP <= 0) 
                {
                    System.out.println(unit1.unitName + " is defeated after " + unit2.unitAttackCount + " strikes!");
                    System.out.println(unit2.unitName+" Health: "+unit2.unitHP);
                    break;
                } 
            }
            CombatSims3.timeGap(50);
        }
        System.out.println(" ");
        System.out.println("COMBAT SIMULATION HAS ENDED");
    }
}