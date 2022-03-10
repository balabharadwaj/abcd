package SnakeandLadder;
class Jumper{
	int start;
	int end;
	public Jumper(int start,int end) {
		this.start=start;
		this.end=end;
	}
}
class snake extends Jumper{
	snake(int s,int e){
		super(s,e);
	}
	public int getEndPoint() {
		return end;
	}
}
class ladder extends Jumper{
	ladder(int s,int e){
		super(s,e);
	}
	public int getEndPoint() {
		return end;
	}
}
