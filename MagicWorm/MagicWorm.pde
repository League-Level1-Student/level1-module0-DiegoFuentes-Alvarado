void setup(){
  size(500, 500);
  background(255);
}

void draw(){
 
  makeMagical();
  for(int i = 0; i < 300; i++){
     fill(frameCount/3*24, 23, i/1.5);
    ellipse(getWormX(i),getWormY(i), i/100, 15);
 
  }
}
    float frequency = .001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }