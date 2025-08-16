

    import java.applet. *;
    import java.awt. *;

    public class Household extends Applet
    {
    public void paint (Graphics g)
    {
    //scenery
    g.setColor (Color.cyan);
    g.fillRect (0,0,900,500);

    //sun
    g.setColor (Color.orange);
    g.fillArc (100,20,80,80,0,360);
    g.drawLine (95,55,75,55);
    g.drawLine (140,105,140,125);
    g.drawLine (140,15,140,0);
    g.drawLine (185,60,205,60);
    g.drawLine (105,35,85,25);
    g.drawLine (120,20,105,5);
    g.drawLine (100,80,80,90);
    g.drawLine (115,100,100,120);
    g.drawLine (175,5,160,20);
    g.drawLine (205,25,175,35);
    g.drawLine (205,90,175,80);
    g.drawLine (175,120,160,100);

    //cloud
    g.setColor (Color.white);
    g.fillArc (60,130,80,50,0,360);
    g.fillArc (90,120,70,50,0,360);
    g.fillArc (130,130,80,50,0,360);

    g.fillArc (210,50,80,50,0,360);
    g.fillArc (240,30,70,50,0,360);
    g.fillArc (260,40,80,50,0,360);

    g.fillArc (700,50,80,50,0,360);
    g.fillArc (720,40,70,50,0,360);
    g.fillArc (760,50,80,50,0,360);

    //home
    g.setColor (Color.red);
    g.fillRect (600,150,150,300);
    g.fillRect (430,130,160,20);
    g.fillRect (600,130,150,20);
    g.setColor (Color.black);
    g.fillRect (750,70,10,380);
    g.setColor (Color.red);
    g.fillRect (400,150,200,300);
    g.setColor (Color.black);
    g.fillRect (400,150,10,300);
    g.setColor (Color.black);
    g.fillRect (400,300,350,10);
    g.setColor (Color.black);
    g.fillRect (590,130,10,320);
    g.setColor (Color.black);
    g.fillRect (430,130,10,20);
    g.setColor (Color.black);
    g.fillRect (400,140,40,10);
    g.setColor (Color.yellow);
    g.fillRect (250,300,150,150);
    g.setColor (Color.black);
    g.fillRect (250,440,500,10);

    // the top door
    g.setColor (Color.yellow);
    g.drawRect (460,200,80,8);
    g.fillRect (460,208,40,91);
    g.fillRect (500,208,41,91);
    g.setColor (Color.white);
    g.fillRect (463,211,36,85);
    g.fillRect (503,211,35,85);

    // the bottom door
    g.setColor (Color.yellow);
    g.fillArc (460,336,81,25,0,180);
    g.fillRect (460,348,40,91);
    g.fillRect (500,348,41,91);
    g.setColor (Color.white);
    g.fillRect (463,353,36,85);
    g.fillRect (503,353,35,85);

    //the garage door
    g.setColor (Color.blue);
    g.fillRect (615,333,120,15);
    g.setColor (Color.white);
    g.fillRect (617,335,116,11);
    g.setColor (Color.blue);
    g.fillRect (621,335,2,11);
    g.fillRect (626,335,2,11);
    g.fillRect (631,335,2,11);
    g.fillRect (636,335,2,11);
    g.fillRect (641,335,2,11);
    g.fillRect (646,335,2,11);
    g.fillRect (651,335,2,11);
    g.fillRect (656,335,2,11);
    g.fillRect (661,335,2,11);
    g.fillRect (666,335,2,11);
    g.fillRect (671,335,2,11);
    g.fillRect (676,335,2,11);
    g.fillRect (681,335,2,11);
    g.fillRect (686,335,2,11);
    g.fillRect (691,335,2,11);
    g.fillRect (696,335,2,11);
    g.fillRect (701,335,2,11);
    g.fillRect (706,335,2,11);
    g.fillRect (711,335,2,11);
    g.fillRect (716,335,2,11);
    g.fillRect (721,335,2,11);
    g.fillRect (726,335,2,11);
    g.fillRect (731,335,2,11);

    g.setColor (Color.blue);
    g.fillRect (615,348,120,92);
    g.setColor (Color.red);
    g.fillRect (618,350,25,41);
    g.fillRect (648,350,25,41);
    g.fillRect (678,350,25,41);
    g.fillRect (707,350,25,41);
    g.fillRect (618,395,25,40);
    g.fillRect (648,395,25,40);
    g.fillRect (678,395,25,40);
    g.fillRect (707,395,25,40);

    g.setColor (Color.black);
    g.fillRect (400,270,200,7);
    g.fillRect (415,270,5,30);
    g.fillRect (425,270,5,30);
    g.fillRect (435,270,5,30);
    g.fillRect (445,270,5,30);
    g.fillRect (455,270,5,30);
    g.fillRect (465,270,5,30);
    g.fillRect (475,270,5,30);
    g.fillRect (485,270,5,30);
    g.fillRect (495,270,5,30);
    g.fillRect (505,270,5,30);
    g.fillRect (515,270,5,30);
    g.fillRect (525,270,5,30);
    g.fillRect (535,270,5,30);
    g.fillRect (545,270,5,30);
    g.fillRect (555,270,5,30);
    g.fillRect (565,270,5,30);
    g.fillRect (575,270,5,30);
    g.fillRect (585,270,5,30);

    //page
    g.setColor (Color.green);
    g.fillRect (0,450,900,100);

    //tree
    g.setColor (Color.red);
    int a [] = {30,40,50,60};
    int b [] = {450,300,300,450};
    g.fillPolygon (a, b, 4);
    g.setColor (Color.green);
    g.fillArc (-10,300,120,80,0,360);
    g.fillArc (-10,270,130,80,0,360);
    g.fillArc (-10,240,110,100,0,360);
    g.fillArc (0,210,60,90,0,360);

    //car
    g.setColor (Color.blue);
    g.fillArc (75,415,140,60,0,180);
    g.fillArc (105,400,80,60,0,180);

    //glass
    g.setColor (Color.white);
    g.fillArc (120,404,52,37,0,90);
    g.fillArc (113,404,55,36,90,90);
    g.fillArc (85,427,7,7,0,360);
    g.fillArc (197,427,7,7,0,360);

    g.setColor (Color.black);
    g.fillArc (100,430,20,20,0,360);
    g.fillArc (160,430,20,20,0,360);
    g.setColor (Color.white);
    g.fillArc (104,434,12,12,0,360);
    g.fillArc (164,434,12,12,0,360);

    //roof
    g.setColor (Color.blue);
    int c [] = {380,500,620};
    int d [] = {130,60,130};
    g.fillPolygon (c, d, 3);
    g.setColor (Color.black);
    int x [] = {380,500,620};
    int y [] = {130,60,130};
    g.drawPolygon (x, y, 3);
    g.setColor (Color.blue);
    int m [] = {515,750,750,620};
    int n [] = {70,70,130,130};
    g.fillPolygon (m, n, 4);
    g.setColor (Color.black);
    int q [] = {515,750,750,620};
    int z [] = {70,70,130,130};
    g.drawPolygon (q, z, 4);
    g.setColor (Color.blue);
    int k [] = {240,400,400};
    int l [] = {300,200,300};
    g.fillPolygon (k, l, 3);
    g.setColor (Color.black);
    int r [] = {240,400,400};
    int s [] = {300,200,300};
    g.drawPolygon (r, s, 3);

    // top window
    g.setColor (Color.yellow);
    g.drawRect (650,180,60,8);
    g.fillRect (650,188,30,50);
    g.fillRect (680,188,31,50);
    g.setColor (Color.white);
    g.fillRect (652,190,26,46);
    g.fillRect (682,190,26,46);

    // bottom window
    g.setColor (Color.blue);
    g.drawRect (295,335,60,8);
    g.drawRect (295,335,60,10);
    g.fillRect (295,345,30,50);
    g.fillRect (325,345,31,50);
    g.setColor (Color.white);
    g.fillRect (298,347,26,46);
    g.fillRect (327,347,26,46);
    }
    }
    
        /* <applet code = "Household.class" height = 1000 width =1000>  
       </applet> */
