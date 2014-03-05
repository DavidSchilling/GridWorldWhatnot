package critters;

import java.awt.Color;

import info.gridworld.actor.Rock;

public class Uranium extends Rock
{

	public Uranium(Color passedColor)
	{
		super.setColor(passedColor);
	}
	
	public void act()
	{
		super.setColor(inverseColor(super.getColor()));
	}
	
	private Color inverseColor(Color currentColor)
	{
		int red = currentColor.getRed();
		int green = currentColor.getGreen();
		int blue = currentColor.getBlue();

		Color newColor = new Color(Math.abs(red - 255), Math.abs(green - 255), Math.abs(blue - 255));
		
		return newColor;
	}
}
