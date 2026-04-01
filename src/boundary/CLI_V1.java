import java.util.Scanner;

public class CLI_V1 {

    public void print(String a){
         System.out.println(a);
    }
    public void begin(){
        print("==================================");
        print("WELCOME TO TURN-BASED COMBAT ARENA");
        print("==================================");
        print(" ");
        print("--- SELECT YOUR CHAMPION ---");
        print("1. Warrior");
        print("   STATS: HP: 260, ATK: 40, DEF: 20, SPD: 30");
        print("   ABILITY: Shield Bash: Stun enemy for 2 rounds");
        print("2. Wizard");
        print("   STATS: HP: 200, ATK: 50, DEF: 10, SPD: 20");
        print("   ABILITY: Arcane Blast: Enemy defeated add atk");
        print("Enter choice (1-2):");

    }
}
