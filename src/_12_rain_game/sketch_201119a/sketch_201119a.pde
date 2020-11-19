int raindropY = 0;
int randomNumber = (int) random(width);
int score = 0;

public void setup(){
  
  size(500,500);
  
}

public void draw(){
  
  background(#FCB524);
  fill(#708FE8);
  stroke(#050505);
  ellipse(randomNumber,raindropY,60,100);
  raindropY ++;
  if(raindropY == 550){
    raindropY = 0;
  randomNumber = (int) random(width);
}
  rect(mouseX, 400, 100, 150);
   fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
    if(raindropY == 400){
      checkCatch(randomNumber);}
    }
    
    void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
        
    }
