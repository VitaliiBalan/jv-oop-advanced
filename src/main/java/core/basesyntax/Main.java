package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[6];

        // перша половина - випадкові
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        // друга половина - дефолтні
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        // малюємо всі
        for (Figure figure : figures) {
            ((Drawable) figure).draw();
        }
    }
}
