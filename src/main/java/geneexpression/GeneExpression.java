package geneexpression;

public class GeneExpression {

  public static void main(String... args) {

    // provide synthetic DNA
    DNA dna = new DNA("CAATGATCGAAACGAACAAGGGTAGATAGTG");
    // System.out.println("DNA: " + dna);

    RNApol rnap = new RNApol();
    rnap.setDNA(dna);

    // TODO: implement transcription (see rnap.getRNA())
    RNA mRNA = rnap.getRNA();

    Ribosome ribosome = new Ribosome();
    ribosome.setRNA(mRNA);

    // TODO: implement translation (see ribosome.getPolypeptide())
    String polypeptide = ribosome.getPolypeptide();
    System.out.println(polypeptide);
  }
}
