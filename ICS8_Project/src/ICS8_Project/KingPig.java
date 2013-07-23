package ICS8_Project;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;

/**
 * 
 * @author Datoon, Philip Bryan B.
 * @author Section 4ITD
 * 
 */

public class KingPig extends Frame {
    KingPig() {
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
        GeneralPath crown = new GeneralPath();
        GeneralPath crownS1 = new GeneralPath();
        GeneralPath jewel1 = new GeneralPath();
        GeneralPath jewel3 = new GeneralPath();
        GeneralPath jewel1S = new GeneralPath();
        GeneralPath jewel3S = new GeneralPath();
        GeneralPath body = new GeneralPath();
        GeneralPath body1 = new GeneralPath();
        GeneralPath earL = new GeneralPath();
        GeneralPath earR = new GeneralPath();
        GeneralPath earLS = new GeneralPath();
        GeneralPath earRS = new GeneralPath();
        GeneralPath eardL = new GeneralPath();
        GeneralPath eardR = new GeneralPath();
        GeneralPath eyebrL = new GeneralPath();
        GeneralPath eyebrR = new GeneralPath();
        GeneralPath nose = new GeneralPath();
        GeneralPath noseL = new GeneralPath();
        GeneralPath noseR = new GeneralPath();
        GeneralPath noseS = new GeneralPath();
        GeneralPath mouth = new GeneralPath();
        GeneralPath shadow1 = new GeneralPath();
        GeneralPath shadow2 = new GeneralPath();
        
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        
        // CROWN
        jewel1.moveTo(350, 170);
        jewel1.curveTo(333, 170, 325, 193, 345, 201);
        jewel1.quadTo(359, 187, 350, 170);
        Ellipse2D jewelr1 = new Ellipse2D.Double(340, 176, 10, 10);
        
        Ellipse2D jewel2 = new Ellipse2D.Double(393, 176, 40, 40);
        Ellipse2D jewelr2 = new Ellipse2D.Double(413, 183, 10, 10);
        
        jewel3.moveTo(469, 202);
        jewel3.quadTo(453, 214, 461, 230);
        jewel3.curveTo(475, 231, 489, 212, 469, 202);
        Ellipse2D jewelr3 = new Ellipse2D.Double(466, 210, 10, 10);
        
        jewel1S.moveTo(342, 204);
        jewel1S.quadTo(350, 202, 353, 187);
        jewel1S.quadTo(341, 195, 342, 204);
        Ellipse2D jewel2S = new Ellipse2D.Double(390, 181, 40, 40);
        jewel3S.moveTo(459, 235);
        jewel3S.quadTo(454, 232, 458, 217);
        jewel3S.quadTo(465, 225, 459, 235);
        
        crown.moveTo(348, 38);
        crown.quadTo(359, 72, 345, 170);
        crown.curveTo(330, 168, 326, 198, 340, 201); // Blue jewel (left)
        crown.quadTo(339, 218, 330, 244);
        crown.curveTo(333, 234, 445, 264, 451, 274);
        crown.quadTo(457, 245, 464, 230);
        crown.curveTo(478, 236, 491, 210, 474, 202); // Blue jewel (right)
        crown.quadTo(485, 153, 549, 105);
        crown.quadTo(494, 117, 453, 146);
        crown.lineTo(445, 78);
        crown.lineTo(398, 134);
        crown.lineTo(348, 38);
        
        crownS1.moveTo(450, 152);
        crownS1.quadTo(425, 196, 418, 257);
        crownS1.quadTo(436, 261, 449, 272);
        crownS1.curveTo(486, 126, 509, 145, 533, 112);
        crownS1.quadTo(494, 119, 450, 152);
        
        Area jewel1A = new Area(jewel1);
        Area jewel2A = new Area(jewel2);
        Area jewel3A = new Area(jewel3);
        Area jewelr1A = new Area(jewelr1);
        Area jewelr2A = new Area(jewelr2);
        Area jewelr3A = new Area(jewelr3);
        
        jewel1A.subtract(jewelr1A);
        jewel2A.subtract(jewelr2A);
        jewel3A.subtract(jewelr3A);
        
        g2d.setStroke(new BasicStroke(7));
        g2d.setColor(new Color(255, 235, 1));
        g2d.fill(crown);
        g2d.setColor(Color.BLACK);
        g2d.draw(crown);
        
        g2d.setStroke(new BasicStroke(0));
        g2d.setColor(new Color(246, 205, 1));
        g2d.fill(crownS1);
        
        g2d.setStroke(new BasicStroke(0));
        g2d.setColor(new Color(187, 168, 4));
        g2d.fill(jewel1S);
        g2d.fill(jewel2S);
        g2d.fill(jewel3S);
        
        g2d.setStroke(new BasicStroke(0));
        g2d.setColor(new Color(23, 132, 255));
        g2d.fill(jewel1A);
        g2d.fill(jewel2A);
        g2d.fill(jewel3A);
        
        g2d.setColor(Color.WHITE);
        g2d.fill(jewelr1A);
        g2d.fill(jewelr2A);
        g2d.fill(jewelr3A);
        g2d.draw(jewelr1A);
        g2d.draw(jewelr2A);
        g2d.draw(jewelr3A);
        
        // (a) BODY
        body.moveTo(300, 244);
        body.quadTo(394, 240, 476, 289);
        body.quadTo(615, 360, 600, 545);
        body.quadTo(584, 685, 434, 708);
        body.quadTo(280, 730, 142, 689);
        body.quadTo(43, 660, 28, 530);
        body.quadTo(20, 430, 90, 344);
        body.moveTo(132, 306);
        body.quadTo(175, 270, 228, 256);
        body1.moveTo(132, 306);
        body1.quadTo(161, 257, 294, 250);
        body1.quadTo(205, 334, 99, 347);
        
        // (b) EARS
        earL.moveTo(99, 347);
        earL.curveTo(-30, 304, 110, 165, 133, 312);
        earR.moveTo(232, 260);
        earR.curveTo(161, 152, 339, 130, 294, 250);
        
        eardL.moveTo(81, 320);
        eardL.quadTo(124, 345, 114, 299);
        eardL.quadTo(103, 276, 80, 284);
        eardL.quadTo(65, 302, 81, 320);
        
        eardR.moveTo(243, 235);
        eardR.quadTo(265, 273, 281, 230);
        eardR.quadTo(280, 198, 258, 202);
        eardR.quadTo(236, 205, 243, 235);

        // DISPLAY (a) and (b)
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(110, 226, 73));
        g2d.fill(body);
        g2d.fill(earL);
        g2d.fill(earR);
        g2d.fill(body1);
        g2d.setColor(Color.BLACK);
        g2d.draw(body);
        g2d.draw(earL);
        g2d.draw(earR);
        g2d.setStroke(new BasicStroke(1));
        g2d.setColor(new Color(21, 58, 15));
        g2d.fill(eardL);
        g2d.fill(eardR);
        g2d.draw(eardL);
        g2d.draw(eardR);
        
