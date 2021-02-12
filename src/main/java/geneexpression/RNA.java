package geneexpression;

public class RNA {

  private String sequence;

  public RNA(String sequence) {
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
