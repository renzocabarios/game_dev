import java.awt.*;
import java.util.Random;

public class FallingBlock extends GameObject{

    Random r;
    Handler handler;
    public FallingBlock(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        
        this.handler = handler;
        
        r = new Random();

        velY = r.nextInt(3)+1;
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(x, y, 32, 32);
    }


    @Override
    public void tick() {
        y += velY;

        if(getY() >= Game.HEIGHT){
            setY(0 - 32);
            setX(r.nextInt(Game.WIDTH-51));
            
            handler.addObject(new FallingBlock(r.nextInt(Game.WIDTH-51)+1, 0, ID.Enemy, this.handler));
        }
    }

    @Override
    public void render(Graphics g) {


        g.setColor(Color.RED);
        g.fillRect(x, y, 32, 32);
    }
}
