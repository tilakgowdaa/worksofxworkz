package com.xworkz.TaskOnEncapsulation.boot;

import com.xworkz.TaskOnEncapsulation.FrameInsidePackage;
import com.xworkz.TaskOnEncapsulation.Frames;

public class FramesRunner {

	public static void main(String[] args) {
			Frames frames=new Frames();
			FrameInsidePackage frame=new FrameInsidePackage();
			frame.use(frames);
			System.out.println(frames.getColour());
	}

}
