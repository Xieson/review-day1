package com.clp.temo;
/*
 * 定义Usbslot类去实现Iusb接口,并实现接口里所默认的抽象Slot方法
 * 实现步骤
 * 1:实现接口
 * 2:定义插槽(插入实现功能)
 * 3:实现功能
 * 增加条件:只有6个usb插槽
 * */
public class Usbslot implements Iusb{
	//1:实现方法
	public void Slot(){//实现接口里的抽象方法,(注意:接口里方法默认修饰符是public abstract
//												所以类实现接口里方法时,修饰符要大于或者等于接口里的修饰符)
		System.out.println("usb插槽已经插入");//输入一句话,调用方法时好区分		
						}
	/*
	 * 增加只有六6个usb插槽
	 * 思路:当有多个数据的时候可以用数组
	 * 		usb并不是固定的值时,可以直接定义元素的个数
	 * 
	 * */
	private static Iusb[] arr=new Iusb[6];
	private static int i=0;//设置i为第一个接口
	public static void unmber(Iusb y){//定义方法usb插口
		if(i==arr.length){//当接口插满时执行以下代码
			System.out.println("usb接口已满");
		}else{//否则执行这下面的代码,当else后只有一句代码时,{}可以不写
		arr[i]=y;//把每次创建的Iusb对象存入Iusb数组里
		i++;//接口号加一
		}
	
	}
	//2:定义方法插入插槽
		public static void insert(){//定义usb插入并工作的插槽
			for(Iusb b:arr){//通过foreach把Iusb里的每个元素取出
				if(b!=null){//判断Iusb是否有元素,当有元素时执行b.Slot语句
				b.Slot();
				}else{//当b里没有元素时执行这行代码
					System.out.println("请插入usb接口");
				}
			}
			
		}
	public static void main(String[] args){
		Iusb a=new Usbslot();//Usbslot继承了IUsb产生了多态
		Usbslot.unmber(a);//创建usb插入的接口
		Usbslot.unmber(a);
		Usbslot.unmber(a);
		Usbslot.unmber(a);
		Usbslot.unmber(a);
		Usbslot.unmber(a);
		Usbslot.unmber(a);
		Usbslot.unmber(a);
		Usbslot.unmber(a);
		Usbslot.insert();//插入接口的usb工作
		
		
	}
									}
