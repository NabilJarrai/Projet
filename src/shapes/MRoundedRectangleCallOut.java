package shapes;

import shapes.MArrow;
import shapes.MPointsShape;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import paint.Canvas;

/**
 * @author Moses Muigai Gitau
 */
public class MRoundedRectangleCallOut extends MPointsShape {

    public MRoundedRectangleCallOut(MShapeProperties properties) {
        super(properties);
    }

    @Override
    public void shapeFill(Graphics2D g) {
        int xPoints[] = {
        		start.y + (end.y - start.y) * 1 / 4,
                end.x *3/ 4,
                end.x,
                end.x,
                start.x + (end.x - start.x) / 2,
                start.y + (end.y - start.y) * 1 / 4,
                start.x,
                start.x};
        int yPoints[] = {
        		start.y,
                start.y,
                start.y + (end.y - start.y) * 1 / 4,
                start.y + (end.y - start.y) * 3 / 4,
                end.y,
                end.y,
                start.y + (end.y - start.y) * 3 / 4,
                start.y + (end.y - start.y) * 1 / 4};
        g.fillPolygon(xPoints, yPoints, 7);
    }

    @Override
    public void shapeOutline(Graphics2D g) {
        int xPoints[] = {
        	end.x * 1 / 4,
        	end.x *3/ 4,
            end.x,
            end.x,
            end.x*3/4,
            end.x * 1 / 4,
            start.x,
            start.x};
        int yPoints[] = {
        	start.y,
            start.y,
            start.y + (end.y - start.y) * 1 / 4,
            start.y + (end.y - start.y) * 3 / 4,
            end.y,
            end.y,
            start.y + (end.y - start.y) * 3 / 4,
            start.y + (end.y - start.y) * 1 / 4};
        g.drawPolygon(xPoints, yPoints, 7);
    }
}
