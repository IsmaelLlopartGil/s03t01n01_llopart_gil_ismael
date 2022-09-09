package edu.n1.exercise_1;

import com.liche.utils.io.Input;

public class App {

	private void run() {
		String userCommand = "";

		do {
			userCommand = Input.readString("Introdueix una opció: ");

			switch (userCommand) {

			case "undo":
				UndoCommand.getInstance().undo();
				break;

			case "delete":
				UndoCommand.getInstance().clearAll();
				break;

			case "history":
				UndoCommand.getInstance().showAll();
				break;

			default:
				UndoCommand.getInstance().addCommand(userCommand);
			}

		} while (!userCommand.equals("exit"));
		
		OtherClass otherClass = new OtherClass();
		otherClass.run();
	}

	
	
	public static void main(String[] args) {
		new App().run();
	}

}
