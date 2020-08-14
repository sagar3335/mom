package mom1;

import supermost.ParentClassCon;

public class ChildCon extends ParentClassCon {

	protected ChildCon() {
		System.out.println("Child Constuctor");
	}
	public static void main(String[] args) {
//		new ParentClassCon();
		new ChildCon();
	}

}
