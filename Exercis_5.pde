import ddf.minim.analysis.*;
import ddf.minim.*;

Minim minim;
AudioInput in;
FFT fft;

void setup(){
    size(800,600,P2D);
    background(0);
    
    minim = new Minim(this);
    in = minim.getLineIn();//player in
    fft = new FFT(in.buffferSize(), in.sampleRate());////////////
    colorMode(255);
}

void draw(){
    background(0);
    noFill();
    stroke(0);
    fft.forward(in.mix);
    //amp = in.mix.level();
    for (int i=i;i<fft.specSize(); i++){
        ellipse(width/2,height/2,fft.getBand(i)*8,fft.getBand(i)*8);
    }

}