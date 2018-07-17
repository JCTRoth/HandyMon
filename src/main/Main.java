/**
 * 
 */
package main;

import attack.Attack;
import attack.Attacks;
import attack.SpecialEffects;
import battle.Battle;
import battle.BattleLogic;
import gui.BattleWindow;
import gui.GuiLogic;
import monster.Ball;
import monster.ImagePaths;
import monster.LevelMultiplayer;
import monster.Monster;
import trainer.BallPocked;
import trainer.Trainer;


public class Main {
	
	public static GuiLogic gl;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		gl = new GuiLogic();
		startNewGame();
	}
	
	public static void startNewGame()
	{
		//Attack set Bouncer
		Attack bounce = new Attack("Bounce", 40, Type.physical, SpecialEffects.non, 20, 20);
		Attack splash = new Attack("Splash Water", 30, Type.water, SpecialEffects.non, 30, 30);
		Attack dance = new Attack("Wolf Dance", 0, Type.psychic, SpecialEffects.paralyse, 10, 10);
		Attack punch = new Attack("Punch", 50, Type.physical, SpecialEffects.non, 30, 30);
		
		//Attack set Shadow Bird
		Attack fly = new Attack("Fly", 40, Type.physical, SpecialEffects.non, 20, 20);
		Attack hack = new Attack("Hack", 20, Type.physical, SpecialEffects.non, 30, 30);
		Attack krawww = new Attack("Krawww", 0, Type.psychic, SpecialEffects.paralyse, 10, 10);
		Attack claw = new Attack("Claw", 50, Type.physical, SpecialEffects.non, 30, 30);
		
		//Attack set Magic Snake
		Attack bite = new Attack("Bite", 40, Type.physical, SpecialEffects.non, 20, 20);
		Attack tailstrike = new Attack("Tailstrike", 20, Type.physical, SpecialEffects.non, 30, 30);
		Attack shock = new Attack("Shock", 0, Type.psychic, SpecialEffects.paralyse, 10, 10);
		Attack choke = new Attack("Choke", 50, Type.physical, SpecialEffects.non, 30, 30);
		
		//Attack set satan
		Attack strike = new Attack("Strike", 40, Type.physical, SpecialEffects.non, 20, 20);
		Attack desecrate = new Attack("Desecrate", 20, Type.physical, SpecialEffects.non, 30, 30);
		Attack dab = new Attack("Dab", 0, Type.psychic, SpecialEffects.paralyse, 10, 10);
		Attack kick = new Attack("Kick", 50, Type.physical, SpecialEffects.non, 30, 30);
		
		//Attack set Death
		Attack deadStrike = new Attack("Strike", 40, Type.physical, SpecialEffects.non, 20, 20);
		Attack laughter = new Attack("Laughter", 20, Type.physical, SpecialEffects.non, 30, 30);
		Attack stare = new Attack("Stare", 0, Type.psychic, SpecialEffects.paralyse, 10, 10);
		Attack tip = new Attack("Tip", 50, Type.physical, SpecialEffects.non, 30, 30);
		

		Attacks ShadowBirdAttacks = new Attacks(fly, hack, krawww, claw);
		Attacks BouncerAttacks = new Attacks(bounce, splash, dance, punch);
		Attacks MagicAttacks = new Attacks(bite, tailstrike, shock, choke);
		Attacks SatanAttacks = new Attacks(strike, desecrate, dab, kick);
		Attacks DeadAttacks = new Attacks(deadStrike, laughter, stare, tip);
		

		//Level Multiplyer
		LevelMultiplayer lm_Bouncer = new LevelMultiplayer(5, 3, 1, 3, 2);
		

		//SatanásBarra
		Monster satanasBarra = new Monster("SatanásBarra", "Satanás Barra (esp)", 10, Type.fire, 100, 100, 150, "It can be seen sometimes, playing with a Diabolo.", SatanAttacks, 
				lm_Bouncer, 9999, SpecialEffects.non, true, new ImagePaths("/gui/SatanásBarra_front.png", "/gui/SatanásBarra_back.png"));
		
		//Bouncer
		Monster bouncer = new Monster("Bouncer", "Waterbouncermon", 10, Type.water, 110, 180, 60, "Protects the Water Disco", BouncerAttacks, 
				lm_Bouncer, 9999, SpecialEffects.non, true, new ImagePaths("/gui/Monster1_vorne.png", "/gui/Monster1_hinten.png"));
		
		//Magic Snake
		Monster magicSnake = new Monster("Magic Snake", "Magic Snake Snale", 10, Type.psychic, 100, 100, 150, "Snake Snake snake", MagicAttacks, 
				lm_Bouncer, 9999, SpecialEffects.non, true, new ImagePaths("/gui/Monster2_front.png", "/gui/Monster2_back.png"));
		
		//Shadow Bird
		Monster shadowBird = new Monster("shadowBird", "Shadow Bird", 10, Type.fire, 100, 100, 150, "Flyes only at Night.", ShadowBirdAttacks, 
				lm_Bouncer, 9999, SpecialEffects.non, true, new ImagePaths("/gui/ShadowBird_front.png", "/gui/ShadowBird_back.png"));
		
		//The Death
		Monster theDeath = new Monster("The Death", "The dead Death", 10, Type.fire, 100, 100, 150, "Flyes only at Night.", DeadAttacks, 
				lm_Bouncer, 9999, SpecialEffects.non, true, new ImagePaths("/gui/TheDeath_front.png", "/gui/TheDeath_back.png"));
		
		
		
		System.out.println(bouncer.getAttacks().getOne().getName());
		
		
		///////////////////
		//Monster to Ball
		//////////////////
		
		Ball ballBouncer = new Ball(bouncer, 1);

		Ball ballSatanasBarra = new Ball(satanasBarra, 1);
		
		Ball ballShadowBird = new Ball(shadowBird, 1);
		
		Ball ballDeath = new Ball(theDeath, 1);
		
		Ball ballMagic = new Ball(magicSnake, 1);

		
		///////////////
		//Player One
		///////////////
	
		
		BallPocked ballPocket = new BallPocked(ballBouncer.returnPositionBall(1), ballSatanasBarra.returnPositionBall(2), ballShadowBird.returnPositionBall(3), ballDeath.returnPositionBall(4), ballMagic.returnPositionBall(5));

		Trainer trainerOne = new Trainer("Jasperus", ballPocket);

		
		///////////////
		//Player Two
		///////////////
		BallPocked ballPocket2 = new BallPocked(ballBouncer.returnPositionBall(1), ballSatanasBarra.returnPositionBall(2), ballShadowBird.returnPositionBall(3), ballDeath.returnPositionBall(4), ballMagic.returnPositionBall(5));
		Trainer trainerTwo = new Trainer("Jasperus", ballPocket2);
		
		
		/////////////
		//Battle
		////////////
		Battle battle = new Battle(trainerOne, trainerTwo);
		BattleLogic battleLogic = new BattleLogic(battle);

		
		gl.setBattleLogic(battleLogic);
		
		battleLogic.setGuiLogic(gl);
		
		battleLogic.updateGui();
	}
}
