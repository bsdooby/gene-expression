package geneexpression;

public class RNApol {

  private DNA dna;

  public void setDNA(DNA dna) {
    this.dna = dna;
  }

  public String getDNA() {
    return dna.getSequence();
  }

  public RNA getRNA() {

    String sequence = "";

    // TODO: implement thymine/uracil exchange
    for (int i = 0; i < this.dna.getSequence().length(); ++i) {
      if (this.dna.getSequence().charAt(i) == 'T') {
        sequence += "U";
      } else {
        sequence += this.dna.getSequence().charAt(i);
      }
    }
    return new RNA(sequence);
  }
}
