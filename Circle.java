class hi{
	int r;
	int Area;
	public int Ar(int r){
		this.r=r;
		Area=(int)(3.14*(r*r));
		return Area;
	}
	
}
class Circle{
	public static void main(String args[]){
		hi s = new hi();
		System.out.println("Area of Circle : "+s.Ar(4));
	}
}