package Distance;

public class DistanceSum {
	private int feet;
	private float inches;
	
	public int getFeet() {
		return feet;
	}
	public float getInches() {
		return inches;
	}
	void set(int feet,float inches) {
		this.feet = feet;
		this.inches = inches;
	}
	void disp() {
		System.out.println(getFeet()+" feet "+getInches()+" inches");
	}
	DistanceSum add(DistanceSum d1,DistanceSum d2) {
		d1.feet=d1.getFeet()+d2.getFeet();
		d1.inches=d1.getInches()+d2.getInches();
		if(d1.inches>=12) {
			d1.feet+=d1.inches/12;
			d1.inches=d1.inches%12;
		}
		return d1;
	}
	@Override
	public String toString() {
		return "DistanceSum [feet=" + feet + ", inches=" + inches + "]";
	}
	
}

