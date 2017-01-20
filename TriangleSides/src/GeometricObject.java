/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danielle
 */
import java.util.Date;
public class GeometricObject 
{
	private String color;
	private boolean filled;
	private Date DateCreated;
	public GeometricObject()
	{
		color = "White";
		filled = false;
		DateCreated = new Date();
	}
	public GeometricObject(String _color, boolean _filled)
	{
		color = _color;
		filled = _filled;
		DateCreated = new Date();
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String _color)
	{
		color = _color;
	}
	public boolean isFilled()
	{
		return filled;
	}
	public void setIsFilled(boolean _filled)
	{
		filled = _filled;
	}
	public Date getDateCreated()
	{
		return DateCreated;
	}
	public String toString()
	{
		return "Filled = " + filled + " color = " + color +" date-created = " + DateCreated;
	}
}

