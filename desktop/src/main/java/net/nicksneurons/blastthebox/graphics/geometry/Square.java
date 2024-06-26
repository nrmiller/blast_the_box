package net.nicksneurons.blastthebox.graphics.geometry;
;
import org.joml.Vector2d;
import org.joml.Vector3d;

import static org.lwjgl.opengl.GL33.*;

public class Square extends Primitive
{
	private Vector3d vloc;
	public Vector2d dim;
	private int X_iterations, Y_iterations;
	
	public Square()
	{
		this(new Vector3d(0, 0, 0), new Vector2d(1, 1), 1);
	}
	public Square(Vector3d loc, Vector2d size)
	{
		this(loc, size, 1);
	}
	public Square(Vector3d loc, Vector2d size, int texture_iterations)
	{
		this(loc, size, texture_iterations, texture_iterations);
	}
	public Square(Vector3d loc, Vector2d size, int X_iterations, int Y_iterations)
	{
		vloc = loc;
		dim = size;
		this.X_iterations = X_iterations;
		this.Y_iterations = Y_iterations;

		init();
	}
	
	@Override
	public int getRenderingMode()
	{
		return GL_TRIANGLES;
	}
	
	@Override
	public float[] getVertexArray()
	{
		//Creates a centered Square
		float[] vertices =
		{
			(float)(vloc.x), (float)(vloc.y+dim.y), (float)vloc.z,
			(float)(vloc.x), (float)(vloc.y), (float)vloc.z,
			(float)(vloc.x+dim.x),(float)(vloc.y), (float)vloc.z,
			(float)(vloc.x+dim.x), (float)(vloc.y+dim.y), (float)vloc.z
		};
		return vertices;
	}

	@Override
	public float[] getColorArray()
	{
		return getVertexArray();
	}

	@Override
	public float[] getTexCoordArray()
	{
		float[] texCoords = 
		{
			0, 0,
			0, Y_iterations,
			X_iterations, Y_iterations,
			X_iterations, 0
		};
		return texCoords;
	}
	
	@Override
	public short[] getIndexArray()
	{
		short[] indices = 
		{
				0, 1, 2, 0, 2, 3
		};
		return indices;
	}
	@Override
	public float[] getNormalArray()
	{
		float[] normals = 
		{
			0, 0, 1,
			0, 0, 1
		};
		return normals;
	}
	
//	public boolean isTouched(Point2d p)
//	{
//		return (p.x >= loc.x && p.x < loc.x + scale.width &&
//		p.y >= loc.y && p.y < loc.y + scale.height);
//	}
}
