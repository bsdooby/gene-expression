package geneexpression;

public class DNA {
	
	 private static String defaultSequence =
			  "TTCCACCGATGGTCCA"
			+ "TACAGTTTTAAGCTAT"
			+ "CTGGTCGGCGCGGCTG"
			+ "TTGCATGTCATGCAAC"
			+ "CACGAAACCAGAACCC"
			+ "TCTTCATGGGTCAATA"
			+ "ACATAACTAACTAGTT"
			+ "AGTGTACGCTTTAAGT"
			+ "CTCTTTCTTTCGGTCG"
			+ "ACCGACGCCAACGACT"
			+ "GCCGCAGGGTATGACC"
			+ "CTTGCACCAACGGCTC"
			+ "GTACTCAGGAACTAAC"
			+ "CTCTACGGTCGGATAG";
	
	private String sequence;
	
	public DNA() {
		this.sequence = DNA.defaultSequence;
	}
	
	public DNA(String sequence) {
		this.sequence = sequence;
	}
	
	public String getSequence() {
		return sequence;
	}
	
	@Override
	public String toString() {
		return getSequence();
	}
}
