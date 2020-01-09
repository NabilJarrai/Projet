package shapes;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.QuadCurve2D;
import java.util.ArrayList;

/**
 * @author Moses Muigai Gitau
 */
public class MCloudCallOut extends MPointsShape {

    public MCloudCallOut(MShapeProperties properties) {
        super(properties);
    }
    @Override
    public void shapeFill(Graphics2D g) {
        int xPoints[] = {
            start.x + (end.x - start.x) / 2,
            end.x,
            end.x,
            start.x,
            start.x};
        int yPoints[] = {
            start.y,
            start.y + (end.y - start.y) * 1 / 3,
            end.y,
            end.y, start.y + (end.y - start.y) * 1 / 3};
        g.fillPolygon(xPoints, yPoints, 5);
    }

    @Override
    public void shapeOutline(Graphics2D g) {
        int xPoints[] = { start.x + (end.x - start.x) / 2,    end.x,   end.x, start.x , start.x};
        int yPoints[] = {start.y, start.y + (end.y - start.y) * 1 / 3, end.y, end.y, start.y + (end.y - start.y) * 1 / 3};
        g.drawPolygon(xPoints, yPoints, 5);
    }
}
