# CombatSims - Age of Empires Combat Simulator

A combat simulation program inspired by the Age of Empires game series. This project simulates one-on-one battles between different military units with authentic stats and combat mechanics.

## Overview

CombatSims allows players to select military units from different unit lines, choose upgrade levels, and watch them battle in real-time. The simulator uses actual game mechanics including attack speed, armor, bonus damage, and unit type advantages.

## Versions

The project has evolved through several versions, each adding more features and improvements:

### V1.java (Initial Version)
- Basic combat simulation between two preset units
- Simple attack and damage calculation
- Fixed unit stats for Knight and Swordsman

### V1.1.java
- Added damage calculation refinements
- Improved combat feedback

### V2.java
- Multiple unit options for players
- Basic upgrade paths
- Player choice menu

### V2.2.java
- Enhanced unit selection interface
- More unit types available

### V3.java (Latest Version) ⭐
- **Most complete version with all features**
- 5 unit lines: Knight, Spear, Swordsman, Scout, and Camel
- Progressive upgrade paths (5 levels per unit line)
- Real-time combat simulation with proper attack speed mechanics
- Unit type advantages (e.g., Spearmen deal bonus damage to Cavalry)
- Input validation and error handling
- Detailed combat feedback

## How to Run

### Compile and Run V3 (Recommended)

```bash
# Navigate to the CombatSims directory
cd CombatSims/

# Compile the program
javac V3.java

# Run the simulator
java CombatSims3
```

## How to Play

1. **Player 1 selects a unit:**
   - Choose a unit line (1-5)
   - Choose an upgrade level (1-5)

2. **Player 2 selects a unit:**
   - Same process as Player 1

3. **Watch the battle:**
   - Units automatically attack based on their attack speed
   - Combat continues until one unit is defeated
   - The winner and their remaining HP are displayed

## Unit Lines and Upgrades

### 1. Knight Line (Cavalry)
- No upgrades → Knight
- Feudal Age → Knight
- Castle Age → Knight
- Fully Upgraded → Cavalier
- Fully Upgraded → Paladin (strongest cavalry)

**Stats:** High HP and attack, moderate armor

### 2. Spear Line (Infantry - Anti-Cavalry)
- No upgrades → Spearman
- Feudal Age → Spearman
- Castle Age → Pikeman
- Fully Upgraded → Pikeman
- Fully Upgraded → Halberdier

**Stats:** Bonus damage against cavalry and camels

### 3. Swordsman Line (Infantry - All-around)
- No upgrades → Militia
- Feudal Age → Man-At-Arms
- Castle Age → Longswordman
- Fully Upgraded → Two Handed Swordsman
- Fully Upgraded → Champion

**Stats:** Balanced stats, good armor

### 4. Scout Line (Cavalry - Fast)
- No upgrades → Scout Cavalry
- Feudal Age → Scout Cavalry
- Castle Age → Light Cavalry
- Fully Upgraded → Light Cavalry
- Fully Upgraded → Hussar

**Stats:** Fast attack speed, lower attack damage

### 5. Camel Line (Anti-Cavalry)
- No upgrades → Camel Rider
- Feudal Age → Camel Rider
- Castle Age → Camel Rider
- Fully Upgraded → Camel Rider
- Fully Upgraded → Heavy Camel Rider

**Stats:** Bonus damage against cavalry

## Combat Mechanics

### Attack Speed
Each unit has a different attack speed (measured in milliseconds):
- Slower units deal more damage per hit
- Faster units attack more frequently
- Real-time simulation using multithreading

### Damage Calculation
```
Base Damage = Unit Attack - Target Armor (minimum 1)
Bonus Damage = Bonus Attack - Bonus Armor (if applicable)
Total Damage = Base Damage + Bonus Damage
```

### Unit Type Advantages
- **Infantry (Spears)** → Strong vs Cavalry and Camels
- **Cavalry** → Strong vs Infantry (non-spear)
- **Camels** → Strong vs Cavalry

## Technical Details

### Key Features
- Object-oriented design with unit classes
- Real-time combat using `System.currentTimeMillis()` and `Thread.sleep()`
- Input validation with exception handling
- Attack speed simulation for realistic combat timing

### Main Methods
- `setUnitStats()` - Initializes unit properties
- `P1_unitChoice()` / `P2_unitChoice()` - Player selection menus
- `attack()` - Combat logic with damage calculation
- `timeGap()` - Timing delays for simulation

## Example Battle

```
Player 1: Paladin (18 attack, 5 armor, 180 HP)
vs
Player 2: Halberdier (10 attack, 3 armor, 60 HP, +32 vs cavalry)

Result: Halberdier wins due to massive bonus damage against cavalry!
```

## Future Enhancements

Potential features for future versions:
- Ranged units (archers, crossbowmen)
- Multiple unit battles
- Civilization bonuses
- GUI interface
- Statistics tracking

## Requirements

- Java Development Kit (JDK) 8 or higher
- Terminal/Command prompt for interaction

## Notes

- All unit stats are approximations based on Age of Empires II
- The simulation is deterministic based on unit stats and attack speed
- Choose your units wisely - unit matchups matter!
