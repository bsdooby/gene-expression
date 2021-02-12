package geneexpression;

import java.util.ArrayList;
import java.util.HashMap;

public class Ribosome {

  public static class Codon {

    private char first;
    private char second;
    private char third;

    public Codon(String triplet) {
      first = triplet.charAt(0);
      second = triplet.charAt(1);
      third = triplet.charAt(2);
    }

    public Codon(char first, char second, char third) {
      this.first = first;
      this.second = second;
      this.third = third;
    }

    @Override
    public String toString() {
      return first + "" + second + "" + third;
    }

    @Override
    public boolean equals(Object object) {
      return object.toString().equals(this.toString());
    }

    @Override
    public int hashCode() {

      byte firstAsByte = (byte) first;
      byte secondAsByte = (byte) second;
      byte thirdAsByte = (byte) third;

      String hashString = "" + firstAsByte + secondAsByte + thirdAsByte;
      return Integer.parseInt(hashString);
    }
  }

  private ArrayList<Ribosome.Codon> codons = new ArrayList<Ribosome.Codon>();

  // lookup table to match codons and amino acids with their single letter id
  public static HashMap<Codon, String> aminoAcids;
  static {
    aminoAcids = new HashMap<>();

    // Ala
    aminoAcids.put(new Ribosome.Codon("GCU"), "Ala / A");
    aminoAcids.put(new Ribosome.Codon("GCC"), "Ala / A");
    aminoAcids.put(new Ribosome.Codon("GCA"), "Ala / A");
    aminoAcids.put(new Ribosome.Codon("GCG"), "Ala / A");

    // Arg
    aminoAcids.put(new Ribosome.Codon("CGU"), "Arg / R");
    aminoAcids.put(new Ribosome.Codon("CGC"), "Arg / R");
    aminoAcids.put(new Ribosome.Codon("CGA"), "Arg / R");
    aminoAcids.put(new Ribosome.Codon("CGG"), "Arg / R");
    aminoAcids.put(new Ribosome.Codon("AGA"), "Arg / R");
    aminoAcids.put(new Ribosome.Codon("AGG"), "Arg / R");

    // Asn
    aminoAcids.put(new Ribosome.Codon("AAU"), "Asn / N");
    aminoAcids.put(new Ribosome.Codon("AAC"), "Asn / N");

    // Asp
    aminoAcids.put(new Ribosome.Codon("GAU"), "Asp / D");
    aminoAcids.put(new Ribosome.Codon("GAC"), "Asp / D");

    // Cys
    aminoAcids.put(new Ribosome.Codon("UGU"), "Cys / C");
    aminoAcids.put(new Ribosome.Codon("UGC"), "Cys / C");

    // Gln
    aminoAcids.put(new Ribosome.Codon("CAA"), "Gln / Q");
    aminoAcids.put(new Ribosome.Codon("CAG"), "Gln / Q");

    // Glu
    aminoAcids.put(new Ribosome.Codon("GAA"), "Glu / E");
    aminoAcids.put(new Ribosome.Codon("GAG"), "Glu / E");

    // Gly
    aminoAcids.put(new Ribosome.Codon("GGU"), "Gly / G");
    aminoAcids.put(new Ribosome.Codon("GGC"), "Gly / G");
    aminoAcids.put(new Ribosome.Codon("GGA"), "Gly / G");
    aminoAcids.put(new Ribosome.Codon("GGG"), "Gly / G");

    // His
    aminoAcids.put(new Ribosome.Codon("CAU"), "His / H");
    aminoAcids.put(new Ribosome.Codon("CAC"), "His / H");

    // Ile
    aminoAcids.put(new Ribosome.Codon("AUU"), "Ile / I");
    aminoAcids.put(new Ribosome.Codon("AUC"), "Ile / I");
    aminoAcids.put(new Ribosome.Codon("AUA"), "Ile / I");

    // Leu
    aminoAcids.put(new Ribosome.Codon("UUA"), "Leu / L");
    aminoAcids.put(new Ribosome.Codon("UUG"), "Leu / L");
    aminoAcids.put(new Ribosome.Codon("CUU"), "Leu / L");
    aminoAcids.put(new Ribosome.Codon("CUC"), "Leu / L");
    aminoAcids.put(new Ribosome.Codon("CUA"), "Leu / L");
    aminoAcids.put(new Ribosome.Codon("CUG"), "Leu / L");

    // Lys
    aminoAcids.put(new Ribosome.Codon("AAA"), "Lys / K");
    aminoAcids.put(new Ribosome.Codon("AAG"), "Lys / K");

    // Met
    aminoAcids.put(new Ribosome.Codon("AUG"), "Met / M");

    // START
    // aminoAcids.put(new Ribosome.Codon("AUG"), "START");

    // Phe
    aminoAcids.put(new Ribosome.Codon("UUU"), "Phe / F");
    aminoAcids.put(new Ribosome.Codon("UUC"), "Phe / F");

    // Pro
    aminoAcids.put(new Ribosome.Codon("CCU"), "Pro / P");
    aminoAcids.put(new Ribosome.Codon("CCC"), "Pro / P");
    aminoAcids.put(new Ribosome.Codon("CCA"), "Pro / P");
    aminoAcids.put(new Ribosome.Codon("CCG"), "Pro / P");

    // Ser
    aminoAcids.put(new Ribosome.Codon("UCU"), "Ser / S");
    aminoAcids.put(new Ribosome.Codon("UCC"), "Ser / S");
    aminoAcids.put(new Ribosome.Codon("UCA"), "Ser / S");
    aminoAcids.put(new Ribosome.Codon("UCG"), "Ser / S");
    aminoAcids.put(new Ribosome.Codon("AGU"), "Ser / S");
    aminoAcids.put(new Ribosome.Codon("AGC"), "Ser / S");

    // Thr
    aminoAcids.put(new Ribosome.Codon("ACU"), "Thr / T");
    aminoAcids.put(new Ribosome.Codon("ACC"), "Thr / T");
    aminoAcids.put(new Ribosome.Codon("ACA"), "Thr / T");
    aminoAcids.put(new Ribosome.Codon("ACG"), "Thr / T");

    // Trp
    aminoAcids.put(new Ribosome.Codon("UGG"), "Trp / W");

    // Tyr
    aminoAcids.put(new Ribosome.Codon("UAU"), "Tyr / Y");
    aminoAcids.put(new Ribosome.Codon("UAC"), "Tyr / Y");

    // Val
    aminoAcids.put(new Ribosome.Codon("GUU"), "Val / V");
    aminoAcids.put(new Ribosome.Codon("GUC"), "Val / V");
    aminoAcids.put(new Ribosome.Codon("GUA"), "Val / V");
    aminoAcids.put(new Ribosome.Codon("GUG"), "Val / V");

    // START
    // AUG

    // STOP
    aminoAcids.put(new Ribosome.Codon("UAA"), "STOP");
    aminoAcids.put(new Ribosome.Codon("UGA"), "STOP");
    aminoAcids.put(new Ribosome.Codon("UAG"), "STOP");
  }