        // SHADOWS
        Ellipse2D eyeLS = new Ellipse2D.Double(57, 465, 110, 110);
        Ellipse2D eyeRS = new Ellipse2D.Double(465, 435, 110, 110);
        Ellipse2D mouthS = new Ellipse2D.Double(215, 445, 200, 200);
        
        shadow1.moveTo(36, 547);
        shadow1.quadTo(70, 690, 303, 705);
        shadow1.quadTo(475, 700, 571, 621);
        shadow1.quadTo(529, 690, 434, 705);
        shadow1.quadTo(280, 730, 142, 684);
        shadow1.quadTo(45, 650, 36, 547);
        
        shadow2.moveTo(279, 259);
        shadow2.quadTo(550, 335, 587, 490);
        shadow2.quadTo(610, 380, 472, 295);
        shadow2.quadTo(384, 250, 279, 259);
        
        g2d.setStroke(new BasicStroke(1));
        g2d.setColor(new Color(86, 180, 58));
        g2d.fill(eyeLS);
        g2d.fill(eyeRS);
        g2d.fill(mouthS);
        g2d.fill(shadow1);
        
        g2d.setColor(new Color(137, 231, 107));
        g2d.fill(shadow2);
        
        // (c) EYES
        Ellipse2D eyeL = new Ellipse2D.Double(35, 407, 145, 145);
        Ellipse2D eyeR = new Ellipse2D.Double(445, 375, 145, 145);
        Ellipse2D eyebL = new Ellipse2D.Double(63, 468, 33, 33);
        Ellipse2D eyebR = new Ellipse2D.Double(525, 432, 33, 33);
        
