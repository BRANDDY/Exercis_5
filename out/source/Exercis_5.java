/* autogenerated by Processing revision 1276 on 2021-11-08 */
import processing.core.*;
import processing.data.*;
import processing.event.*;
import processing.opengl.*;

import ddf.minim.analysis.*;
import ddf.minim.*;

import java.util.HashMap;
import java.util.ArrayList;
import java.io.File;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class Exercis_5 extends PApplet {




Minim minim;
AudioInput in;
FFT fft;
//int bufferSize = 512;

 public void setup(){
    /* size commented out by preprocessor */;
    background(0);
    minim = new Minim(this);
    in = minim.getLineIn(/*Minim.STEREO, bufferSize*/);//player in
    fft = new FFT(in.bufferSize(), in.sampleRate());////////////
}

 public void draw(){
    background(0);
    noFill();
    stroke(255);
    fft.forward(in.mix);
    strokeWeight(10);
    for (int i=1;i<fft.specSize(); i++){
        ellipse(width/2,height/2,fft.getBand(i)*30,fft.getBand(i)*30);
    }

}


  public void settings() { size(800, 600, P2D); }

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Exercis_5" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
