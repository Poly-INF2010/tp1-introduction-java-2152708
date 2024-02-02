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
        BaseShape letterA = new Rectangle(new Point2d(halfStripeThickness, maxHeight));
        letterA.rotate(letterA.getCoords(), Math.toRadians(10));
        BaseShape rightStripe = new Rectangle(new Point2d(halfStripeThickness, maxHeight));
        rightStripe.rotate(rightStripe.getCoords(), Math.toRadians(350));
        rightStripe.translate(rightStripe.getCoords(), new Point2d(maxWidth*0.6, 0.0));

        BaseShape stripe = new Rectangle(new Point2d(halfMaxWidth, halfStripeThickness));
        stripe.translate(stripe.getCoords(), new Point2d(halfMaxWidth*0.6, 10.0));
        letterA.add(rightStripe);
        letterA.add(stripe);
        return letterA;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        BaseShape letterB = new Rectangle(new Point2d(stripeThickness, maxHeight));

        BaseShape topCircle = new Circle(halfMaxHeight);
        topCircle.remove(new Circle(halfMaxHeight - stripeThickness - 5));

        topCircle.translate(topCircle.getCoords(), new Point2d(halfMaxWidth, halfMaxHeight/2));

        BaseShape bottomCircle = topCircle.clone();
        bottomCircle.translate(bottomCircle.getCoords(), new Point2d(0.0, -halfMaxHeight));

        letterB.add(topCircle);
        letterB.add(bottomCircle);
        return letterB;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        BaseShape letterC = create_O();

        BaseShape rectangleToEmpty = new Square(halfMaxHeight);
        rectangleToEmpty.translate(rectangleToEmpty.getCoords(), new Point2d(halfMaxWidth + stripeThickness, 0.0));

        letterC.remove(rectangleToEmpty);
        return letterC;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        BaseShape letterE = new Rectangle(new Point2d(stripeThickness, maxHeight));
        BaseShape horizontalStripe = new Rectangle(new Point2d(maxWidth, halfStripeThickness));
        horizontalStripe.translate(horizontalStripe.getCoords(), new Point2d(halfMaxWidth, 0.0));

        BaseShape topStripe = horizontalStripe.clone();
        BaseShape botStripe = horizontalStripe.clone();
        topStripe.translate(topStripe.getCoords(), new Point2d(0.0, halfMaxHeight-halfStripeThickness/2));
        botStripe.translate(botStripe.getCoords(), new Point2d(0.0, -(halfMaxHeight-halfStripeThickness/2)));

        letterE.add(horizontalStripe);
        letterE.add(topStripe);
        letterE.add(botStripe);
        return letterE;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        BaseShape letterH = new Rectangle(new Point2d(halfStripeThickness, maxHeight));
        BaseShape horizontalStripe = new Rectangle(new Point2d(maxWidth, halfStripeThickness));
        horizontalStripe.translate(horizontalStripe.getCoords(), new Point2d(halfMaxWidth, 0.0));

        BaseShape rightVerticalStripe = new Rectangle(new Point2d(halfStripeThickness, maxHeight));
        rightVerticalStripe.translate(rightVerticalStripe.getCoords(), new Point2d(maxWidth, 0.0));

        letterH.add(horizontalStripe);
        letterH.add(rightVerticalStripe);
        return letterH;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        BaseShape letterN = new Rectangle(new Point2d(stripeThickness, maxHeight));

        BaseShape tiltedStripe = new Rectangle(new Point2d(halfStripeThickness, maxHeight));
        tiltedStripe.rotate(tiltedStripe.getCoords(), Math.toRadians(340));
        tiltedStripe.translate(tiltedStripe.getCoords(), new Point2d(halfMaxWidth, 0.0));

        BaseShape rightVerticalStripe = new Rectangle(new Point2d(stripeThickness, maxHeight));
        rightVerticalStripe.translate(rightVerticalStripe.getCoords(), new Point2d(maxWidth, 0.0));

        letterN.add(tiltedStripe);
        letterN.add(rightVerticalStripe);
        return letterN;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        BaseShape letterO = new Ellipse(maxWidth, maxHeight);
        letterO.remove(new Ellipse(maxWidth - stripeThickness, maxHeight - stripeThickness));
        return letterO;
    }

}
