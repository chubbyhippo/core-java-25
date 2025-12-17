package io.github.chubbyhippo.v2ch10.draw;

import module java.desktop;

class DrawDemo {

}

/**
 * A component that displays rectangles and ellipses
 */

class DrawComponent extends JComponent {
    private static final int DEFAULT_WIDTH = 400;
    private static final int DEFAULT_HEIGHT = 400;

    public void paintComponent(Graphics g) {
        var g2 = (Graphics2D) g;

        // draw a rectangle
        double leftX = 100;
        double topY = 100;
        double width = 200;
        double height = 150;

    }

}



