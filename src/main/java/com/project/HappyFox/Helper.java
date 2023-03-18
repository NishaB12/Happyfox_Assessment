package com.project.HappyFox;

import java.io.IOException;


public class Helper {

	public static Reader getInstance() throws IOException {

		Reader cr = new Reader();

		return cr;

	}

	private Helper() {

	}

}
