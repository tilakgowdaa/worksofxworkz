package com.xworkz.TaskOnEncapsulation;

public class FrameInsidePackage {
	public int newPrice=500;
	public Frames frames;

	public void use(Frames frames) {
		frames.setFrames("Metal", 'L', true, 2, 400, "black", "Hang", "round", 390, "things", false);

		System.out.println(frames.brand);
		System.out.println(frames.material);
		System.out.println(frames.weight);
		System.out.println(frames.colour);
		System.out.println(frames.price);
		System.out.println(frames.Quality);
		System.out.println(frames.quantity);
		System.out.println(frames.mountingType);
		System.out.println(frames.damage);
		System.out.println(frames.size);
		System.out.println(frames.shape);
	}

}
