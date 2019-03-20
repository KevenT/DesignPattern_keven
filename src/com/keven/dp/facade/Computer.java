package com.keven.dp.facade;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月20日 下午4:47:41 
* 说明 :
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
