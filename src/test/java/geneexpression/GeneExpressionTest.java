package geneexpression;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GeneExpressionTest {

  @Test
  void testDefaultDNASequence() {
    DNA dna = new DNA();
    assertEquals(dna.getSequence().length(), 224);
  }

  @Test
  void testTranscription() {
    DNA dna = new DNA("ATGATCGAATAG");
    RNApol rnap = new RNApol();
    rnap.setDNA(dna);
    RNA rna = rnap.getRNA();
    assertEquals(rna.getSequence(), "AUGAUCGAAUAG");
  }
  
  @Test
  void testRibosomeLookup() {
    assertEquals(Ribosome.aminoAcids.get(new Ribosome.Codon("AUG")), "Met / M");
    assertEquals(Ribosome.aminoAcids.get(new Ribosome.Codon("UAG")), "STOP");
    assertEquals(Ribosome.aminoAcids.get(new Ribosome.Codon("UGA")), "STOP");
    assertEquals(Ribosome.aminoAcids.get(new Ribosome.Codon("UAA")), "STOP");
  }
  
  @Test
  void testTranslation() {
    DNA dna = new DNA("CCCGATGATCGAATAGGGGC");
    RNApol rnap = new RNApol();
    rnap.setDNA(dna);
    RNA rna = rnap.getRNA();
    Ribosome ribosome = new Ribosome();
    ribosome.setRNA(rna);
    assertEquals(ribosome.getPolypeptide(), "AUG Met / M; AUC Ile / I; GAA Glu / E; UAG STOP;");
  }
}
