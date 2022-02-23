/*
Name: Aston
Date: 2/23/2022
Project: Processing Task
*/


import processing.core.PApplet;

public class Sketch extends PApplet {
  int rotationT = 0;
  int rotateVar = 0;
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(184, 255, 244);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    noStroke();
    fill(0, 176, 67);
    ellipse(200, 325, 400, 60);
    
    noStroke();
    fill(0, 176, 67);
    rect(0, 325, 400, 325);

    stroke(0);
    fill(250, 255, 67);
    ellipse(400, 0, 60, 60);

    stroke(0);
    noFill();
    bezier(200, 250, 180, 335, 220, 295, 200, 365);

    stroke(0);
    fill(0);
    ellipse(200, 175, 25, 30);

    translate(200, 175);
    //pushMatrix();

    while (rotationT < 9){
      stroke(0);
      fill(200, 0, 10);
      ellipse(0, 40, 25, 80);

      rotate(radians(rotateVar + 45));

      stroke(0);
      fill(200, 0, 10);
      ellipse(0, 40, 25, 80);


      rotationT += 1; 
      
      rotateVar += 45; 
      System.out.println(rotationT);
      }
  }

  
}
  // define other methods down here.