int x;
int y;
void setup(){
  size(800,600);
}
void draw(){
background(0,180,255);
fill(130,130,130);
ellipse(x, y, 40, 40);
if (x<=20){
 x++; 
}
if (x>=780){
  x--;
}
if (y<=20){
  y++;
}
if (y>=580){
  y--;
}

}
void keyPressed()
{
      if(key == CODED){
            if(keyCode == UP)
            {
y=y-5;
}
            else if(keyCode == DOWN)
            {
                  y=y+5;
            }
            else if(keyCode == RIGHT)
            {
                  x=x+5;
            }
            else if(keyCode == LEFT)
            {
                  x=x-5;
            }
      }
      
}


class car{
int carX;
int carY;
int size;
int speed;
public car(int carX, int carY, int size, int speed){
  this.carX=carX;
  this.carY=carY;
  this.size=size;
  this.speed=speed;
}
void display() 
{
      fill(0,255,0);
      rect(x , y, size, 50);
}
}