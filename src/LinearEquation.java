public class LinearEquation {
    public class LinearEquationLogic {
        private int x1 = 0;
        private int x2 = 0;
        private int y1 = 0;
        private int y2 = 0;
    }


    public LinearEquationLogic(int x1, int x2, int y1, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }


    private double yIntercept(){
        double slope = slope();
        double yIntercept = (y1- (x1-slope));
        return round(yIntercept);

    }
    private double distance() {
        double d = Math.sqrt(Math.pow(x2-x1, 2)) + Math.pow(y2 - y1, 2)));
    return rounded(slope);

    }
    private double slope (){
        double s = (y2-y1)/(x2-x1);
        return rounded(slope);

    }
    private String equation(){


    }

        private coordinate
    private double round (double toRound) {
        return Math.round(toRound * 100) / 100.0;
    }
}
