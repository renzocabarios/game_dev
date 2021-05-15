import java.awt.*;
import java.awt.event.KeyEvent;

public class Player extends GameObject{

    Handler handler;

    public Player(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        this.handler = handler;

    }


    @Override
    public Rectangle getBounds() {
        return new Rectangle(x, y, 32, 32);
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;

        x = Game.clamp(x, 0, Game.WIDTH-49);
        y = Game.clamp(y, 3, Game.HEIGHT-75);

        collision();
    }

    private void collision(){
        for(int i = 0; i < handler.object.size(); i++){

            GameObject tempObject = handler.object.get(i);

            if(tempObject.getId() == ID.Enemy){
                if(getBounds().intersects(tempObject.getBounds())){
                    System.exit(1);
                }

            }

        }
    }

    @Override
    public void render(Graphics g) {


        Graphics2D g2d = (Graphics2D) g;

        g.setColor(Color.BLUE);
        g2d.draw(getBounds());
        //g.fillRect(x, y, 32, 32);
    }




}
