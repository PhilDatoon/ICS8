package ICS8_Project;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;

/**
 *
 * @author Datoon, Philip Bryan B.
 * @author Section 4ITD
 * 
 */

public class MoustachePig extends Frame{
    MoustachePig() {
        addWindowListener(new WindowListener() {
            public void windowOpened(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            public void windowClosed(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public void windowIconified(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public void windowDeiconified(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public void windowActivated(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public void windowDeactivated(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        });
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        GeneralPath moust = new GeneralPath();
        GeneralPath moust1 = new GeneralPath();
        GeneralPath nose = new GeneralPath();
        GeneralPath noseL = new GeneralPath();
        GeneralPath noseR = new GeneralPath();
        GeneralPath body = new GeneralPath();
        GeneralPath body1 = new GeneralPath();
        GeneralPath eyeLS = new GeneralPath();
        GeneralPath eyeRS = new GeneralPath();
        GeneralPath eyebrL = new GeneralPath();
        GeneralPath eyebrR = new GeneralPath();
        GeneralPath ear = new GeneralPath();
        GeneralPath shadow1 = new GeneralPath();
        GeneralPath shadow2 = new GeneralPath();
        GeneralPath shadow3 = new GeneralPath();
        GeneralPath shadow4 = new GeneralPath();
        GeneralPath shadow5 = new GeneralPath();
        
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        
        // BODY
        body.moveTo(154, 240);
        body.quadTo(20, 403, 77, 506);
        body.quadTo(124, 611, 362, 604);
        body.quadTo(627, 590, 619, 462);
        body.quadTo(620, 355, 487, 199);
        
        // EARS
        body.moveTo(477, 199);
        body.curveTo(568, 194, 579, 110, 528, 83);
        body.curveTo(467, 60, 439, 95, 437, 164);
        
        body.moveTo(436, 158);
        body.quadTo(319, 91, 206, 185);
        
        body.moveTo(204, 192);
        body.curveTo(221, 116, 157, 100, 118, 125);
        body.curveTo(68, 155, 72, 224, 164, 238);
        
        body1.moveTo(479, 201);
        body1.lineTo(444, 166);
        body1.lineTo(438, 155);
        body1.lineTo(185, 183);
        body1.lineTo(165, 240);
        
        ear.moveTo(172, 211);
        ear.quadTo(137, 210, 125, 191);
        ear.curveTo(118, 172, 122, 166, 140, 154);
        ear.quadTo(169, 143, 179, 169);
        ear.quadTo(189, 194, 172, 211);
        
        ear.moveTo(468, 170);
        ear.curveTo(500, 174, 522, 161, 520, 140);
        ear.quadTo(518, 111, 485, 115);
        ear.curveTo(462, 125, 458, 146, 468, 170);
        
        g2d.setStroke(new BasicStroke(0));
        g2d.setColor(new Color(110, 226, 73));
        g2d.fill(body1);
        
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(110, 226, 73));
        g2d.fill(body);
        
        g2d.setColor(Color.BLACK);
        g2d.draw(body);
        
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(21, 58, 15));
        g2d.fill(ear);
        
        shadow1.moveTo(119, 134);
        shadow1.quadTo(169, 130, 198, 167);
        shadow1.quadTo(182, 110, 119, 134);
        
        shadow1.moveTo(273, 158);
        shadow1.quadTo(409, 147, 471, 217);
        shadow1.quadTo(415, 114, 273, 158);
        
        shadow1.moveTo(476, 86);
        shadow1.quadTo(533, 91, 545, 148);
        shadow1.quadTo(562, 88, 476, 86);
        
        g2d.setStroke(new BasicStroke(0));
        g2d.setColor(new Color(138, 232, 108));
        g2d.fill(shadow1);

        // MOUSTACHE
        moust.moveTo(232, 397);
        moust.quadTo(167, 451, 158, 544);
        moust.quadTo(175, 510, 185, 505);
        moust.quadTo(194, 526, 179, 542);
        moust.quadTo(204, 539, 222, 501);
        moust.quadTo(216, 534, 223, 542);
        moust.quadTo(251, 549, 271, 542);
        moust.quadTo(281, 542, 285, 527);
        moust.quadTo(291, 536, 282, 548);
        moust.quadTo(303, 537, 303, 515);
        moust.quadTo(309, 524, 307, 536);
        moust.quadTo(308, 547, 334, 541);
        moust.quadTo(345, 524, 347, 495);
        moust.quadTo(361, 544, 369, 545);
        moust.quadTo(397, 553, 414, 545);
        moust.quadTo(410, 530, 410, 519);
        moust.quadTo(419, 544, 429, 545);
        moust.quadTo(462, 549, 485, 542);
        moust.quadTo(509, 534, 488, 498);
        moust.quadTo(512, 515, 526, 536);
        moust.quadTo(535, 503, 458, 397);
        
        g2d.setStroke(new BasicStroke(5));
        g2d.setColor(new Color(233, 99, 26));
        g2d.fill(moust);
        g2d.setColor(new Color(127, 36, 7));
        g2d.draw(moust);
        
        shadow2.moveTo(239, 392);
        shadow2.lineTo(223, 408);
        shadow2.curveTo(295, 468, 395, 459, 465, 410);
        shadow2.lineTo(456, 400);

        g2d.setStroke(new BasicStroke(0));
        g2d.setColor(new Color(163, 69, 18));
        g2d.fill(shadow2);
        
        moust1.moveTo(245, 402);
        moust1.quadTo(225, 430, 213, 468);
        moust1.quadTo(234, 425, 251, 406);
        
        moust1.moveTo(257, 411);
        moust1.quadTo(250, 424, 245, 449);
        moust1.quadTo(253, 426, 263, 413);
        
        moust1.moveTo(314, 430);
        moust1.lineTo(317, 456);
        moust1.quadTo(320, 446, 319, 430);
        
        moust1.moveTo(396, 427);
        moust1.quadTo(414, 460, 422, 499);
        moust1.quadTo(418, 460, 403, 427);
        
        moust1.moveTo(429, 418);
        moust1.quadTo(440, 433, 450, 453);
        moust1.quadTo(443, 432, 433, 417);

        moust1.moveTo(439, 413);
        moust1.quadTo(464, 439, 478, 474);
        moust1.quadTo(466, 438, 444, 410);
        
        g2d.setStroke(new BasicStroke(0));
        g2d.setColor(new Color(127, 36, 7));
        g2d.fill(moust1);
        
        // NOSE
        nose.moveTo(207, 345);
        nose.curveTo(217, 189, 474, 189, 484, 345);
        nose.curveTo(494, 455, 197, 455, 207, 345);
        
        noseL.moveTo(295, 305);
        noseL.curveTo(293, 310, 275, 310, 269, 341);
        noseL.curveTo(261, 381, 328, 381, 330, 343);
        noseL.quadTo(335, 320, 328, 290);
        noseL.curveTo(315, 275, 304, 302, 295, 305);
        
        noseR.moveTo(363, 300);
        noseR.quadTo(353, 330, 371, 358);
        noseR.quadTo(399, 374, 418, 349);
        noseR.quadTo(423, 331, 411, 318);
        noseR.curveTo(407, 308, 395, 306, 388, 287);
        noseR.quadTo(370, 273, 363, 300);
                
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(165, 233, 0));
        g2d.fill(nose);
        g2d.setColor(new Color(81, 153, 9));
        g2d.draw(nose);
        
        g2d.setStroke(new BasicStroke(1));
        g2d.setColor(new Color(21, 58, 15));
        g2d.fill(noseL);
        g2d.fill(noseR);
        
        // EYES
        Ellipse2D eyeL = new Ellipse2D.Double(70, 290, 120, 120);
        Ellipse2D eyeR = new Ellipse2D.Double(500, 290, 120, 120);
        Ellipse2D eyebL = new Ellipse2D.Double(104, 338, 17, 17);
        Ellipse2D eyebR = new Ellipse2D.Double(547, 326, 17, 17);
        
        eyebrL.moveTo(123, 278);
        eyebrL.curveTo(129, 284, 140, 261, 151, 265);
        eyebrL.curveTo(164, 263, 168, 286, 177, 284);
        eyebrL.curveTo(189, 292, 179, 238, 155, 239);
        eyebrL.curveTo(131, 236, 107, 283, 123, 278);
        
        eyebrR.moveTo(530, 260);
        eyebrR.curveTo(544, 265, 555, 284, 559, 278);
        eyebrR.curveTo(572, 272, 550, 240, 532, 236);
        eyebrR.curveTo(503, 232, 496, 289, 508, 281);
        eyebrR.curveTo(515, 280, 520, 257, 530, 260);
        
        eyeLS.moveTo(80, 376);
        eyeLS.quadTo(100, 445, 140, 449);
        eyeLS.quadTo(181, 445, 188, 419);
        eyeLS.quadTo(194, 414, 190, 365);
        eyeLS.quadTo(144, 455, 80, 376);
        
        eyeRS.moveTo(500, 359);
        eyeRS.quadTo(488, 415, 497, 423);
        eyeRS.quadTo(503, 441, 537, 445);
        eyeRS.quadTo(582, 457, 608, 377);
        eyeRS.quadTo(548, 460, 500, 359);
        
        g2d.setStroke(new BasicStroke(0));
        g2d.setColor(new Color(85, 121, 169));
        g2d.fill(eyeLS);
        g2d.fill(eyeRS);
        
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(255, 255, 255));
        g2d.fill(eyeL);
        g2d.fill(eyeR);
        g2d.setColor(new Color(242, 242, 242));
        g2d.fill(eyebrL);
        g2d.fill(eyebrR);
        
        g2d.setColor(new Color(73, 123, 34));
        g2d.draw(eyeL);
        g2d.draw(eyeR);
        
        g2d.setStroke(new BasicStroke(0));
        g2d.setColor(new Color(0, 0, 0));
        g2d.fill(eyebL);
        g2d.fill(eyebR);
        
        g2d.setStroke(new BasicStroke(4));
        g2d.setPaint(new GradientPaint(75, 75, new Color(126, 159, 117), 
                105, 105, new Color(121, 95, 134), true));
        g2d.draw(eyebrL);
        g2d.draw(eyebrR);
        
        // SHADOWS
        shadow3.moveTo(323, 245);
        shadow3.quadTo(421, 251, 465, 330);
        shadow3.quadTo(440, 230, 323, 245);
        
        shadow4.moveTo(226, 295);
        shadow4.quadTo(206, 427, 446, 399);
        shadow4.curveTo(399, 437, 149, 449, 226, 295);
        
        shadow5.moveTo(71, 392);
        shadow5.curveTo(70, 646, 440, 630, 602, 516);
        shadow5.curveTo(565, 620, -5, 684, 71, 392);
        
        g2d.setStroke(new BasicStroke(0));
        g2d.setColor(new Color(211, 255, 20));
        g2d.fill(shadow3);
        
        g2d.setStroke(new BasicStroke(0));
        g2d.setColor(new Color(132, 186, 0));
        g2d.fill(shadow4);
        
        g2d.setStroke(new BasicStroke(0));
        g2d.setColor(new Color(87, 181, 57));
        g2d.fill(shadow5);
    }
    
    public static void main(String[] args) {
        MoustachePig op = new MoustachePig();
        op.setTitle("Old Pig by Philip Bryan B. Datoon (4IT-D)");
        op.setSize(670, 650);
        op.setVisible(true);
    }
}