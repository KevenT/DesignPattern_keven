package com.keven.dp.singleton;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��20�� ����11:04:32 
* ˵�� :
*/
public class Singleton1 {
	/* ����˽�о�̬ʵ������ֹ�����ã��˴���ֵΪnull��Ŀ����ʵ���ӳټ��� */
	private static Singleton1 instance = null;

	/* ˽�й��췽������ֹ��ʵ���� */
	private Singleton1() {
	}
//�������÷����������ϻ������½�����Ϊÿ�ε���getInstance()����Ҫ�Զ�����������ʵ�ϣ�ֻ���ڵ�һ�δ��������ʱ����Ҫ������֮��Ͳ���Ҫ��
	/* ��̬���̷���������ʵ�� */
	/*
	public static synchronized SingletonTest1 getInstance() {
		if (instance == null) {
			instance = new SingletonTest1();
		}
		return instance;
	}
	*/
	
	/*
	 * ������ģ���������������Javaָ���д�������͸�ֵ�����Ƿֿ����еģ�Ҳ����˵instance = new Singleton();����Ƿ�����ִ�еġ�����JVM������֤�������������Ⱥ�˳��Ҳ����˵�п���JVM��Ϊ�µ�Singletonʵ������ռ䣬Ȼ��ֱ�Ӹ�ֵ��instance��Ա��Ȼ����ȥ��ʼ�����Singletonʵ���������Ϳ��ܳ����ˣ�������A��B�����߳�Ϊ����
a>A��B�߳�ͬʱ�����˵�һ��if�ж�
b>A���Ƚ���synchronized�飬����instanceΪnull��������ִ��instance = new Singleton();
c>����JVM�ڲ����Ż����ƣ�JVM�Ȼ�����һЩ�����Singletonʵ���Ŀհ��ڴ棬����ֵ��instance��Ա��ע���ʱJVMû�п�ʼ��ʼ�����ʵ������Ȼ��A�뿪��synchronized�顣
d>B����synchronized�飬����instance��ʱ����null������������뿪��synchronized�鲢��������ظ����ø÷����ĳ���
e>��ʱB�̴߳���ʹ��Singletonʵ����ȴ������û�б���ʼ�������Ǵ������ˡ�
	 * 
	 */
/*
	public static SingletonTest1 getInstance() {
		if (instance == null) {
			synchronized (instance) {
				if (instance == null) {
					instance = new SingletonTest1();
				}
			}
		}
		return instance;
	}
	
	*/
	

	/* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */
	public Object readResolve() {
		return instance;
	}
}
