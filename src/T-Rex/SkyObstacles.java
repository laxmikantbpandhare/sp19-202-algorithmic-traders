import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstacles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SkyObstacles extends Composite
{
    private int y;
    //private int x = 300;
    private int i;
    private int x;
    int time_counter =0;
    long pauseTime = 0;
    /**
     * Act - do whatever the Obstacles wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        display();
    }
    
    public void display() {
        int x1 = 1200;
        for(i=0;i<components.size();i++){
            System.out.println("x1 = "+x1);
            System.out.println("Current Actor ="+ (Actor)components.get(i));
            Actor current = (Actor)components.get(i);
            y = 280;
            getWorld().addObject((Actor)components.get(i),x1,y);
            if(i >= 2) {
                System.out.println("i 2");
                x1+= 250;
            } else {
                x1+= 750;
            }
            
            System.out.println("x1 = "+x1);
            System.out.println("x = "+x);
            
        
    }
        
    }
    public void removeall(LandObstacles obstacles){
        //getWorld.remove();
        System.out.println("Removing here");
        MyWorld world = getWorldOfType(MyWorld.class);
        System.out.println("Printing objects");
        //List<Actor> actors = new ArrayList<Actor>();
        //getWorld().getObjects(Clouds.class);
        for (Object obj : world.getObjects(Cactus.class)){ 
            getWorld().removeObject((Actor)obj);
        }
        //for (int i=0; i<actors.size(); i++){
        //    System.out.println(actors.get(i));
        //}
        //world.removeObject(world.getObjects());
        //for (int i = 0; i<obstacles.components.size(); i++){
        //    world.removeObject((Actor)obstacles.components.get(i));
        //}
        
        
        components.clear();
    }
}
