import processing.core.PApplet;

public class FourBalls extends PApplet {
    class Ball{
        private static final int diameter = 10;
        private int ballHeight;
        private int ballSpeed;
        private int ballPosition;

        public Ball(int ballHeight, int ballSpeed, int ballPosition) {
            this.ballHeight = ballHeight;
            this.ballSpeed = ballSpeed;
            this.ballPosition = ballPosition;
        }
    }
    public static final int HEIGHT = 500;
    public static final int WIDTH = 600;
    public static final int oneFifthOfHeight = HEIGHT / 5;
    public static final int ballPosition = 1;
    public static final int ballOneSpeed = 1;
    public static final int ballTwoSpeed = 2;
    public static final int ballThreeSpeed = 3;
    public static final int ballFourSpeed = 4;
    private Ball ball1;
    private Ball ball2;
    private Ball ball3;
    private Ball ball4;

    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        ball1 = new Ball(oneFifthOfHeight * 1, ballOneSpeed, ballPosition);
        ball2 = new Ball(oneFifthOfHeight * 2, ballTwoSpeed, ballPosition);
        ball3 = new Ball(oneFifthOfHeight * 3, ballThreeSpeed, ballPosition);
        ball4 = new Ball(oneFifthOfHeight * 4, ballFourSpeed, ballPosition);
    }

    @Override
    public void draw() {
        drawCircle(ball1);
        drawCircle(ball2);
        drawCircle(ball3);
        drawCircle(ball4);
    }

    private void drawCircle(Ball ball) {
            ellipse(ball.ballPosition, ball.ballHeight, Ball.diameter, Ball.diameter);
            ball.ballPosition += ball.ballSpeed;
    }

}
