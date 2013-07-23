package ICS8_Project;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.geom.GeneralPath;

/**
 * 
 * @author Datoon, Philip Bryan B.
 * @author Section 4ITD
 * 
 */

public class Abra extends Frame {
    Abra() {
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
        GeneralPath head = new GeneralPath();
        GeneralPath head2 = new GeneralPath();
        GeneralPath nose = new GeneralPath();
        GeneralPath body = new GeneralPath();
        GeneralPath tw1 = new GeneralPath();
        GeneralPath tw2 = new GeneralPath();
        GeneralPath tw3 = new GeneralPath();
        GeneralPath tw4 = new GeneralPath();
        GeneralPath tw5 = new GeneralPath();
        GeneralPath tw6 = new GeneralPath();
        GeneralPath tw7 = new GeneralPath();
        GeneralPath tw8 = new GeneralPath();
        
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2d.setStroke(new BasicStroke(0));

        tw7.moveTo(238,302);
        tw7.lineTo(234,321);
        tw7.lineTo(225,326);
        tw7.curveTo(133,320,110,230,172,149);
        tw7.curveTo(102,177,55,260,104,314);
        tw7.lineTo(98,318);
        tw7.lineTo(112,331);
        tw7.lineTo(123,373);
        tw7.lineTo(110,388);
        tw7.lineTo(98,378);
        tw7.lineTo(80,349);
        tw7.lineTo(46,345);
        tw7.lineTo(37,351);
        tw7.lineTo(59,369);
        tw7.lineTo(70,393);
        tw7.lineTo(76,402);
        tw7.lineTo(86,409);
        tw7.lineTo(110,475);
        tw7.lineTo(128,492);
        tw7.lineTo(135,502);
        tw7.lineTo(133,514);
        tw7.lineTo(127,529);
        tw7.lineTo(120,529);
        tw7.lineTo(151,529);
        tw7.lineTo(165,522);
        tw7.lineTo(172,499);
        tw7.lineTo(184,485);
        tw7.lineTo(183,471);
        tw7.lineTo(178,465);
        tw7.lineTo(196,457);
        tw7.lineTo(212,462);
        tw7.lineTo(233,454);
        tw7.lineTo(237,446);
        tw7.lineTo(249,444);
        tw7.lineTo(282,459);
        tw7.lineTo(294,463);
        tw7.lineTo(312,454);
        tw7.quadTo(340,471,368,450);
        tw7.lineTo(386,455);
        tw7.quadTo(390,479,422,483);
        tw7.lineTo(434,493);
        tw7.quadTo(425,505,447,527);
        tw7.quadTo(480,509,473,494);
        tw7.lineTo(479,478);
        tw7.lineTo(486,442);
        tw7.lineTo(494,414);
        tw7.lineTo(505,389);
        tw7.quadTo(503,358,511,328);
        tw7.quadTo(473,350,467,387);
        tw7.lineTo(452,383);
        tw7.quadTo(473,360,455,350);
        tw7.lineTo(459,300);
        tw7.lineTo(253,272);
        tw7.lineTo(238,302);
        
        g2d.setColor(new Color (212,174,57));
        g2d.fill(tw7);
        
        tw8.moveTo(270,339);
        tw8.lineTo(289,348);
        tw8.quadTo(322,332,359,352);
        tw8.quadTo(394,349,412,330);
        tw8.lineTo(420,332);
        tw8.lineTo(421,301);
        tw8.lineTo(301,285);
        tw8.lineTo(272,311);
        tw8.quadTo(265,320,270,339);
        
        g2d.setColor(new Color (144,127,118));
        g2d.fill(tw8);
        
        tw4.moveTo(227,249);
        tw4.quadTo(213,258,213,294);
        tw4.quadTo(237,312,295,282);
        
        tw4.moveTo(465,204);
        tw4.quadTo(517,209,530,268);
        tw4.quadTo(457,353,393,277);
        tw4.lineTo(397,256);
        
        g2d.setColor(new Color (111,100,96));
        g2d.fill(tw4);
        
        tw1.moveTo(287,416);
        tw1.quadTo(280,426,283,445);
        tw1.quadTo(287,454,300,458);
        tw1.quadTo(306,460,309,454);
        tw1.lineTo(307,449);
        tw1.quadTo(291,433,287,415);
        
        tw1.moveTo(367,424);
        tw1.quadTo(363,439,369,451);
        tw1.quadTo(378,450,382,456);
        tw1.lineTo(384,447);
        tw1.quadTo(377,441,391,408);
        
        tw1.moveTo(278,290);
        tw1.quadTo(271,299,272,312);
        tw1.lineTo(285,315);
        tw1.lineTo(309,297);
        tw1.lineTo(295,283);
        tw1.lineTo(278,290);
        
        tw1.moveTo(341,297);
        tw1.quadTo(367,304,378,324);
        tw1.quadTo(418,320,421,311);
        tw1.lineTo(421,302);
        tw1.lineTo(393,277);
        tw1.lineTo(397,254);
        tw1.lineTo(383,259);
        tw1.quadTo(348,297,341,297);
        
        g2d.setColor(Color.black);
        g2d.fill(tw1);
        
        tw2.moveTo(145,273);
        tw2.quadTo(109,272,99,307);
        tw2.quadTo(101,315,109,315);
        tw2.quadTo(116,310,123,317);
        tw2.quadTo(137,297,161,299);
        tw2.quadTo(146,289,145,273);
        
        tw2.moveTo(260,267);
        tw2.quadTo(237,281,229,301);
        tw2.quadTo(220,301,214,294);
        tw2.lineTo(213,280);
        tw2.quadTo(227,283,238,256);
        tw2.closePath();
        
        tw2.moveTo(435,236);
        tw2.lineTo(414,273);
        tw2.quadTo(473,288,524,254);
        tw2.quadTo(524,237,510,229);
        tw2.quadTo(513,236,474,243);
        tw2.quadTo(464,248,462,239);
        tw2.quadTo(460,230,453,223);
        tw2.quadTo(444,235,435,236);
        
        g2d.setColor(new Color (144,127,118));
        g2d.fill(tw2);
        
        tw3.moveTo(110,287);
        tw3.lineTo(124,313);
        tw3.quadTo(128,304,134,303);
        tw3.lineTo(122,278);
        tw3.quadTo(115,280,110,287);
        
        tw3.moveTo(213,282);
        tw3.quadTo(229,283,240,256);
        tw3.lineTo(227,250);
        tw3.quadTo(214,260,213,282);
        
        tw3.moveTo(463,204);
        tw3.quadTo(492,202,510,229);
        tw3.quadTo(513,238,474,245);
        tw3.quadTo(464,250,460,239);
        tw3.quadTo(458,230,450,223);
        tw3.quadTo(469,213,463,204);
        
        g2d.setColor(new Color (209,198,183));
        g2d.fill(tw3);
        
        g2d.setStroke(new BasicStroke(3));
        
        // HEAD
        head.moveTo(447,60);
        head.quadTo(449,97,436,152);
        head.lineTo(461,196);
        head.quadTo(470,210,454,223);
        head.quadTo(427,244,385,259);
        head.lineTo(350,295);
        head.quadTo(322,302,310,298);
        head.lineTo(296,282);
        head.lineTo(229,250);
        head.quadTo(219,242,219,228);
        head.quadTo(225,183,238,161);
        head.moveTo(228,181);
        head.quadTo(214,153,204,123);
        head.quadTo(198,110,201,99);
        head.quadTo(211,96,226,99);
        head.lineTo(275,111);
        head.lineTo(304,100);
        head.quadTo(343,90,362,95);
        head.lineTo(417,67);
        head.quadTo(434,58,447,60);
        
        head2.moveTo(296,282);
        head2.lineTo(296,277);
        
        // EYES
        head2.moveTo(240,204);
        head2.quadTo(279,213,296,246);
        head2.moveTo(344,239);
        head2.quadTo(351,197,396,184);
        
        // EAR (l)
        head2.moveTo(238,161);
        head2.lineTo(208,118);
        
        //EAR (r)
        head2.moveTo(436,76);
        head2.quadTo(419,89,410,126);
        head2.quadTo(416,138,425,146);
        
        g2d.setColor(new Color (212,174,57));
        g2d.fill(head);
        g2d.setColor(Color.black);
        g2d.draw(head);
        g2d.draw(head2);
        
        tw5.moveTo(372,271);
        tw5.quadTo(315,249,298,277);
        tw5.lineTo(298,281);
        tw5.lineTo(310,296);
        tw5.quadTo(324,303,350,293);
        
        g2d.setStroke(new BasicStroke(0));
        g2d.setColor(new Color (247,227,125));
        g2d.fill(tw5);
        
        g2d.setStroke(new BasicStroke(3));
        
        //NOSE
        nose.moveTo(309,278);
        nose.lineTo(315,285);
        nose.moveTo(337,285);
        nose.curveTo(337,278,341,279,341,272);
        
        g2d.setColor(Color.black);
        g2d.draw(nose);
        
        // BODY
        body.moveTo(227,249);
        body.quadTo(213,258,213,294);
        body.quadTo(237,312,295,282);
        body.moveTo(465,204);
        body.quadTo(517,209,530,268);
        body.quadTo(457,353,393,277);
        body.lineTo(397,256);
        
        body.moveTo(421,302);
        body.lineTo(420,332);
        body.moveTo(458,314);
        body.lineTo(455,349); //
        body.moveTo(452,347);
        body.lineTo(460,355); //
        body.quadTo(464,373,452,380); //
        body.quadTo(459,387,468,387); //
        body.quadTo(478,347,511,328);//
        body.quadTo(502,358,506,389);
        body.curveTo(481,427,483,485,472,495);//
        body.moveTo(463,478);
        body.quadTo(488,509,447,528);
        body.curveTo(419,500,440,484,438,477);
        body.moveTo(433,493);
        body.lineTo(414,473);
        body.quadTo(430,426,428,387);
        body.quadTo(409,354,433,318);
        body.quadTo(457,331,452,380);
        
        body.moveTo(422,334);
        body.lineTo(412,329);
        body.quadTo(380,352,332,358);
        body.moveTo(327,353);
        body.quadTo(379,401,349,432);
        body.quadTo(366,430,386,410);
        body.quadTo(412,411,428,396);
        body.moveTo(422,483);
        body.curveTo(379,477,371,434,400,410);
        body.moveTo(386,457);
        body.curveTo(381,449,347,451,346,433);
        body.moveTo(363,427);
        body.quadTo(357,439,366,449);
        body.quadTo(340,469,310,454);
        body.quadTo(301,440,307,433);
        body.moveTo(359,400);
        body.curveTo(346,398,348,427,335,436);
        body.moveTo(349,432);
        body.curveTo(340,431,324,443,314,440);
        body.moveTo(345,422);
        body.lineTo(355,422);
        body.moveTo(314,440);
        body.quadTo(273,383,217,374);
        body.quadTo(202,358,212,341);
        body.quadTo(224,320,247,318);
        body.quadTo(263,338,293,350);
        body.lineTo(325,352);
        body.moveTo(290,348);
        body.quadTo(322,330,359,352);
        body.moveTo(276,291);
        body.quadTo(266,312,269,336);
        body.moveTo(238,303);
        body.quadTo(236,309,235,320);
        
        // TAIL
        body.moveTo(227,325);
        body.curveTo(133,320,110,230,172,149);
        body.curveTo(102,177,55,260,104,314);
        body.moveTo(142,273);
        body.quadTo(109,272,99,307);
        body.moveTo(158,299);
        body.quadTo(135,296,123,314);
        
        body.moveTo(98,317);
        body.lineTo(116,314);
        body.quadTo(142,320,151,333);
        body.curveTo(170,380,169,455,183,471);
        body.quadTo(184,477,184,485);
        body.quadTo(167,502,165,522);
        body.quadTo(147,530,128,528);
        body.curveTo(125,514,151,510,111,476);
        body.quadTo(90,401,76,402);
        body.curveTo(68,396,67,375,58,368);
        body.lineTo(37,352);
        body.lineTo(44,346);
        body.quadTo(63,343,81,350);
        body.quadTo(88,370,110,387);
        body.moveTo(99,394);
        body.quadTo(116,388,122,372);
        body.moveTo(123,380);
        body.curveTo(128,370,110,346,114,332);
        body.lineTo(98,317);
        
        body.moveTo(168,397);
        body.quadTo(189,397,191,376);
        body.quadTo(222,364,251,395);
        body.lineTo(251,417);
        body.lineTo(232,453);
        body.lineTo(214,462);
        body.quadTo(190,450,180,465);
        
        body.moveTo(235,447);
        body.quadTo(245,438,282,460);
        body.quadTo(301,462,310,454);
        body.quadTo(325,450,328,441);
        body.moveTo(310,454);
        body.quadTo(291,433,283,406);
        
        g2d.setColor(Color.black);
        g2d.draw(body);
        
        tw6.moveTo(211,126);
        tw6.lineTo(230,174);
        tw6.lineTo(237,161);
        tw6.lineTo(211,126);
        
        tw6.moveTo(430,87);
        tw6.quadTo(417,101,412,127);
        tw6.lineTo(425,144);
        tw6.quadTo(437,102,430,87);
        
        g2d.setStroke(new BasicStroke(0));
        g2d.setColor(new Color (247,227,125));
        g2d.fill(tw6);
    }
    
    public static void main(String[] args) {
        Abra abra = new Abra();
        abra.setTitle("Pokemon Abra by Philip Bryan B. Datoon (4IT-D)");
        abra.setSize(550, 550);
        abra.setVisible(true);
    }
}