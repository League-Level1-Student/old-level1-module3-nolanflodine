int x=125;
float y=250;
float birdYVelocity = 0;
float gravity = 0.15;
int rectX=500;
int rectY=0;
int gap=150;
int upperPipeHeight=(int) random(100, 300); 
int lowerY=upperPipeHeight+gap;
boolean gameOver=false;
int num=0;
void setup(){
size(500,500);
}
void draw(){
  y+=birdYVelocity;
  birdYVelocity += gravity;
  background(70,200,70);
  stroke(100,100,100);
  fill(240,225,138);
  ellipse(x,y,50,50);
    fill(70,70,255);
    rect(rectX, rectY, 80, upperPipeHeight);
    rect(rectX, lowerY, 80, 999999999);
    rectX=rectX-5;
    y=y+gravity;
    fill(255,0,0);
      text(num,400,20);
    if (rectX<-80){
      rectX=500;
  upperPipeHeight=(int) random(100, 400);
  lowerY = upperPipeHeight+gap;
  num++;
    }
  if(intersectsPipes()){
gameOver=true;
  }
if (gameOver){
  background(0,0,0);
  fill(255,0,0);
  textSize(36);
  text("Game Over", 170,250);
}
if(y>=500){
  gameOver=true;
}
}


  void mousePressed(){
birdYVelocity=-3.35;
}

boolean intersectsPipes() { 
     if (y < upperPipeHeight && x > rectX && x < (rectX+80)){
          return true; }
     else if (y>lowerY && x > rectX && x < (rectX+80)) {
          return true; }
     else { return false; }
}