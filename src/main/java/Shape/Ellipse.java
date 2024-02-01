package Shape;

import Point.Point2d;
import java.util.Collection;

public class Ellipse extends BaseShape {

    private Boolean pointIsInEllipse(Double x, Double y, Double widthDiameter, Double heightDiameter){
        Double x_carre=Math.pow(x,2.0);
        Double y_carre=Math.pow(y,2.0);
        Double a_carre=Math.pow(widthDiameter/2,2.0);
        Double b_carre=Math.pow(heightDiameter/2,2.0);
        return x_carre/a_carre+y_carre/b_carre < 1.0;
    }
    /** TODO
     * Create a filled Ellipse that is centered on (0, 0)
     * @param widthDiameter Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */
    public Ellipse(Double widthDiameter, Double heightDiameter) {
        Double leftCoord_X = -widthDiameter/2;
        Double rightCoord_X = widthDiameter/2;
        Double bottomCoord_Y = -heightDiameter/2;
        Double topCoord_Y = heightDiameter/2;

        for(Double x = leftCoord_X ; x < rightCoord_X ; x += 0.5){
            for(Double y = bottomCoord_Y ; y < topCoord_Y ; y += 0.5){
                if(pointIsInEllipse(x,y,widthDiameter,heightDiameter)){
                    add(new Point2d(x,y));
                }
            }
        }
    }

    /** TODO
     * Create a filled Ellipse that is centered on (0,0)
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {
        this(dimensions.X(),dimensions.Y());
    }

    /**
     * Create an Ellipse from a given collection of 2D points
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {
        super();
        addAll(coords);
        Point2d closestMissingCoordinate = getMaxCoord();
        for(Double x = getMinX() ; x < getMaxX() ; x += 0.5){
            for(Double y = getMinY() ; y < getMaxY() ; y += 0.5){
                if(!coords.contains(new Point2d(x,y))){
                    closestMissingCoordinate = new Point2d(x,y);
                }
            }
        }
        if(getMaxCoord() != closestMissingCoordinate){
            closestMissingCoordinate.add(-0.5);
            Double widthDiameter = 0.5;
            Double heightDiameter = 0.5;
            Ellipse growingEllipse = new Ellipse(widthDiameter, heightDiameter);
            while(!growingEllipse.getCoords().contains((closestMissingCoordinate))){
                growingEllipse = new Ellipse(widthDiameter, heightDiameter);
                widthDiameter+=0.5;
                heightDiameter+=0.5;
            }
        }
    }

    /** TODO
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {
        return new Ellipse(cloneCoords());
    }
}
