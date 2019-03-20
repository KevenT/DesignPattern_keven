package com.keven.dp.facade;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��20�� ����4:47:41 
* ˵�� :
*/
public class Computer {
	private CPU cpu;
	private Memory memory;
	private Disk disk;
	
	public Computer(){
		cpu = new CPU();
		memory = new Memory();
		disk = new Disk();
	}
	
	public void startup() {
		System.out.println("strat the computer");
		cpu.startUp();
		memory.startUp();
		disk.startUp();
		System.out.println("strat the computer finished");
	}
	
	public void shutDown() {
		System.out.println("begin to close the computer");
		cpu.shutDown();
		memory.shutDown();
		disk.shutDown();
		System.out.println("computer closed");
	}

}
