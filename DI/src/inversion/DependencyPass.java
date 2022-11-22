package inversion;

public class DependencyPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//方法一
//		CH ch = new CH();
//		OpenAndClose openAndClose = new OpenAndClose();
//		openAndClose.open(ch);
//		openAndClose.close(ch);
//		System.out.println("---------------------------");
//		KJ kj = new KJ();
//		openAndClose.open(kj);
//		openAndClose.close(kj);

		//方法二：使用构造函数，在抽象类内部进行传值
//		CH ch = new CH();
//		KJ kj = new KJ();
//		OpenAndClose openAndClose = new OpenAndClose(ch);
//		openAndClose.open();
//		openAndClose.close();
//		OpenAndClose openAndClose1 = new OpenAndClose(kj);
//		openAndClose1.open();
//		openAndClose1.close();
		//方法三：使用setter函数进行注入
		CH ch = new CH();
		KJ kj = new KJ();
		OpenAndClose openAndClose = new OpenAndClose();
		openAndClose.setTv(ch);
		openAndClose.open();
		openAndClose.close();
		openAndClose.setTv(kj);
		openAndClose.open();
		openAndClose.close();



	}

}
class CH implements ITV{
	@Override
	public void play() {
		System.out.println("打开CH电视机");
	}

	@Override
	public void stop() {
		System.out.println("关闭CH电视机");
	}
}
class KJ implements ITV{

	@Override
	public void play() {
		System.out.println("打开KJ电视机");
	}

	@Override
	public void stop() {
		System.out.println("关闭KJ电视机");

	}
}


//方法一：使用接口进行传递
/*
interface IOpenAndClose {
	public void open(ITV tv);
	public void close(ITV tv);
}

interface ITV {
	public void play();
	public void stop();
}
class OpenAndClose implements IOpenAndClose{
	public void open(ITV tv) {
		tv.play();
	}

	@Override
	public void close(ITV tv) {
		tv.stop();
	}
}
*/
// 方法二：使用构造方法
/*
interface IOpenAndClose {
	public void open();
	public void close();
}
interface ITV {
	public void play();

	public void stop();
}
class OpenAndClose implements IOpenAndClose{
	public ITV tv;
	public OpenAndClose(ITV tv){
		this.tv = tv;
	}
	public void open(){
		this.tv.play();
	}

	@Override
	public void close() {
		this.tv.stop();
	}
}
*/
// 方法三：setter方法
interface IOpenAndClose {
	public void open();
	public void close();
	public void setTv(ITV tv);
}

interface ITV {
	public void play();
	public void stop();
}

class OpenAndClose implements IOpenAndClose {
	private ITV tv;

	public void setTv(ITV tv) {
		this.tv = tv;
	}

	public void open() {
		this.tv.play();
	}

	@Override
	public void close() {
		this.tv.stop();
	}
}