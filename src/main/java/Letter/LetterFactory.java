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
        BaseShape letterA = new BaseShape();

        Rectangle leftStripe = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle rightStripe = leftStripe.clone();
        Rectangle horizontalStripe = new Rectangle(halfMaxWidth, halfStripeThickness);

        leftStripe.rotate(leftStripe.getCoords(), Math.toRadians(-15));
        leftStripe.translate(leftStripe.getCoords(), new Point2d(stripeThickness, 0.0));
        rightStripe.rotate(rightStripe.getCoords(), Math.toRadians(15));
        rightStripe.translate(rightStripe.getCoords(), new Point2d(-stripeThickness, 0.0));
        horizontalStripe.translate(horizontalStripe.getCoords(), new Point2d(0.0, stripeThickness));

        letterA.add(leftStripe);
        letterA.add(rightStripe);
        letterA.add(horizontalStripe);

        return letterA;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        BaseShape letterB = new BaseShape();

        Rectangle stripe = new Rectangle(stripeThickness, maxHeight);
        Circle topOutsideBubble = new Circle(halfMaxHeight);
        Circle topInsideBubble = new Circle(maxWidth);
        Circle bottomOutsideBubble = new Circle(halfMaxHeight);
        Circle bottomInsideBubble = new Circle(maxWidth);

        stripe.translate(stripe.getCoords(), new Point2d(-halfMaxWidth, 0.0));

        topOutsideBubble.translate(topOutsideBubble.getCoords(), new Point2d(0.0, halfMaxWidth+halfStripeThickness));
        topInsideBubble.translate(topInsideBubble.getCoords(), new Point2d(0.0, halfMaxWidth+halfStripeThickness));

        bottomOutsideBubble.translate(bottomOutsideBubble.getCoords(), new Point2d(0.0, -halfMaxWidth));
        bottomInsideBubble.translate(bottomInsideBubble.getCoords(), new Point2d(0.0, -halfMaxWidth));

        letterB.add(stripe);
        letterB.add(topOutsideBubble);
        letterB.remove(topInsideBubble);
        letterB.add(bottomOutsideBubble);
        letterB.remove(bottomInsideBubble);

        return letterB;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        BaseShape letterC = new BaseShape();

        Rectangle stripe = new Rectangle(halfMaxWidth,halfMaxHeight);
        Ellipse outerCircle = new Ellipse(maxWidth,maxHeight);
        Ellipse innerCircle = new Ellipse(halfMaxWidth, maxHeight);

        stripe.translate(stripe.getCoords(), new Point2d(stripeThickness,0.0));

        letterC.add(outerCircle);
        letterC.remove(innerCircle);
        letterC.remove(stripe);

        return letterC;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        BaseShape letterE = new BaseShape();

        Rectangle verticalStripe = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle horizontalStripe = new Rectangle(maxWidth, halfStripeThickness);
        Rectangle topHorizontalStripe = horizontalStripe.clone();
        Rectangle bottomHorizontalStripe = horizontalStripe.clone();

        verticalStripe.translate(verticalStripe.getCoords(), new Point2d(-stripeThickness, 0.0));
        topHorizontalStripe.translate(topHorizontalStripe.getCoords(), new Point2d(halfStripeThickness, halfMaxHeight));
        bottomHorizontalStripe.translate(bottomHorizontalStripe.getCoords(), new Point2d(halfStripeThickness, -halfMaxHeight));
        horizontalStripe.translate(horizontalStripe.getCoords(), new Point2d(halfStripeThickness, 0.0));

        letterE.add(verticalStripe);
        letterE.add(horizontalStripe);
        letterE.add(topHorizontalStripe);
        letterE.add(bottomHorizontalStripe);

        return letterE;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        BaseShape letterH = new BaseShape();

        Rectangle leftStripe = new Rectangle(stripeThickness,maxHeight);
        Rectangle rightStripe = leftStripe.clone();
        Rectangle horizontalStripe = new Rectangle(maxWidth, stripeThickness);

        leftStripe.translate(leftStripe.getCoords(), new Point2d(-halfMaxWidth, 0.0));
        rightStripe.translate(rightStripe.getCoords(), new Point2d(halfMaxWidth, 0.0));

        letterH.add(leftStripe);
        letterH.add(rightStripe);
        letterH.add(horizontalStripe);

        return letterH;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        BaseShape letterN = new BaseShape();

        Rectangle leftVerticalStripe = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle rightVerticalStripe = leftVerticalStripe.clone();
        Rectangle diagonalStripe = leftVerticalStripe.clone();

        leftVerticalStripe.translate(leftVerticalStripe.getCoords(), new Point2d(-halfMaxWidth, 0.0));
        rightVerticalStripe.translate(rightVerticalStripe.getCoords(), new Point2d(halfMaxWidth,0.0));
        diagonalStripe.rotate(diagonalStripe.getCoords(), Math.toRadians(-20));

        letterN.add(leftVerticalStripe);
        letterN.add(rightVerticalStripe);
        letterN.add(diagonalStripe);

        return letterN;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        BaseShape letterO = new BaseShape();

        letterO.add(new Ellipse(maxWidth, maxHeight));
        letterO.remove(new Ellipse(halfMaxWidth, maxHeight));

        return letterO;
    }

}
