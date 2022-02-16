import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
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
    background(200, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    stroke(100);
    line(150, 25, 270, 350);  

    stroke(255);
    line(50, 125, 200, 100);  

    stroke(150);
    line (100, 100, 200, 200);
  
   if (mousePressed) {
      fill(0);
    }  else {
      fill(255);
    }
    line (mouseX, mouseY, 40, 80);
  }

/*
public void draw() {

    if (mousePressed) {
      fill(0);
    } else {
      fill(255);
    }
    ellipse(mouseX, mouseY, 80, 80);
  }
*/

  
}
  // define other methods down here.