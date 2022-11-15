
public class ChemicalElement implements Comparable<ChemicalElement> {
	int atomicNumber;
	String atomicName;
	String atomicformula;
	float atomicWeight;
	 ChemicalElement left;
	 ChemicalElement right;
	public ChemicalElement(int atomicNumber, String atomicName, String atomicformula, float atomicWeight) {
		super();
		this.atomicNumber = atomicNumber;
		this.atomicName = atomicName;
		this.atomicformula = atomicformula;
		this.atomicWeight = atomicWeight;
	}
	@Override
	public String toString() {
		return "ChemicalElement [atomicNumber=" + atomicNumber + ", atomicName=" + atomicName + ", atomicformula="
				+ atomicformula + ", atomicWeight=" + atomicWeight + "]";
	}
	
	public int compareTo(ChemicalElement o) {
		System.out.println("Comparing"+atomicNumber+"with"+o.atomicNumber);
		return Integer.compare(atomicNumber, o.atomicNumber);
	}
	
	public ChemicalElement() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