  private RNA rna;
  private String polypeptide = "";

  public void setRNA(RNA rna) {
    this.rna = rna;
  }

  public String getPolypeptide() {

    String sequence = rna.getSequence();

    // TODO: using a sliding window, find start codon "AUG" 
    // (a codon is a nucleotide triplet). This is the open reading frame. 
    // Then parse for the stop codons "UAG", "UGA", "UAA".
    for (int i = 0; i < sequence.length() - 2; i++) {
      if (sequence.charAt(i) == 'A' && sequence.charAt(i + 1) == 'U'
          && sequence.charAt(i + 2) == 'G') {

        // create and store the start codon
        Codon startCodon =
            new Codon(sequence.charAt(i), sequence.charAt(i + 1), sequence.charAt(i + 2));
        codons.add(startCodon);

        // parse for remaining codons
        for (int j = i + 3; j < sequence.length() - 2; j += 3) {
          Codon codon =
              new Codon(sequence.charAt(j), sequence.charAt(j + 1), sequence.charAt(j + 2));

          codons.add(codon);

          if (codon.equals(new Codon('U', 'A', 'G')) || codon.equals(new Codon('U', 'G', 'A'))
              || codon.equals(new Codon('U', 'A', 'A'))) {
            break;
          }
        }
      }
    }

    for (var codon : codons) {
      polypeptide += codon + " " + aminoAcids.get(codon) + "; ";
    }
    
    return polypeptide.trim();
  }
}
