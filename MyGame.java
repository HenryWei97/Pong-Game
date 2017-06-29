import processing.core.PApplet;
public class MyGame extends PApplet{
	int score1 = 0;
	int score2 = 0;
	Paddle player1 = new Paddle( this , 10, 'w','s');
	Paddle player2 = new Paddle(this, 970, 'i', 'k');
	Ball ballz = new Ball(this);
public void setup(){
	size(1000,600);
	}
public void draw(){
	background(0);
	player1.draw();
	player2.draw();
	ballz.draw();
	player1.keyPressed(keyPressed, key);
	player2.keyPressed(mouseY);
	ballz.speed(hitright(), player2);
	ballz.speed(hitleft(), player1);
	score();
	ballz.scoreLeft();
	ballz.scoreRight();
	gameover();
}
public Boolean hitright(){
	if ( ballz.xpos() == player2.xpos()-10 && ballz.ypos() >= player2.ypos() && ballz.ypos() <= player2.ypos()+100){
		return true;
	}
	else{
		return false;
	}
}
public Boolean hitleft(){
	if ( ballz.xpos() == player1.xpos()+30&& ballz.ypos() >= player1.ypos() && ballz.ypos() <= player1.ypos()+100){
		return true;
	}
	else{
		return false;
	}
}

public void score(){
	
	textSize(32);
	text(score1,450,100);
	textSize(32);
	text(":",500,100);
	textSize(32);
	text(score2,550,100);
	if(ballz.scoreLeft()== true){
		score2 ++;
	}
	else if(ballz.scoreRight()== true){
		score1 ++;
		
	}
}
void gameover(){
	if(score1 == 10){
		textSize(50);
		text("player 1 wins",300,500);
		ballz.done();
	}
	else if(score2 == 10){
		textSize(50);
		text("player 2 wins",300,500);
		ballz.done();
	}
}

public static void main ( String args [] ) {
 PApplet.main ( new String [] { "MyGame" } ) ;
 }}

