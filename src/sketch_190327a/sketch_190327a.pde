int x=25;
int y=250;
int birdYVelocity = 30;
int gravity = 1;
int rectX=500;
int rectY=0;
int upperPipeHeight = (int) random(100, 400);
void setup(){
size(500,500);
}
void draw(){
  background(0,255,0);
  fill(255,0,255);
  stroke(255, 255, 74);
  ellipse(x,y,50,50);
    fill(0,0,255);
    rect(rectX, rectY, 80, upperPipeHeight);
    rectX--;
    y=y+gravity;
    if (rectX<-80){
      rectX=500;
    }
  }
  void mousePressed(){
     y=y-birdYVelocity;

}