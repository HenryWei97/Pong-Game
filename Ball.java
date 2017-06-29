import processing.core.PApplet;
public class Ball extends PApplet{
	private int x;
	private int y;
	private int size;
	PApplet parent;
	private int speed;
	private int xspeed;
	public Ball(PApplet p){
		this.parent = p;
		this.x = 500;
		this.y = 300;
		this.size = 25;
	}
	public void draw(){
		parent.ellipse(x,y,size,size);
		x += xspeed;
		y += speed;
		if (y == 0|| y == 600){
			speed = speed*(-1);
		}
		
	}
	public int xpos(){
		return x;
	}
	public int ypos(){
		return y;
	}
	public void speed(boolean hit, Paddle p){
		if (hit == true){
			xspeed = xspeed * -1;
			if(p.ypos()+50 > y){
			speed = -abs(speed);
				

			}
			
			else{
				speed = abs(speed);
				
			}
		}
	}
	public boolean scoreLeft(){
		if (x < 0){
			x = 500;
			y = 300;
			xspeed = xspeed *-1;
			return true;
		}
		else{
			return false;
		}
	}
	public boolean scoreRight(){
		if (x > 1000){
			x = 500;
			y = 300;
			xspeed = xspeed *-1;
			return true;
		}
		else{	
			return false;
		}
	}
	public void done(){
		xspeed=0;
		speed=0;
	}
	
	
	
	
	
}
