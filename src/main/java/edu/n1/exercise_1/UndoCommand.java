package edu.n1.exercise_1;

import java.util.*;

public class UndoCommand {

	private static UndoCommand instance = null;
	private ArrayList<String> commandList;

	public static UndoCommand getInstance() {

		if (instance == null) {
			instance = new UndoCommand();
		}

		return instance;
	}

	private UndoCommand() {
		commandList = new ArrayList<String>();
	}

	public void addCommand(String command) {
		commandList.add(command);
	}

	public void showAll() {

		for (String string : commandList) {
			System.out.println(string);
		}
	}

	public void clearAll() {
		commandList = new ArrayList<String>();
	}

	public void undo() {
		commandList.remove(commandList.size() - 1);

	}
}
