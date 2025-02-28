class CombatSims
{
    String Unit_Name,Unit_Type;
    int Unit_Attack, Unit_Armour , Unit_HP , Unit_BonusAttack , Unit_BonusArmour, Unit_AttackCount;
    public void timegap(int milsec) //To provide time gaps between each attack
    {
        try
        {
            Thread.sleep(milsec);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public void unit_stats (String Name, String type ,int atk, int arm, int hp, int bsdmg, int bsarm, int atkcount) //Unit Stats
    {
        Unit_Name = Name; 
        Unit_Type = type;
        Unit_Attack = atk; 
        Unit_Armour = arm; 
        Unit_HP = hp; 
        Unit_BonusAttack = bsdmg;
        Unit_BonusArmour = bsarm;
        Unit_AttackCount = atkcount; 
    }

    public static void main (String args[])
    {
        CombatSims to = new CombatSims();
        CombatSims Unit_1 = new CombatSims();
        Unit_1.unit_stats ("Knight", "Cavalry", 10, 2, 100,2, 4, 0);
        CombatSims Unit_2 = new CombatSims();
        Unit_2.unit_stats ("Swordsman", "Infantry", 9, 1, 60, 16, 0, 0);

        while(Unit_1.Unit_HP > 0 && Unit_2.Unit_HP > 0)
        {
            System.out.println(Unit_1.Unit_Name+" attacks "+Unit_2.Unit_Name+ " !");
            to.timegap(1000);

            if(Unit_2.Unit_Type == "Infantry")
                Unit_2.Unit_HP -= ((Unit_1.Unit_Attack + (Unit_1.Unit_BonusAttack-Unit_2.Unit_BonusArmour))-Unit_2.Unit_Armour);
            else
                Unit_2.Unit_HP -= (Unit_1.Unit_Attack-Unit_2.Unit_Armour);
            Unit_1.Unit_AttackCount++;
            System.out.println(Unit_2.Unit_Name+" Health: " + ((Unit_2.Unit_HP>=0)?Unit_2.Unit_HP:0));

            if(Unit_2.Unit_HP <= 0)
            {
                System.out.println(Unit_2.Unit_Name+" is defeated after " +Unit_1.Unit_AttackCount+" strikes!");
                break;
            }

            System.out.println(Unit_2.Unit_Name+" attacks "+Unit_1.Unit_Name+" !");
            to.timegap(1000);

            if(Unit_1.Unit_Type == "Cavalry")
                Unit_1.Unit_HP -= ((Unit_2.Unit_Attack + (Unit_2.Unit_BonusAttack - Unit_1.Unit_BonusArmour))-Unit_1.Unit_Armour);
            else
                Unit_1.Unit_HP -= (Unit_2.Unit_Attack-Unit_1.Unit_Armour);
            Unit_2.Unit_AttackCount++;
            System.out.println(Unit_1.Unit_Name+" Health: " + ((Unit_1.Unit_HP>=0)?Unit_1.Unit_HP:0));

            if (Unit_1.Unit_HP <= 0)
            {
                System.out.println(Unit_1.Unit_Name+" is defeated after "+Unit_2.Unit_AttackCount+" stikes!");
                break;
            }
        }

        System.out.println("Combat ends!");
    }
}