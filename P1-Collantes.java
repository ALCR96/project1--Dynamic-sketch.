////Project1-COLLA.java
////by: Ana Collantes

float humanX,humanY;                      ////hero coordinates
float humandx,humandy;                    ////hero speed

float grass;
float sunX,sunY;

void setup () {
  size(800,600);
  grass= height/2.5;
}

void reset() {
  //sunY=50;
 
 
}

void draw() {
  background(211,255,252);        /////sky 
  scene();
  action();
  //show();
  messages();
}

void scene(){
  fill(150,209,145);                    ///grass
  rectMode(CORNERS);
  stroke(0);
  rect(0,grass,width, height);

  fill(244,255,93);                     ///sun
  noStroke();
  ellipse(sunX,sunY,30,30);
  stroke(220,232,59);
  ///up--down (rayos)
  line(sunX,sunY-16,sunX,sunY-24);
  line(sunX,sunY+16,sunX,sunY+24);
  ///left--right (rayos)
  line(sunX-16,sunY,sunX-24,sunY);
  line(sunX+16,sunY,sunX+24,sunY);
  //smaller ones-- right side
  line(sunX+10,sunY-11,sunX+18,sunY-18);
  line(sunX+10,sunY+11,sunX+18,sunY+18);
  //smaller ones-- left side
  line(sunX-10,sunY-11,sunX-18,sunY-18);
  line(sunX-10,sunY+11,sunX-18,sunY+18);

  fill(196,165,247);                    ///house
  stroke(167,117,247);
  rect(20,190,200 ,330);
  triangle(20,190,113,140, 200,190);

  stroke(255);                         ///windows
  fill(168,214,213);
  rect(40,210,90,240);              ///left
  rect(130,210,180,240);            ///right
  stroke(255);
  line(40,225,90,225);              ///left
  line(65,210,65,240);
  line(130,225,180,225);            ///right
  line(155,210,155,240);

  fill(61,62,62);                   ///door
  noStroke();
  rect(90,280,130,329);

  fill(100,80,60);                  ///trees
  rect(310,180,330,290);
  fill(81,129,84);
  ellipse(320,175,60,60);
  fill(100,80,60);
  rect(460,200,480,250);
  fill(81,129,84);
  ellipse(470,185,50,50);
  fill(100,80,60);
  rect(670,220,690,350);
  fill(81,129,84);
  ellipse(680,200,70,70);


  /////////GOLD....
  fill(245,255,116);
  stroke(250,255,185);
  ellipse(mouseX,mouseY, 20,20);

  ///////HERO......
  rectMode(CORNER);
  fill(211,94,64);
  noStroke();
  rect(humanX,humanY,25,40);                           ////body
  fill(250,223,189);
  stroke(250,209,159);
  ellipse(humanX+12,humanY-12,25,25);                  ////head
  fill(255);
  ellipse(humanX+6,humanY-16,13,13);
  ellipse(humanX+18,humanY-16,13,13);
  fill(0);
  noStroke();
  ellipse(humanX+5,humanY-16,6,6);                     ////eyes
  ellipse(humanX+18,humanY-16,6,6);
  fill(62,60,59);
  ellipse(humanX+12,humanY-4,5,5);
  
}
  //sunX=sunX+sunDX;
 /* if (sunX>width) {
  sunX=3;
}
  sunX=sunX+1;
  sunY=40;


 if (humanY>height) {     /////HERO MOVE UP TO DOWN////
  humanY=3;
}
  humanY=humanY+1;
  humanY=210;

/*if (humanX>width) {     /////HERO MOVE LEFT TO RIGHT////
  humanX=600;
}
  humanX=humanX+1;
  humanX=600;
}
*/


void action  () {
  humanX=humanX + (mouseX-humanX) /15;             /////MOVES HERO 
  humanY=humanY+(mouseY-humanY)/15;

 //sunX=sunX+sunDX;
  if (sunX>width) {
  sunX=3;
}
  sunX=sunX+1;
  sunY=40;


/* if (humanY>height) {     /////HERO MOVE LEFT TO RIGHT////
  humanY=3;
}
  humanY=humanY+1;
  humanY=210;
*/

if (humanX > width) {          ////******MOVES CREATURE LEFT,UP,DOWN,RIGHT*******/////
    humanX=  0;
    
  }
  humanX=  humanX + 1;
  // Move the creature.
  humanX=  humanX + humandx;
  humanY=  humanY + humandy;

}

void messages() {
  fill(0);
  text("Kai", humanX+3,humanY+10, 45,45);
}
/*void mousePressed() {
  reset();
  x=mouseX;
  y=mouseY;
} */
