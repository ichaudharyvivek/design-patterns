package com.app.creational.main;

import java.util.Random;

import com.pattern.creational.abstract_factory.app.Application;

import com.pattern.creational.abstract_factory.factories.FurnitureFactory;
import com.pattern.creational.abstract_factory.factories.ModernFurnitureFactory;
import com.pattern.creational.abstract_factory.factories.ArtDecoFurnitureFactory;
import com.pattern.creational.abstract_factory.factories.VictorianFurnitureFactory;

public class AbstractFactoryApp {
	private static Application configureApplication() {
		FurnitureFactory factory = null;

		String randomFactoryName = getRandom(new String[] { "modern", "art-deco", "victorian" });
		System.out.println("Producing `" + randomFactoryName + "` furniture 🛠️...");

		if (randomFactoryName.equalsIgnoreCase("art-deco")) {
			factory = new ArtDecoFurnitureFactory();

		} else if (randomFactoryName.equalsIgnoreCase("modern")) {
			factory = new ModernFurnitureFactory();

		} else if (randomFactoryName.equalsIgnoreCase("victorian")) {
			factory = new VictorianFurnitureFactory();

		}

		return new Application(factory);
	}

	private static String getRandom(String[] array) {
		int rnd = new Random().nextInt(array.length);
		return array[rnd];
	}

	public static void main(String[] args) {
		Application app = configureApplication();

		// Execute app:Application methods
		app.createFurniture();
	}
}
