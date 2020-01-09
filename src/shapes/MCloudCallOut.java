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
        int xPoints[] = {start.x, start.x + (end.x - start.x) / 2, end.x, start.x + (end.x - start.x) / 2};
        int yPoints[] = {start.y + (end.y - start.y) / 2, start.y, start.y + (end.y - start.y) / 2, end.y};
        g.fillPolygon(xPoints, yPoints, 4);
    }

    @Override
    public void shapeOutline(Graphics2D g) {
        int xPoints[] = {start.x, start.x + (end.x - start.x) / 2, end.x, start.x + (end.x - start.x) / 2};
        int yPoints[] = {start.y + (end.y - start.y) / 2, start.y, start.y + (end.y - start.y) / 2, end.y};
        g.drawPolygon(xPoints, yPoints, 4);
    }
}
