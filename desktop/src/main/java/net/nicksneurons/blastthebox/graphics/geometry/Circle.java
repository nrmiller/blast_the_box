package net.nicksneurons.blastthebox.graphics.geometry;

import org.joml.Vector3d;
import org.lwjgl.opengl.GL11;

public class Circle extends Primitive
{
	private Vector3d loc;
	private double radius, height;
	private int strips;
	

	public Circle()
	{
		this(new Vector3d(0.0d, 0.0d, 0.0d), 1.0f, 20);
	}

	/**
	 * Creates a circle along the XZ plane with the specified radius.
	 * The location determines its center point, and the number of strips
	 * will define how circular it is. If strips is 5, for example, then it
	 * will be a pentagon. (6 is hexagon, 8 is octagon, <i>n</i> is <i>ngon</i>).
	 * @param loc - the centerpoint of the circle.
	 * @param radius - the distance from the center point to the circle's edge.
	 * @param strips - the number of vertices along the circle's edge.
	 */
	public Circle(Vector3d loc, float radius, int strips)
	{
		this(loc, radius, strips, 0);
	}
	
	public Circle(Vector3d loc, float radius, int strips, float height)
	{
		this.loc = loc;
		this.radius = radius;
		this.strips = strips;
		this.height = height;

		init();
	}
	
	@Override
	public short[] getIndexArray()
	{
		short[] indices = new short[1 + strips + 1];
		for(int i = 0; i < indices.length - 1; i++)
		{
			indices[i] = (short)i;
		}
		//make the final point connect to the first point of the circle's edge.
		indices[indices.length - 1] = indices[1];
		return indices;
	}

	@Override
	public int getRenderingMode()
	{
		return GL11.GL_TRIANGLE_FAN;
	}

	@Override
	public float[] getTexCoordArray()
	{
		float[] texCoords = new float[2 + strips * 2];
		texCoords[0] = .5f;
		texCoords[1] = .5f;
		
		double angle = 0;
		for(int i = 2; i<texCoords.length; i+=2)
		{
			float cos = (float) (Math.cos(Math.toRadians(angle)));
			float sin = (float) (Math.sin(Math.toRadians(angle)));
			angle += 360.0f / (strips);
			texCoords[i] = (float) ((cos+1)*.5);
			texCoords[i+1] = (float) ((sin+1)*.5);
		}
		
		return texCoords;
	}

	@Override
	public float[] getVertexArray()
	{
		float[] vertices = new float[3 + strips * 3];
		vertices[0] = (float) (loc.x);
		vertices[1] = (float) (loc.y + height);
		vertices[2] = (float) (loc.z);
		
		double angle = 0;
		for(int i = 0; i < vertices.length; i += 3)
		{
			float cos = (float) (Math.cos(Math.toRadians(angle)));
			float sin = (float) (Math.sin(Math.toRadians(angle)));
			angle += 360.0f / (strips);
			
			vertices[i] = (float) (cos * radius + vertices[0]);
			vertices[i+ 1] = (float) vertices[1];
			vertices[i + 2] = (float) (sin * radius + vertices[2]);
		}
		return vertices;
	}

	@Override
	public float[] getColorArray()
	{
		return getVertexArray();
	}

	@Override
	public float[] getNormalArray()
	{
		float[] normals = new float[strips * 3];
		for(int i = 0; i<normals.length; i+=3)
		{
			normals[i] = 0;
			normals[i+1] = 1;
			normals[i+2] = 0;
		}
		return normals;
	}

}