        eyebrL.moveTo(85, 391);
        eyebrL.quadTo(115, 377, 148, 391);
        eyebrL.quadTo(114, 342, 85, 391);
        
        eyebrR.moveTo(445, 355);
        eyebrR.quadTo(477, 339, 512, 347);
        eyebrR.quadTo(477, 304, 445, 355);
        
        // (d) NOSE and MOUTH
        nose.moveTo(309, 331);
        nose.quadTo(405, 340, 449, 430);
        nose.quadTo(481, 532, 398, 557);
        nose.quadTo(295, 585, 221, 551);
        nose.quadTo(145, 509, 185, 412);
        nose.quadTo(235, 325, 309, 331);
        
        mouth.moveTo(221, 551);
        mouth.quadTo(321, 661, 398, 557);
        mouth.quadTo(295, 585, 221, 551);
        
        // DISPLAY (c) and (d)
        Area eyeLA = new Area(eyeL);
        Area eyeRA = new Area(eyeR);
        Area noseA = new Area(nose);
        
        eyeLA.subtract(noseA);
        eyeRA.subtract(noseA);
        
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(Color.WHITE);
        g2d.fill(eyeLA);
        g2d.fill(eyeRA);
        g2d.setColor(new Color(83, 159, 2));
        g2d.draw(eyeLA);
        g2d.draw(eyeRA);
        
        g2d.setColor(new Color(165, 233, 0));
        g2d.fill(noseA);
        g2d.setColor(new Color(141, 206, 0));
        g2d.fill(mouth);
        g2d.setColor(new Color(105, 159, 1));
        g2d.draw(noseA);
        g2d.draw(mouth);
        
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(21, 58, 15));
        g2d.fill(eyebL);
        g2d.fill(eyebR);
        g2d.draw(eyebL);
        g2d.draw(eyebR);
        
        g2d.setStroke(new BasicStroke(1));
        g2d.fill(eyebrL);
        g2d.fill(eyebrR);
        g2d.draw(eyebrL);
        g2d.draw(eyebrR);
        
        // NOSE P2
        noseL.moveTo(297, 428);
        noseL.quadTo(306, 451, 301, 484);
        noseL.quadTo(277, 522, 242, 471);
        noseL.quadTo(216, 415, 255, 415);
        noseL.quadTo(279, 415, 297, 428);
        noseR.moveTo(371, 417);
        noseR.quadTo(411, 418, 397, 455);
        noseR.lineTo(382, 477);
        noseR.quadTo(358, 510, 348, 465);
        noseR.quadTo(344, 415, 371, 417);
        
        g2d.setStroke(new BasicStroke(1));
        g2d.setColor(new Color(21, 58, 15));
        g2d.fill(noseL);
        g2d.fill(noseR);
        g2d.draw(noseL);
        g2d.draw(noseR);
        
        // SHADOWS
        noseS.moveTo(321, 341);
        noseS.quadTo(409, 395, 450, 479);
        noseS.quadTo(437, 368, 321, 341);
        
        earLS.moveTo(64, 265);
        earLS.quadTo(91, 262, 119, 292);
        earLS.quadTo(102, 237, 64, 265);
        
        earRS.moveTo(235, 185);
        earRS.quadTo(275, 173, 295, 218);
        earRS.quadTo(286, 154, 235, 185);
        
        g2d.setStroke(new BasicStroke(1));
        g2d.setColor(new Color(182, 237, 50));
        g2d.fill(noseS);
        
        g2d.setColor(new Color(137, 231, 107));
        g2d.fill(earLS);
        g2d.fill(earRS);
    }
    
    public static void main(String[] args) {
        KingPig kp = new KingPig();
        kp.setTitle("King Pig by Philip Bryan B. Datoon (4IT-D)");
        kp.setSize(640, 735);
        kp.setVisible(true);
    }
}