package Shape;

import Point.Point2d;

import java.util.Collection;

public class Rectangle extends BaseShape {
    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     */
    public Rectangle(Double width, Double height) {
        Double initialX = -width/2;
        Double initialY = -height/2;
        Double finalX = width/2;
        Double finalY = height/2;
        for(Double i = initialX ; i < finalX ; i += 0.5){
            for(Double j = initialY ; j < finalY ; j += 0.5){
                add(new Point2d(i,j));
            }

        }
    }

    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param dimensions 2D point containing the width and height of the rectangle
     */
    public Rectangle(Point2d dimensions) {
        Double initialX = -dimensions.X()/2;
        Double initialY = -dimensions.Y()/2;
        Double finalX = dimensions.X()/2;
        Double finalY = dimensions.Y()/2;
        for(Double i = initialX ; i < finalX ; i += 0.5){
            for(Double j = initialY ; j < finalY ; j += 0.5){
                add(new Point2d(i,j));
            }

        }
    }

    /**
     * Create a rectangle from a given collection of Points
     * @param coords The collection of 2D points
     */
    private Rectangle(Collection<Point2d> coords) {
        addAll(coords);
    }

    /** TODO
     * @return Deep copy of the rectangle
     */
    @Override
    public Rectangle clone() {
        return new Rectangle(cloneCoords());
    }
}
