import java.util.Scanner;
import java.util.Random;

public class Main{
	static Scanner sc = new Scanner(System.in);
	static PlayerStats plyrStats = new PlayerStats();
	static MobsStats mobStats = new MobsStats();
	static GameSystem gameSystem = new GameSystem(plyrStats,mobStats);
	static WarriorClass warriorClass = new WarriorClass();
	static ThiefClass thiefClass = new ThiefClass();
	static MageClass mageClass = new MageClass();
	static Goblin goblin = new Goblin();
	static Imp imp = new Imp();
	static Troll troll = new Troll();
	static ClassSelection classSelect = new ClassSelection();
	static String classname;
	static char finalSelection;
	static Integer classChoice;
	static Random rand = new Random();
	//static Integer mobSpawn = 1 + (int)(Math.random() * 2);
	//static Integer mobAction = 1 + (int)(Math.random() * 2);
	static double calDmgMob;
	static double calDmgPlyr;
	static double calBlockMobchnc;
	static double calBlockPlyrchnc;
	static Integer plyrMove;
	static Integer plyrAction;
	static Integer damageplyrHp = (int)calDmgPlyr;
	static double damagemobHp = (int)calDmgMob;
	
	public static void main(String[] args) {
		
		System.out.println("What is your name Adventurer?: ");
		System.out.print("Enter your name: ");
		String name = sc.next();
		plyrStats.setPlayerName(name);
		System.out.println("Ahhhh...so your name is "+plyrStats.getPlayerName());
		System.out.println("");
		gameend:
		while(true) {
			System.out.println("You must choose your class "+plyrStats.getPlayerName());
			System.out.println("[1]- Warrior");
			System.out.println("[2]- Thief");
			System.out.println("[3]- Mage");
			System.out.println("[4]- Exit");
			System.out.print("Choice: ");
			classChoice = sc.nextInt();
		
			switch(classChoice) {
			
			case 1: 
				classSelect.plyrSelectClass(warriorClass.getClassName(), warriorClass.getStartingHP(), warriorClass.getStartingDMG(), warriorClass.getStartingDEF());
				finalSelection = sc.next().charAt(0);
				if(finalSelection == 'Y' || finalSelection == 'y') {
					plyrStats.setPlayerClass(warriorClass.getClassName());
					plyrStats.setPlayerHP(warriorClass.getStartingHP());
					plyrStats.setPlayerDMG(warriorClass.getStartingDMG());
					plyrStats.setPlayerDef(warriorClass.getStartingDEF());
					System.out.println("You are a "+plyrStats.getPlayerClass());
					while(!gameEnds(false)) {
						Integer mobSpawn = rand.nextInt(2)+1;
						Integer mobAction = rand.nextInt(2)+1;
						Integer blockChnc = rand.nextInt(100)+1;
						int turns = 0;
						System.out.println("");
						System.out.println("Hp: "+plyrStats.getPlayerHP());
						System.out.println("");
						System.out.println("Actions: ");
						System.out.println("[1]- Move");
						System.out.println("[2]- Exit");
						System.out.print("Choice: ");
						plyrMove = sc.nextInt();
						System.out.println("");
						battle:
						if(plyrMove == 1 && mobSpawn == 1) {
							System.out.println("Player "+plyrStats.getPlayerName()+" moves");
						}else if(mobSpawn == 2) {
							System.out.println("You encounter a "+goblin.getClassName()+" !");
							mobStats.setMobName(goblin.getClassName());
							mobStats.setMobHP(goblin.getStartingHP());
							mobStats.setMobDMG(goblin.getStartingDMG());
							mobStats.setMobDef(goblin.getStartingDEF());
							while(!battlephase(false)) {
								
								if(turns%2== 0) {
									System.out.println("Player Hp: "+plyrStats.getPlayerHP()+" ---- "+" Mob Hp: "+mobStats.getMobHP());
									System.out.println("Actions: ");
									System.out.println("");
									System.out.println("[1]- Attack");
									System.out.println("[2]- Block");
									System.out.println("[3]- Run");
									System.out.print("Choice: ");
									plyrAction = sc.nextInt();
									System.out.println("");
									if(plyrAction == 1) {
										calDmgPlyr = gameSystem.setDamageToMob(plyrStats.getPlayerDMG());
										damagemobHp = (int)gameSystem.damageMobHp(calDmgPlyr);
										mobStats.setMobHP(damagemobHp);
										System.out.println("Dealt "+(int)calDmgPlyr+" to "+mobStats.getMobName());
										System.out.println("You have dealt a damage to "+mobStats.getMobName());
										System.out.println(mobStats.getMobHP()+" HP left");
										System.out.println("");
									}
									else if(plyrAction == 2) {
										System.out.println("You brace yourself for incomming attack!");
										if(blockChnc <= 5) {
											System.out.println("Block unsuccesfull!");
										}else if(blockChnc >= 95) {
											calBlockPlyrchnc = gameSystem.PlyrBlock(calDmgMob);
											plyrStats.setPlayerHP(calBlockPlyrchnc);
											System.out.println("The hit is blocked!");
										}
										System.out.println("");
									}
									else {
										break battle;
									}
								
								}
								else if(turns%2 == 1) {
									if(mobAction == 1) {
										calDmgMob = gameSystem.setDamageToPlayer(mobStats.getMobDMG());
										damageplyrHp = (int) gameSystem.damagePlyrHp(calDmgMob);
										plyrStats.setPlayerHP(damageplyrHp);
										System.out.println("Dealt "+(int)calDmgMob+" to "+plyrStats.getPlayerName());
										System.out.println(mobStats.getMobName()+" deal a damage to "+plyrStats.getPlayerName());
										System.out.println(plyrStats.getPlayerHP()+" HP left");
										System.out.println("");
									}
									if(mobAction == 2) {
										System.out.println(mobStats.getMobName()+" has brace itself for incomming attack!");
										if(blockChnc <= 5) {
											System.out.println("Block unsuccesfull!");
										}else if(blockChnc >= 95) {
											calBlockMobchnc = gameSystem.MobBlock(calDmgPlyr);
											mobStats.setMobHP(calBlockMobchnc);
											System.out.println("The hit is blocked!");
										}
										System.out.println("");
									}
								}
								turns++;
								if(battlephase(false) == true) {
									break battle;
								}
								if(gameEnds(false) == true) {
									break gameend;
								}
							}
						}else if(mobSpawn == 3) {
							System.out.println("You encounter a "+imp.getClassName()+" !");
							mobStats.setMobName(imp.getClassName());
							mobStats.setMobHP(imp.getStartingHP());
							mobStats.setMobDMG(imp.getStartingDMG());
							mobStats.setMobDef(imp.getStartingDEF());
							while(!battlephase(false)) {
								
								if(turns%2== 0) {
									System.out.println("Player Hp: "+plyrStats.getPlayerHP()+" ---- "+" Mob Hp: "+mobStats.getMobHP());
									System.out.println("Actions: ");
									System.out.println("");
									System.out.println("[1]- Attack");
									System.out.println("[2]- Block");
									System.out.println("[3]- Run");
									System.out.print("Choice: ");
									plyrAction = sc.nextInt();
									System.out.println("");
									if(plyrAction == 1) {
										calDmgPlyr = gameSystem.setDamageToMob(plyrStats.getPlayerDMG());
										damagemobHp = (int)gameSystem.damageMobHp(calDmgPlyr);
										mobStats.setMobHP(damagemobHp);
										System.out.println("Dealt "+(int)calDmgPlyr+" to "+mobStats.getMobName());
										System.out.println("You have dealt a damage to "+mobStats.getMobName());
										System.out.println(mobStats.getMobHP()+" HP left");
										System.out.println("");
									}
									else if(plyrAction == 2) {
										gameSystem.PlyrBlock(calDmgMob);
										System.out.println("You brace yourself for incomming attack!");
										System.out.println("");
									}
									else {
										break battle;
									}
								
								}
								else if(turns%2 == 1) {
									if(mobAction == 1) {
										calDmgMob = gameSystem.setDamageToPlayer(mobStats.getMobDMG());
										damageplyrHp = (int) gameSystem.damagePlyrHp(calDmgMob);
										plyrStats.setPlayerHP(damageplyrHp);
										System.out.println("Dealt "+(int)calDmgMob+" to "+plyrStats.getPlayerName());
										System.out.println(mobStats.getMobName()+" deal a damage to "+plyrStats.getPlayerName());
										System.out.println(plyrStats.getPlayerHP()+" HP left");
										System.out.println("");
									}
									if(mobAction == 2) {
										gameSystem.MobBlock(calDmgPlyr);
										System.out.println(mobStats.getMobName()+" has brace itself for incomming attack!");
										System.out.println("");
									}
								}
								turns++;
								if(battlephase(false) == true) {
									break battle;
								}
								if(gameEnds(false) == true) {
									break gameend;
								}
							}
						}else if(mobSpawn == 4) {
							System.out.println("You encounter a "+troll.getClassName()+" !");
							mobStats.setMobName(troll.getClassName());
							mobStats.setMobHP(troll.getStartingHP());
							mobStats.setMobDMG(troll.getStartingDMG());
							mobStats.setMobDef(troll.getStartingDEF());
							while(!battlephase(false)) {
								
								if(turns%2== 0) {
									System.out.println("Player Hp: "+plyrStats.getPlayerHP()+" ---- "+" Mob Hp: "+mobStats.getMobHP());
									System.out.println("Actions: ");
									System.out.println("");
									System.out.println("[1]- Attack");
									System.out.println("[2]- Block");
									System.out.println("[3]- Run");
									System.out.print("Choice: ");
									plyrAction = sc.nextInt();
									System.out.println("");
									if(plyrAction == 1) {
										calDmgPlyr = gameSystem.setDamageToMob(plyrStats.getPlayerDMG());
										damagemobHp = (int)gameSystem.damageMobHp(calDmgPlyr);
										mobStats.setMobHP(damagemobHp);
										System.out.println("Dealt "+(int)calDmgPlyr+" to "+mobStats.getMobName());
										System.out.println("You have dealt a damage to "+mobStats.getMobName());
										System.out.println(mobStats.getMobHP()+" HP left");
										System.out.println("");
									}
									else if(plyrAction == 2) {
										gameSystem.PlyrBlock(calDmgMob);
										System.out.println("You brace yourself for incomming attack!");
										System.out.println("");
									}
									else {
										break battle;
									}
								
								}
								else if(turns%2 == 1) {
									if(mobAction == 1) {
										calDmgMob = gameSystem.setDamageToPlayer(mobStats.getMobDMG());
										damageplyrHp = (int) gameSystem.damagePlyrHp(calDmgMob);
										plyrStats.setPlayerHP(damageplyrHp);
										System.out.println("Dealt "+(int)calDmgMob+" to "+plyrStats.getPlayerName());
										System.out.println(mobStats.getMobName()+" deal a damage to "+plyrStats.getPlayerName());
										System.out.println(plyrStats.getPlayerHP()+" HP left");
										System.out.println("");
									}
									if(mobAction == 2) {
										gameSystem.MobBlock(calDmgPlyr);
										System.out.println(mobStats.getMobName()+" has brace itself for incomming attack!");
										System.out.println("");
									}
								}
								turns++;
								if(battlephase(false) == true) {
									break battle;
								}
								if(gameEnds(false) == true) {
									break gameend;
								}
							}
							
						}
						if(plyrMove == 2){
							System.out.println("");
							System.out.println("Good bye Adventurer!");
							break gameend;
						}
					}
				}
				else {
					continue;
				}
				break;
			
			case 2:
				classSelect.plyrSelectClass(thiefClass.getClassName(), thiefClass.getStartingHP(), thiefClass.getStartingDMG(), thiefClass.getStartingDEF());
				finalSelection = sc.next().charAt(0);
				if(finalSelection == 'Y' || finalSelection == 'y') {
					name = thiefClass.getClassName();
					plyrStats.setPlayerHP(thiefClass.getStartingHP());
					plyrStats.setPlayerDMG(thiefClass.getStartingDMG());
					plyrStats.setPlayerDef(thiefClass.getStartingDEF());
					while(!gameEnds(false)) {
						
					}
				}
				else {
					continue;
				}
				break;
			
			case 3:
				classSelect.plyrSelectClass(mageClass.getClassName(), mageClass.getStartingHP(), mageClass.getStartingDMG(), mageClass.getStartingDEF());
				finalSelection = sc.next().charAt(0);
				if(finalSelection == 'Y' || finalSelection == 'y') {
					name = mageClass.getClassName();
					plyrStats.setPlayerHP(mageClass.getStartingHP());
					plyrStats.setPlayerDMG(mageClass.getStartingDMG());
					plyrStats.setPlayerDef(mageClass.getStartingDEF());
					while(!gameEnds(false)) {
						
					}
				}
				else {
					continue;
				}
				break;
		
		}
		if(classChoice == 4) {
			break;
		}
		}
	}
	public static boolean gameEnds(boolean end) {
		boolean end1 = end;
		if(plyrStats.getPlayerHP() <= 0 ) {
			System.out.println("You have perished and killed by "+mobStats.getMobName());
			end1 = true;
		}
		return end1;
	}
	public static boolean battlephase(boolean endbattle) {
		boolean endthebattle = endbattle;
		if(mobStats.getMobHP() <=0) {
			System.out.println("You have killed a "+mobStats.getMobName());
			endthebattle= true;
		}
		return endthebattle;
	}
	
}