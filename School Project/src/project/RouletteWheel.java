package project;

import java.io.File;
import java.util.Random;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.event.EventListenerList;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;

 
/**
 *  <p>
 *  A random number generator in the form of a graphical roulette wheel.
 *  </p><p>
 *  CVS $Id: RouletteWheel.java,v 1.2 2006/04/13 20:10:07 tom Exp $
 *  </p>
 *  
 *  @author  Tom Coppeto
 *  @version $Revision: 1.2 $
 */

public class RouletteWheel 
    extends Canvas {

    private Image wheel;
    private Image ball;
    private int number = 0;
    private int duration = 8000;
    private int refresh;
    private int elapsed;
    private int radius;
    private int wheel_inner_radius = 73;
    private int wheel_outer_radius = 123;
    private int wheel_center_x = 145;
    private int wheel_center_y = 145;
    
    private int ball_position = 0;
    private int[] positions = {3,15,34,22,5,17,32,20,7,11,30,26,9,28,37,2,14,35,23,4,16,33,21,6,18,31,19,8,12,29,25,10,27,38,1,13,36,24};
    private int angle_of_first_position = 0;
    
    private Random random = new Random();
    private AnimationThread thread;
    private AudioInputStream audio;
    private SourceDataLine audioLine;
    private EventListenerList listeners = new EventListenerList();

    private boolean isSpinning = true;


    /**
     *  Constructs the <code>RouletteWheel</code>.
     */

    public RouletteWheel() {

	/*
	 * load the roulette image
	 */

	try {
	    MediaTracker media = new MediaTracker(this);
	    wheel = Toolkit.getDefaultToolkit().getImage("/Users/tom/release/lib/files/icons/RouletteWheel.gif");
	    media.addImage(wheel, 0);
	    ball = Toolkit.getDefaultToolkit().getImage("/Users/tom/release/lib/files/icons/RouletteBall.gif");
	    media.addImage(ball, 0);
	    media.waitForID(0);  
	} catch (Exception e) {
	    e.printStackTrace();
	}

	setSize(wheel.getWidth(null), wheel.getHeight(null));
	this.ball_position = this.random.nextInt(this.positions.length);

	try {

	    File file = new File("\\Users\\user\\Desktop\\cartoon001.wav");
	    audio = AudioSystem.getAudioInputStream(file);
	    DataLine.Info dataLineInfo = new DataLine.Info(SourceDataLine.class, audio.getFormat());
	    audioLine = (SourceDataLine) AudioSystem.getLine(dataLineInfo);

	} catch (Exception e) {
	    e.printStackTrace();
	}
    }


    /**
     *  Spins the wheel.
     */

    public void spin() {

	/*
	 * launch a new thread
	 */

	this.thread = new AnimationThread();

	/*
	 * select a random starting position
	 */

	this.ball_position = this.random.nextInt(this.positions.length);

	/*
	 * place the ball on the outer part of the wheel
	 */

	this.radius  = wheel_outer_radius;

	/*
	 * start the animation thread
	 */

	this.refresh = 20;
	this.elapsed = 0;
	this.thread.animate(this, refresh);
	this.thread.start();

	/*
	 * play the sound effect
	 */
	
	new AudioThread().start();
    }


    /**
     *  Tests if the wheen is spinning.
     *
     *  @return <code>true</code> if the wheel is spinning (the ball 
     *  is in play)
     */

    public boolean isSpinning() {
	return this.isSpinning;
    }


    /**
     *  Gets the number the ball landed on.
     *
     *  @return the number
     */

    public String getNumber() {
	if (this.number <= 36) 
	    return (Integer.toString(this.number));
	else if (this.number == 37) 
	    return ("0");
	else if (this.number == 38)
	    return ("00");
	    
	return ("unknown");
    }


    /**
     *  Gets the color of a number on the wheel (american).
     *
     *  @param number specifies the number
     *  @return the name of the color
     */

    public static String getColor(final String number) {

	if (number.equals("1"))
	    return ("red");
	if (number.equals("2"))
	    return ("black");
	if (number.equals("3"))
	    return ("red");
	if (number.equals("4"))
	    return ("black");
	if (number.equals("5"))
	    return ("red");
	if (number.equals("6"))
	    return ("black");
	if (number.equals("7"))
	    return ("red");
	if (number.equals("8"))
	    return ("black");
	if (number.equals("9"))
	    return ("red");
	if (number.equals("10"))
	    return ("black");
	if (number.equals("11"))
	    return ("black");
	if (number.equals("12"))
	    return ("red");
	if (number.equals("13"))
	    return ("black");
	if (number.equals("14"))
	    return ("red");
	if (number.equals("15"))
	    return ("black");
	if (number.equals("16"))
	    return ("red");
	if (number.equals("17"))
	    return ("black");
	if (number.equals("18"))
	    return ("red");
	if (number.equals("19"))
	    return ("red");
	if (number.equals("20"))
	    return ("black");
	if (number.equals("21"))
	    return ("red");
	if (number.equals("22"))
	    return ("black");
	if (number.equals("23"))
	    return ("red");
	if (number.equals("24"))
	    return ("black");
	if (number.equals("25"))
	    return ("red");
	if (number.equals("26"))
	    return ("black");
	if (number.equals("27"))
	    return ("red");
	if (number.equals("28"))
	    return ("black");
	if (number.equals("29"))
	    return ("black");
	if (number.equals("30"))
	    return ("red");
	if (number.equals("31"))
	    return ("black");
	if (number.equals("32"))
	    return ("red");
	if (number.equals("33"))
	    return ("black");
	if (number.equals("34"))
	    return ("red");
	if (number.equals("35"))
	    return ("black");
	if (number.equals("36"))
	    return ("red");
	if (number.equals("0"))
	    return ("green");
	if (number.equals("00"))
	    return ("green");

	return("purple");
    }


    /**
     *  Paints the window which includes the placement of the wheel
     *  image and the placement of the ball. 
     *
     *  @param g
     */

    public void paint(Graphics g) {
	double x = 0;
	double y = 0;

	/*
	 * The ball moves one slot counter clockwise at a time.
	 */

	if (this.isSpinning == true) {

	    // move ball one slot counter clockwise
	    if (++this.ball_position > (this.positions.length - 1))
		this.ball_position = 0;
	}

	
	/*
	 * Calculate the new ball position relative to the image.
	 * The image is mostly circular so a little trig is required.
	 */

	double angle = (double) ((this.angle_of_first_position) - (360 * this.ball_position / this.positions.length)); 
	
	/*
	 * As it turns out, the image isn't perfectly round.
	 */

	if (this.ball_position > 12)
	    angle += 2;
	if (this.ball_position == 37)
	    angle -= 2;
	
	angle = Math.toRadians(angle);
	
	x = ((double) this.radius * Math.sin(angle)) + this.wheel_center_x;
	y = this.wheel_center_y - ((double) this.radius * Math.cos(angle));


	/*
	 * Do some poor man's physics to make it seem real.
	 */

	if (this.isSpinning == true) {

	    this.elapsed += this.refresh;

	    /*
	     * add a little friction to slow the ball
	     */

	    if (this.elapsed > this.duration * .2)
		this.refresh += 2;

	    /*
	     * At some point, the ball slips to the inside
	     */

	    if (this.elapsed > this.duration * .85) {
		this.radius = this.wheel_inner_radius + this.random.nextInt(20) -10;
	    }
	    
	    /*
	     * We're done. 
	     */

	    if (this.elapsed > this.duration) {
		this.isSpinning = false;
		this.refresh   += 3;
		this.radius     = this.wheel_inner_radius;
		this.number     = this.positions[this.ball_position];

		/*
		 * stop the animation thread
		 */

		thread.finished();

		/*
		 * send an action event to the caller
		 */

		ActionEvent event = new ActionEvent(this, 0, "roulette");
		sendEvents(event);
	    } else {
		thread.animate(this, this.refresh);
	    }
	}

	/*
	 * draw the wheel
	 */

	if (wheel != null) {
	    g.drawImage(wheel, 0, 0, this);
	} 

	/*
	 * draw the ball
	 */

	if (ball != null) {
	    g.drawImage(ball, (int) x, (int) y, this);
	}

	return;
    }


    /**
     *  Adds an <code>ActionListener</code>.
     *
     *  @param listener the listener to add
     */

    public void addActionListener(ActionListener listener) {
	this.listeners.add(ActionListener.class, listener);
    }


    /**
     *  Removes an <code>ActionListener</code>.
     *
     *  @param listener the listener to remove
     */

    public void removeActionListener(ActionListener listener) {
	this.listeners.remove(ActionListener.class, listener);
    }


    /*
     *  sends an event to all the registered listeners
     */

    private void sendEvents(ActionEvent event) {
	Object[] listeners = this.listeners.getListenerList();

	for (int i = 0; i < listeners.length; i++) {
	    if (listeners[i] == ActionListener.class) {
		((ActionListener) listeners[i+1]).actionPerformed(event);
	    }
	}
	return;
    }


    /*
     * An inner class to perform the animation.
     */

    class AnimationThread extends Thread {
	private RouletteWheel wheel;
	private int delay;
	private boolean running = true;

	public void animate(final RouletteWheel wheel, final int delay) {
	    this.wheel = wheel;
	    this.delay = delay;
	}

	public void finished() {
	    this.running = false;
	}

	public void run() {
	    while (this.running == true) {
		try {
		    sleep(this.delay);
		    this.wheel.repaint();
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	}
    }


    /*
     *  An inner class to play sound.
     */

    class AudioThread extends Thread {
	byte tempBuffer[] = new byte[10000];

	public void run() {
	    try {
		audioLine.open(audio.getFormat());
		audioLine.start();

		int cnt;
		while ((cnt = audio.read(tempBuffer,0,tempBuffer.length)) != -1) {
		    if (cnt > 0) {
			audioLine.write(tempBuffer, 0, cnt);
		    }
		}

		audioLine.drain();
		audioLine.close();
	    } catch (Exception e) {
		e.printStackTrace();
		System.exit(0);
	    }
	}
    }
}
