PImage pictureOfRecord; 

int speed = 1;

public void setup(){
       size(600,600);  
        pictureOfRecord= loadImage("record.png");
             pictureOfRecord.resize(600,600);
}

public void draw(){
    speed ++; 
    if(mousePressed){
    rotateImage(pictureOfRecord, speed); }
    image(pictureOfRecord, 0, 0);
 
}

 void rotateImage(PImage pictureOfRecord, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-pictureOfRecord.width/2, -pictureOfRecord.height/2);
    }
