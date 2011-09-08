package com.google.code.p.bladerotor.client;

import java.util.ArrayList;

import com.google.code.p.bladerotor.shared.Blade;
import com.google.code.p.bladerotor.shared.Rotor;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.SimplePanel;

public class RotorPanel extends SimplePanel {
	private ArrayList<BladePanel> myBlades = new ArrayList<BladePanel>();
	private BladePanelFactory myBladePanelFactory = new BladePanelFactory();
	private BladePanel myFocus;
	private Rotor myRotor;
	private int myVisibleNum;
	private int myMoveTime = 2000; //in milliseconds
	private int myMoveStep = 100;

	private int firstPos = 0;
	private int xOffset = 0;
	private int xResetCount = 0;

	private int height = 600;
	private int width = 1000;

	public RotorPanel() {
		// TODO add a rotor in somehow

		setVisibleNum(7);
	}

	public void setRotor(Rotor rotor) {

		myRotor = rotor;

		for (int i = 0; i < myRotor.size(); i++) {
			Blade nextBlade = myRotor.getBlade(i);
			BladePanel myBlade = myBladePanelFactory.getPanel(nextBlade);
			myBlades.add(myBlade);
		}
	}

	public void setVisibleNum(int num) {
		myVisibleNum = num;
	}

	public void moveBlades() {

		double width = getWidth();

		double margin = getLargestWidth() / 2;

		double interval = (width - 2 * margin) / (myVisibleNum - 1);

		for (int i = 0; i < myBlades.size(); i++) {
			if (i < myVisibleNum) {
				int newX = (int)(margin + (double)(myVisibleNum - 1 - i) * interval);

				moveBlade(i, newX, i);
			} else {
				// TODO park
			}
		}
	}

	private void moveBlade(final int index, int x, int delayNum) {

		int totalSteps = myMoveTime/myMoveStep;

		int delayTime = myMoveStep * delayNum;

		for (int i = 1; i <= totalSteps; i++) {
			final int tempX = i * x / totalSteps;
			final int tempY = getElipseY(tempX);//i * y / totalSteps;
			Timer timer = new Timer() {
				@Override
				public void run() {
					setBladePos(index, tempX, tempY);
				}
			};
			timer.schedule(delayTime + i * myMoveStep);
		}

		final int tempX = x;
		final int tempY = getElipseY(x);
		Timer timer = new Timer() {
			@Override
			public void run() {
				setBladePos(index, tempX, tempY);
			}
		};
		timer.schedule(delayTime + myMoveTime);
	}

	private void setBladePos(int index, int x, int y) {
		int newX = x - myBlades.get(index).getCenterXOffset();
		int newY = y - myBlades.get(index).getCenterYOffset();

		myBlades.get(index).setPopupPosition(newX, newY);
	}

	private int getElipseY(double x) {
		double margin =  getLargestWidth() / 2;
		double height = getHeight() - (2 * margin);
		double width = getWidth();
		double offsetY = getLargestHeight() / 2;
		double offsetX = getLargestWidth() / 2;

		height -= offsetY;
		width -= offsetX;

		if (x > width) {
			// TODO throw something!
			double delta = x - 2 * (x - width);
			x = width;
		}

		double y = Math.sqrt((height * height) * (1 - ((x * x) / (width * width))) );

		y += margin;

		return (int)y;
	}

	private int getLargestWidth() {
		int largest = 0;

		for (int i = 0; i < myBlades.size(); i++) {
			int size = myBlades.get(i).getOffsetWidth();
			if (size > largest) {
				largest = size;
			}
		}

		return largest;
	}

	private int getLargestHeight() {
		int largest = 0;

		for (int i = 0; i < myBlades.size(); i++) {
			int size = myBlades.get(i).getOffsetHeight();
			if (size > largest) {
				largest = size;
			}
		}

		return largest;
	}

	public void setMoveTime(int moveTime) {
		myMoveTime = moveTime;
	}

	public int getMoveTime() {
		return myMoveTime;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
}
