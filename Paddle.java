import processing.core.PApplet;

public class Paddle {
	private int x;
	private int y;
	private int w;
	private int l;
	PApplet parent;
	private char up;
	private char down;
	private int change;
	public Paddle(PApplet p, int x , char a, char b){
		this.parent = p;
		this.x = x;
		this.y = 300;
		this.w = 20;
		this.l = 100;
		this.up = a;
		this.down = b;
	
	}
	
	public void draw(){
		parent.rect(x,y,w,l);
		
	}
	public void keyPressed(boolean keyPressed, char key){
		if (keyPressed&&key == up){
			this.y-= 10;
			 if( this.y <= 0){
					this.y = 0;
				}
			
		}
		else if (keyPressed&&key == down){
			this.y+= 10;
			
			 if ( this.y + 70 >= 580){
					this.y = 510;
		}
			
		}	
	}
	public void keyPressed(int y){
		this.y = y;
		if ( this.y + 70 >= 580){
			this.y = 510;
		}
		else if( this.y <= 0){
			this.y = 0;
		}
	}
	public int xpos(){
		return x;
	}
	public int ypos(){
		return y;
	}
}
