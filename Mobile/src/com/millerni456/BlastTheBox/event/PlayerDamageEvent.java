package com.millerni456.BlastTheBox.event;

import com.millerni456.BlastTheBox.Player;

public class PlayerDamageEvent
{
	public Player player;
	
	public PlayerDamageEvent(Player p)
	{
		player = p;
	}
}
