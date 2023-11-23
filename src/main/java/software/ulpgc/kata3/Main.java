package software.ulpgc.kata3;

public class Main {
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.histogramDisplay().show(histogram());
        mainFrame.setVisible(true);
    }

    private static Histogram histogram() {
        return new Histogram() {
            @Override
            public int bins() {
                return 6;
            }

            @Override
            public double[] values() {
                return new double[]{12, 24, 5, 2, 3, 5, 6, 8, 12, 56, 34, 78, 98, 4, 6, 7};
            }
        };
    }
}
