package Letter;

import Point.Point2d;
import Shape.*;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;


    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {
        BaseShape leftRect = new Rectangle(new Point2d(halfStripeThickness, maxHeight));
        leftRect.rotate(leftRect.getCoords(), Math.toRadians(10));
        BaseShape rightRect = new Rectangle(new Point2d(halfStripeThickness, maxHeight));
        rightRect.rotate(rightRect.getCoords(), Math.toRadians(350));
        rightRect.translate(rightRect.getCoords(), new Point2d(maxWidth*0.6, 0.0));

        BaseShape stripe = new Rectangle(new Point2d(halfMaxWidth, halfStripeThickness));
        stripe.translate(stripe.getCoords(), new Point2d(halfMaxWidth*0.6, 10.0));
        leftRect.add(rightRect);
        leftRect.add(stripe);
        return leftRect;
    }

    /**
     * Create a circle graphically
     * @return BaseShape containing a circle
     */
    public static BaseShape createCircle( double radius) {
        BaseShape bigCircle = new Circle(radius);
        BaseShape smallCircle = new Circle(radius - stripeThickness - 5);
        bigCircle.remove(smallCircle);
        return bigCircle;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        BaseShape B = new Rectangle(new Point2d(stripeThickness, maxHeight));
        BaseShape topCircle = createCircle(halfMaxHeight);
        topCircle.translate(topCircle.getCoords(), new Point2d(halfMaxWidth, halfMaxHeight/2));
        BaseShape bottomCircle = topCircle.clone();
        bottomCircle.translate(bottomCircle.getCoords(), new Point2d(0.0, -halfMaxHeight));
        B.add(topCircle);
        B.add(bottomCircle);
        return B;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        BaseShape C = create_O();
        BaseShape rectangleToEmpty = new Square(halfMaxHeight);
        rectangleToEmpty.translate(rectangleToEmpty.getCoords(), new Point2d(halfMaxWidth + stripeThickness, 0.0));
        C.remove(rectangleToEmpty);
        return C;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        BaseShape E = new Rectangle(new Point2d(stripeThickness, maxHeight));
        BaseShape horizontalRectangle = new Rectangle(new Point2d(maxWidth, halfStripeThickness));
        horizontalRectangle.translate(horizontalRectangle.getCoords(), new Point2d(halfMaxWidth, 0.0));
        BaseShape topRectangle = horizontalRectangle.clone();
        BaseShape botRectangle = horizontalRectangle.clone();
        topRectangle.translate(topRectangle.getCoords(), new Point2d(0.0, halfMaxHeight-halfStripeThickness/2));
        botRectangle.translate(botRectangle.getCoords(), new Point2d(0.0, -(halfMaxHeight-halfStripeThickness/2)));
        E.add(horizontalRectangle);
        E.add(topRectangle);
        E.add(botRectangle);
        return E;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        BaseShape H = new Rectangle(new Point2d(halfStripeThickness, maxHeight));
        BaseShape horizontalRectangle = new Rectangle(new Point2d(maxWidth, halfStripeThickness));
        horizontalRectangle.translate(horizontalRectangle.getCoords(), new Point2d(halfMaxWidth, 0.0));
        BaseShape verticalRectangle = new Rectangle(new Point2d(halfStripeThickness, maxHeight));
        verticalRectangle.translate(verticalRectangle.getCoords(), new Point2d(maxWidth, 0.0));
        H.add(horizontalRectangle);
        H.add(verticalRectangle);
        return H;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        BaseShape N = new Rectangle(new Point2d(stripeThickness, maxHeight));
        BaseShape tiltedRectangle = new Rectangle(new Point2d(halfStripeThickness, maxHeight));
        tiltedRectangle.rotate(tiltedRectangle.getCoords(), Math.toRadians(340));
        tiltedRectangle.translate(tiltedRectangle.getCoords(), new Point2d(halfMaxWidth, 0.0));
        BaseShape verticalRectangle = new Rectangle(new Point2d(stripeThickness, maxHeight));
        verticalRectangle.translate(verticalRectangle.getCoords(), new Point2d(maxWidth, 0.0));
        N.add(tiltedRectangle);
        N.add(verticalRectangle);
        return N;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        BaseShape O = new Ellipse(maxWidth, maxHeight);
        BaseShape centerEmptyO = new Ellipse(maxWidth - stripeThickness, maxHeight - stripeThickness);
        O.remove(centerEmptyO);
        return O;
    }

}
