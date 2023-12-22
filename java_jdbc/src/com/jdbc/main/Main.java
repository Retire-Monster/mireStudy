package com.jdbc.main;

import com.jdbc.controller.MainController;
import com.jdbc.controller.고객Controller;

public class Main {

	private MainController mainC = new MainController();
	private 고객Controller 고객C = new 고객Controller();

	public static void main(String[] args) {
		Main main = new Main();
		
		while(true) {
			main.start();
		}
	}
	
	private void start() {
		String meun = mainC.meun();

		switch (meun) {
		case "1":
			고객C.list();
			break;
		case "2":
			System.out.println("==============================\n\n\t서비스 준비중입니다\n\n==============================");
			break;
		case "3":
			System.out.println("==============================\n\n\t서비스 준비중입니다\n\n==============================");
			break;
		case "q":
		case "Q":
			System.out.println("==============================\n\n\t프로그램을 종료합니다\n\n==============================");
			System.exit(0);
			break;
		default:
			System.out.println("메뉴선택이 올바르지 않습니다.\n");
		}
	}
}
