PImage backgroundImage;
import ddf.minim.*;
  Minim minim;
  AudioSample sound;
int x = 100;
double xSpeed = 10;
int y = 0;
double ySpeed = 15;
void setup(){
   backgroundImage = loadImage("pong.jpeg");
size (500, 500);
frameRate(60);
 minim = new Minim (this);
  sound = minim.loadSample("159376__greenhourglass__boing1.wav", 128);
}

void draw(){
 image(backgroundImage, 0, 0);
    image(backgroundImage, 0, 0, width, height);
fill(255, 0, 0);
stroke(255);
ellipse(x, y, 15, 15);
x+=xSpeed;
if(x > width){
xSpeed*=-1;
  sound.trigger();
}
if(x< 0){
xSpeed*=-1;
  sound.trigger();
}

y+=ySpeed;
if(y > height){
ySpeed*=-1;
  sound.trigger();
}
if(y< 0){
ySpeed*=-1;
  sound.trigger();
}
}
