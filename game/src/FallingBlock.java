import java.awt.*;

public class FallingBlock extends GameObject{


    public FallingBlock(int x, int y, ID id) {
        super(x, y, id);
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;
    }

    @Override
    public void render(Graphics g) {


        g.setColor(Color.RED);
        g.fillRect(x, y, 32, 32);
    }
}
