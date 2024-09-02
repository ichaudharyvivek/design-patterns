package com.app.creational.main;

import java.util.Random;

import com.app.creational.pattern.abstract_factory.app.*;
import com.app.creational.pattern.abstract_factory.chair.Chair;
import com.app.creational.pattern.abstract_factory.factories.*;
import com.app.creational.pattern.abstract_factory.sofa.Sofa;
import com.app.creational.pattern.abstract_factory.table.Table;

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
		// Execute app:Application methods
		Application app = configureApplication();
		app.createFurniture();

		// Or run independently
		System.out.println("\n");
		FurnitureFactory f = new ArtDecoFurnitureFactory();
		Chair fc = f.createChair();
		Sofa fs = f.createSofa();
		Table ft = f.createTable();

		fc.watch();
		fs.relax();
		ft.eat();
	}
}
