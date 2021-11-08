import ddf.minim.analysis.*;
import ddf.minim.*;

Minim minim;
AudioInput in;
FFT fft;
//int bufferSize = 512;

void setup(){
    size(800,600,P2D);
    background(0);
    minim = new Minim(this);
    in = minim.getLineIn(/*Minim.STEREO, bufferSize*/);//player in
    fft = new FFT(in.bufferSize(), in.sampleRate());////////////
}

void draw(){
    background(0);
    noFill();
    stroke(255);
    fft.forward(in.mix);
    strokeWeight(10);
    for (int i=1;i<fft.specSize(); i++){
        ellipse(width/2,height/2,fft.getBand(i)*30,fft.getBand(i)*30);
    }

}