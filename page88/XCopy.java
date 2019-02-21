package page88;

public class XCopy {
	public static void main(String[] args) {
		int orig = 42;
		//this.  //ko dùng được this trong static method => tao obj de su dung ham 
		XCopy x = new XCopy();
		int y = x.go(orig);
		System.out.println(orig + " " + y);
		
		///////////////////////////////
		//thử foreach
		XCopy[] arr = new XCopy[7];
		System.out.println(arr[0]);//null
		for (XCopy tmp: arr) {
			tmp = new XCopy();
		}
		System.out.println(arr[0]);//null
		
		for (int i = 0; i<7; i++) {
			arr[i] = new XCopy();
		}
		System.out.println(arr[0]); //page88.XCopy@15db9742
	}
	int go(int arg) {
		arg = arg*2;
		return arg;
	}
}
