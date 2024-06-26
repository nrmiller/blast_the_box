package net.nicksneurons.blastthebox.game;

import net.nicksneurons.blastthebox.graphics.geometry.Cube;
import net.nicksneurons.blastthebox.utils.RouletteWheel;

public class GameSettings
{
	public final static int EASY = 0, MEDIUM = 1, HARD = 2;
	//Commented values describe the scenario under easy game-play.
	public double indestructible_chance = .02; //2% Chance.

	public double gray_cube_chance = .75; //75% Chance.
	public double green_cube_chance = .15; //15% Chance.
	public double blue_cube_chance = .10; //10% Chance.

	public double nuke_chance = .01; //1% Chance.
	public double stopwatch_chance = .03; //3% Chance.
	public double triplefire_chance = .06; //6% Chance.
	public double pierce_chance = .04; //4% Chance.
	public double shield_chance = .10; //10% Chance.
	public double heart_chance = .10; //10% Chance.
	public double ammo_chance = .32; //32% Chance.
	public double strength1_chance = .09; //9% Chance.
	public double strength2_chance = .04; //4% Chance.

	public double unlimited_ammo_chance = 0.02; // 2% Chance.
	public double rapid_fire_chance = 0.03; // 3% Chance.
	
	public double score_speed = .5; //50% speed
	public double cube_speed = .5; //50% speed
	public double cube_density = .5; //50% density
	
	public boolean arcade_mode = false;
	public boolean show_controller = true;
	
	public int game_mode = EASY;

	public GameSettings()
	{

	}

	public PowerupType[] getPowerups()
	{
		PowerupType[] i = new PowerupType[11];
		i[0] = PowerupType.NUKE;
		i[1] = PowerupType.STOPWATCH;
		i[2] = PowerupType.TRIPLE_FIRE;
		i[3] = PowerupType.PIERCE;
		i[4] = PowerupType.SHIELD;
		i[5] = PowerupType.HEART;
		i[6] = PowerupType.AMMO;
		i[7] = PowerupType.STRENGTH_ONE;
		i[8] = PowerupType.STRENGTH_TWO;
		i[9] = PowerupType.UNLIMITED_AMMO;
		i[10] = PowerupType.RAPID_FIRE;

		return i;
	}
	public double[] getPowerupRarities()
	{
		double[] rarities =
		{
			nuke_chance, stopwatch_chance,
			triplefire_chance, pierce_chance,
			shield_chance, heart_chance,
			ammo_chance, strength1_chance,
			strength2_chance,
			unlimited_ammo_chance,
			rapid_fire_chance,
		};

		return rarities;
	}

	public RouletteWheel<PowerupType> createPowerupRoulette() {
		return new RouletteWheel<>(getPowerups(), getPowerupRarities());
	}

	public Integer[] getCubeHealths()
	{
		Integer[] cubeTypes = new Integer[3];
		cubeTypes[0] = 1;
		cubeTypes[1] = 2;
		cubeTypes[2] = 3;

		return cubeTypes;
	}

	public double[] getCubeHealthRarities()
	{
		double[] rarities =
		{
			gray_cube_chance,
			green_cube_chance,
			blue_cube_chance
		};
		return rarities;
	}

	public RouletteWheel<Integer> createCubeHealthRoulette() {
		return new RouletteWheel<>(getCubeHealths(), getCubeHealthRarities());
	}
	
	public Integer[] getIndestructible()
	{
		Integer[] i = new Integer[1];
		i[0] = Cube.INDESTRUCTIBLE;
		return i;
	}
	public double[] getIndestructibleRarity()
	{
		double[] rarities = 
		{
			indestructible_chance	
		};
		return rarities;
	}

	public RouletteWheel<Integer> createIndestructibleRoulette() {
		return new RouletteWheel<>(getIndestructible(), getIndestructibleRarity());
	}
}
